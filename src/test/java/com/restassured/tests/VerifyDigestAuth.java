package com.restassured.tests;

import static io.restassured.RestAssured.given;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.utils.ExtentReportsHelper;

public class VerifyDigestAuth extends FunctionalTest{
	
	private VerifyDigestAuth() {}
	
	@Test
	public void digestAuth() {
		given().auth().digest("postman", "password")
		  .when()
		  .get(FrameworkConstants.getDigestAuthUri())
		  .then()
		  .assertThat()
		  .statusCode(Responsecodes.GET).log().all();
		
		ExtentReportsHelper.pass("DigestAuth", "DigestAuth is passed");
	}
	
	
	@AfterMethod
	public static void cleanUp(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			ExtentReportsHelper.fail(result.getName(), "Test has failed");
			}
		
			
	}

}
