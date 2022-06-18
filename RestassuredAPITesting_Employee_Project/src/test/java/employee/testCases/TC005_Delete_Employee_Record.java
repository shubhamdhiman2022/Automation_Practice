/*
Test Name: Delete an employee record
URI: http://dummy.restapiexample.com/api/v1/delete/{id}
Request Type: DELETE
Request Payload(Body): NA
*/
package employee.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import employee.base.Base;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC005_Delete_Employee_Record extends Base
{
	@BeforeClass
	void deleteEmployee() throws InterruptedException
	{
		logger.info("*********Started TC005_Delete_Employee_Record **********");
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.DELETE, "/delete/"+empID);
	}	
	
	@Test ( priority=1 )
	void checkStatusCode() 
	{
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test ( priority=2, dependsOnMethods = {"checkStatusCode"} )
	void checkResposeBody()
	{
		String responseBody = response.getBody().asPrettyString();
		Assert.assertEquals(responseBody.contains("Successfully! Record has been deleted"), true);
	}
	
	@Test ( priority=3, dependsOnMethods = {"checkStatusCode"} )
	void checkResponseTime()
	{
		long responseTime = response.getTime(); 
		Assert.assertTrue(responseTime<2000);
		
	}
		
	@Test ( priority=4, dependsOnMethods = {"checkStatusCode"} )
	void checkstatusLine()
	{
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	@Test ( priority=5, dependsOnMethods = {"checkStatusCode"} )
	void checkContentType()
	{
		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "application/json");
	}

	@Test ( priority=6, dependsOnMethods = {"checkStatusCode"} )
	void checkContentLenght()
	{
		String contentLength = response.header("Content-Length");
		Assert.assertTrue(Integer.parseInt(contentLength)<500);
	}
	
	@AfterClass
	void tearDown()
	{
		logger.info("*********  Finished TC005_Delete_Employee_Record **********");
	}
}
