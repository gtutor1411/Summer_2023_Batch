package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Get {
	
	@Test(enabled=false)
	public void getTest() {
		
		given()//pre-req
		
		.when()//the action
			.get("https://restful-booker.herokuapp.com/booking/751")
		
		.then()//validation
			.statusCode(200)
			.log().all()
			.body("firstname",equalTo("Girish"));
		
	}
	
	
	
	@Test(enabled=false)
	public void getXmlResponse() {
		
		given()//pre-req
		
		.when()//the action
			.get("http://restapi.adequateshop.com/api/Traveler?page=6")
			
		
		.then()//validation
			.statusCode(200)
			.log().all()
			.body("TravelerinformationResponse.travelers.Travelerinformation[0].name",equalTo("asdasd"));
			
			
		
	}
	
	
	@Test(enabled=false)
	public void lazyTest() {
		
		given()//pre-req
		
		.when()//the action
			.get("http://restapi.adequateshop.com/api/Traveler?page=6")
			
		
		.then()//validation
			.statusCode(200)
			.log().all()
			.body("TravelerinformationResponse.text()",containsString("10"));	
			
		
	}
	
	

}
