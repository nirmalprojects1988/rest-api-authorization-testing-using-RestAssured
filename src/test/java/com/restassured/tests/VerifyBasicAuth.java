package com.restassured.tests;

import static io.restassured.RestAssured.given;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.utils.ExtentReportsHelper;

public class VerifyBasicAuth extends FunctionalTest {
	
	@Test
	public void basicAuth() {
		given().auth().preemptive()
		  .basic("postman", "password")
		  .when()
		  .get(FrameworkConstants.getBasicauthURI())
		  .then()
		  .assertThat()
		  .statusCode(Responsecodes.GET).log().all();
		
		ExtentReportsHelper.pass("BasicAuth", "BasicAuth is passed");
	}
	@AfterMethod
	public static void cleanUp(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			ExtentReportsHelper.fail(result.getName(), "Test has failed");
			}
		
			
	}

}
