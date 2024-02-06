package rest_day1;


import org.testng.annotations.Test;

import io.restassured.response.Response;
import java.io.File;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UploadData {
	
	@Test
	void dataUploadFile() {
		
		File file_name = new File("C:\\Users\\nikhi\\OneDrive\\Desktop\\agile.jpg");
		File file_name_1 = new File("C:\\Users\\nikhi\\OneDrive\\Desktop\\test_api.txt");
		
		given()
		   .multiPart("files",file_name)
		   .multiPart("files",file_name_1)
		   .contentType("multipart/form-data")
		
		.when()
		   .post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
		 
		  .log().all();
		
	}
	
	
	
	

}
