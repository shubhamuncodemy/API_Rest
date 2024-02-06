package rest_day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class PostAuto {
	
	int id;
	@Test(priority=1)
	void createData()
	{
		
		JSONObject object_name = new JSONObject();
		object_name.put("Addres", "Testing");
		object_name.put("School_name", "ABCD");
		
		given()
		     .contentType("application/json")
		     .body(object_name.toString())
		     
		    .when() 
		         .post("http://localhost:3000/Students")
		         .jsonPath().getInt("id");
		
	}
	
	@Test(priority=2,dependsOnMethods={"createData"})
	void updateData()
	{
		
		JSONObject object_name = new JSONObject();
		object_name.put("Addres", "New Delhi");
		object_name.put("School_name", "SM");
		
		given()
		     .contentType("application/json")
		     .body(object_name)
		     
		    .when() 
		         .put("http://localhost:3000/Students/"+id)
		         
		         
		     .then()
		          .statusCode(201)
		          .log();
		
	}
	
	
	
	

}
