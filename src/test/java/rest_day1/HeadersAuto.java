package rest_day1;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeadersAuto {
	
	@Test
	void headerTest() {
		
	Response header_var = given()
		
		.when()
		   .get("https://github.com/");
		
	}
 	
	
	

}
