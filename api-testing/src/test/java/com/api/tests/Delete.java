package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete {

	@Test
	public void deleteTest() {

		given()
			.auth()
			.preemptive()
			.basic("admin", "password123")
			//.contentType("application/json")
			.header("Accept",ContentType.JSON.getAcceptHeader())
			
			.cookie("token=f3007db135cd5d9")
		
		.when()
			.delete("https://restful-booker.herokuapp.com/booking/1082")
				

				.then()
					.statusCode(201)
					.log().all();
		

	}

}
