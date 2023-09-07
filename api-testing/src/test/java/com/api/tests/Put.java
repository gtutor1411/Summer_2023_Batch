package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Put {
	


	
	@Test(enabled=true)
	public void putTest() {
		String body = "{\"firstname\":\"James\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Luke warm Breakfast\"}";
		
		given()
			.contentType("application/json")		
			.accept("application/json")
			//.cookie("token=ed916cffb006c84")
			.header("Cookie","token=3abd7065ac57620")			
			.contentType(ContentType.JSON)			
			.body(body)
		.when()
			.put("https://restful-booker.herokuapp.com/booking/751")
		.then()
			.statusCode(200)
			.log().all();
	
		
		
	}

}
