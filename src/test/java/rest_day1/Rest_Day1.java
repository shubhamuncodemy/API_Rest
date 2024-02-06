package rest_day1;

import org.testng.Assert;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Rest_Day1 {
	
	@Test
	void testcase_1()
	{
	Response asrt_var= given()
		
		.when()
		 .get("https://reqres.in/api/users?page=2");
	
	Assert.assertEquals(asrt_var.getStatusCode(),200); 
	Assert.assertEquals(asrt_var.header("Connection"),"keep-alive");
	
	
		
	}
	
	@Test
	void testcase_2()
	{
		when()
		 .get("https://reqres.in/api/users")
		
		.then()
		 .statusCode(200)
		 .log().all();
		
	}
	
	

}
