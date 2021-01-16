package test;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/users")
public class UserRestService 
{
	
	UserRepository userRepo=new UserRepository();
	
	//Demo @PathParam
	@GET
	@Path("{id}")
	public Response getUserByID(@PathParam("id") String id) 
	{
		return Response.status(200).entity("getUserByID Method is called , id : " + id).build();
	}
	
/*	//Returning multiple objects list in JSON Form
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUserList() 
	{
		return userRepo.getUsersList();
	}*/
	
	//Returning multiple objects list in multiple Forms whichever is requested
	@GET
	@Path("/list")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<User> getUserXMLList() 
	{
		return userRepo.getUsersList();
	}
	
	//Returning one user based on name
	@GET
	@Path("user/{name}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User getUserByName(@PathParam("name") String name)
	{
		return userRepo.getUser(name);
	}
	
	//Create a new user
	@POST
	@Path("/create")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public User createUser(User u) 
	{
		userRepo.create(u);
		System.out.println(u);
		return u;
	}
	
	@DELETE
	@Path("/delete/{name}")
	public User deleteUser(@PathParam("name") String name)
	{
		User u = userRepo.getUser(name);
		userRepo.delete(name);
		System.out.println();
		return u;
	}
	
	@PUT
	@Path("/update")
	public User updateUser(User u)
	{
		userRepo.update(u);
		return userRepo.getUser(u.getName());
	}
}
