package rest_day1;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class PathParameter {
	
	
	
	@Test (priority=1)
	void QueryPathParameter() {
	
	given()
	 .pathParam("path_parameter_1", "api")
	 .pathParam("path_parameter_2", "users")
	 .queryParam("page", 2)
	 .queryParam("id", 10)
	 
	 
	.when()
	     .get("https://reqres.in/{path_parameter_1}/{path_parameter_2}")
	
	.then()
	    .log().all();
	
	
	
	}
	
	@Test(priority=2)
	void CookiesTest() 
	{
		
	Response cookie_var = given()
		
		.when()
		  .get("https://github.com/");
	    
	     String  Cok_var = cookie_var.getCookie("_gh_sess");
	     
	     System.out.println("This is the cookie value" +Cok_var);
	     
	     
	
	
		
	}
	
	
	
	

}
