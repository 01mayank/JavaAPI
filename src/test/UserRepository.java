package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.sql.PreparedStatement;



public class UserRepository 
{
	//List<User> users;
	Connection con = null;
	
	public UserRepository() 
	{
		/*users = new ArrayList<>();
		User u1 = new User();
		u1.setName("Mayank");
		u1.setScore(80);
		
		User u2 = new User();
		u2.setName("Amit");
		u2.setScore(90);
		
		users.add(u1);
		users.add(u2);*/
		
		String url = "jdbc:mysql://localhost:3306/RestDB";
		String user = "root";
		String password = "";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public List<User> getUsersList()
	{
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) 
			{
				User user = new User();
				user.setName(rs.getString(2));
				user.setScore(rs.getInt(3));
				list.add(user);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public User getUser(String name)
	{
		User user = new User();
		String sql = "SELECT * FROM users WHERE name='"+name+"'";
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) 
			{
				user.setName(rs.getString(2));
				user.setScore(rs.getInt(3));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return user;
	}
	
	
	public void create(User u)
	{
		String sql = "INSERT INTO users (name, score) values(?,?)";
		try 
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, u.getName());
			st.setInt(2, u.getScore());
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void update(User u)
	{
		String sql = "UPDATE users set score=? where name=?";
		try 
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, u.getScore());
			st.setString(2, u.getName());
			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void delete(String name)
	{
		String sql = "DELETE FROM users where name=?";
		try
		{
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
