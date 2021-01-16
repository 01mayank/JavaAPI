package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@Path("/hello")
public class Hello 
{
	
	/*@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello(@QueryParam("id") String bookid) 
	{
		String resource=null;
		if(bookid!=null) 
		{
			switch (bookid) 
			{
			case "bk101":
				resource="<?xml version=\"1.0\"?>\r\n" + 
						"<catalog>\r\n" + 
						"   <book id=\"bk101\">\r\n" + 
						"      <author>Gambardella, Matthew</author>\r\n" + 
						"      <title>XML Developer's Guide</title>\r\n" + 
						"      <genre>Computer</genre>\r\n" + 
						"      <price>44.95</price>\r\n" + 
						"      <publish_date>2000-10-01</publish_date>\r\n" + 
						"      <description>An in-depth look at creating applications \r\n" + 
						"      with XML.</description>\r\n" + 
						"   </book>\r\n" + 
						"</catalog>";
				break;
				
			case "bk102":
				resource="<book id=\"bk102\">\r\n" + 
						"<author>Ralls, Kim</author>\r\n" + 
						"<title>Midnight Rain</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2000-12-16</publish_date>\r\n" + 
						"<description>A former architect battles corporate zombies, an evil sorceress, and her own childhood to become queen of the world.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk103":
				resource="<book id=\"bk103\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>Maeve Ascendant</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2000-11-17</publish_date>\r\n" + 
						"<description>After the collapse of a nanotechnology society in England, the young survivors lay the foundation for a new society.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk104":
				resource="<book id=\"bk104\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>Oberon's Legacy</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2001-03-10</publish_date>\r\n" + 
						"<description>In post-apocalypse England, the mysterious agent known only as Oberon helps to create a new life for the inhabitants of London. Sequel to Maeve Ascendant.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk105":
				resource="<book id=\"bk105\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>The Sundered Grail</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2001-09-10</publish_date>\r\n" + 
						"<description>The two daughters of Maeve, half-sisters, battle one another for control of England. Sequel to Oberon's Legacy.</description>\r\n" + 
						"</book>";
				break;
			}
		}
		else
			resource = "<?xml version=\"1.0\"?>\r\n" +  
					  "<Error>Please Provide Any Book ID!</Error>";
		
		return resource;
	}*/
	
	
	//By Using Path Param (localhost:8080/JavaApi/bookid)
	@Path("{id}")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloPath(@PathParam(value = "id") String bookid) 
	{
		String resource=null;
		if(bookid!=null) 
		{
			switch (bookid) 
			{
			case "bk101":
				resource="<?xml version=\"1.0\"?>\r\n" + 
						"<catalog>\r\n" + 
						"   <book id=\"bk101\">\r\n" + 
						"      <author>Gambardella, Matthew</author>\r\n" + 
						"      <title>XML Developer's Guide</title>\r\n" + 
						"      <genre>Computer</genre>\r\n" + 
						"      <price>44.95</price>\r\n" + 
						"      <publish_date>2000-10-01</publish_date>\r\n" + 
						"      <description>An in-depth look at creating applications \r\n" + 
						"      with XML.</description>\r\n" + 
						"   </book>\r\n" + 
						"</catalog>";
				break;
				
			case "bk102":
				resource="<book id=\"bk102\">\r\n" + 
						"<author>Ralls, Kim</author>\r\n" + 
						"<title>Midnight Rain</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2000-12-16</publish_date>\r\n" + 
						"<description>A former architect battles corporate zombies, an evil sorceress, and her own childhood to become queen of the world.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk103":
				resource="<book id=\"bk103\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>Maeve Ascendant</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2000-11-17</publish_date>\r\n" + 
						"<description>After the collapse of a nanotechnology society in England, the young survivors lay the foundation for a new society.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk104":
				resource="<book id=\"bk104\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>Oberon's Legacy</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2001-03-10</publish_date>\r\n" + 
						"<description>In post-apocalypse England, the mysterious agent known only as Oberon helps to create a new life for the inhabitants of London. Sequel to Maeve Ascendant.</description>\r\n" + 
						"</book>";
				break;
				
			case "bk105":
				resource="<book id=\"bk105\">\r\n" + 
						"<author>Corets, Eva</author>\r\n" + 
						"<title>The Sundered Grail</title>\r\n" + 
						"<genre>Fantasy</genre>\r\n" + 
						"<price>5.95</price>\r\n" + 
						"<publish_date>2001-09-10</publish_date>\r\n" + 
						"<description>The two daughters of Maeve, half-sisters, battle one another for control of England. Sequel to Oberon's Legacy.</description>\r\n" + 
						"</book>";
				break;
			}
		}
		else
			resource = "<?xml version=\"1.0\"?>\r\n" +  
					  "<Error>Please Provide Any Book ID!</Error>";
		
		return resource;
	}
	
	@Path("/getjson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() 
	{
		String resource="{'book':{'book_id':bk105,'author':Corets, Eva,'title':The Sundered Grail,'genre':Fantasy,'price':5.95,'publish_date':2001-09-10,'description':The two daughters of Maeve, half-sisters, battle one another for control of England. Sequel to Oberon's Legacy.}}";
		return resource;
	}
	
	@Path("/gethtml")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() 
	{
		
		String resource="<h1>Hi Mayank, This is Hello from HTML.</h1>";
		return resource;
	}
	
}
