/*
Test Name:Get a single employee data
URI: http://dummy.restapiexample.com/api/v1/employee/{id}
Request Type: GET
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

public class TC002_Get_Single_Employee_Record  extends Base
{
	@BeforeClass
	public void getEmployeeDataByID()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/employee/"+empID);
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
		Assert.assertEquals(responseBody.contains(empID), true);
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
		logger.info("*********  Finished TC002_Get_Single_Employee_Record **********");
	}
}
