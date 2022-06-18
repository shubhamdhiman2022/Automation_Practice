/*
Test Name:Create new record in database 
URI: http://dummy.restapiexample.com/api/v1/create
Request Type: POST
Request Payload(Body): {"name":"XXXXX","salary":"XXXX","age":"XX"}
*/
package employee.testCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import employee.base.Base;
import employee.utilities.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC003_Post_Employee_Record extends Base

{
	String empName = RestUtils.getEmpName();
	String empSalary = RestUtils.getEmpSalary();
	String empAge = RestUtils.getEmpAge();
	
	@BeforeClass
	public void createEmployee()
	{
		logger.info("*********Started TC003_Post_Employee_Record **********");
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", empName);
		requestParams.put("salary", empSalary);
		requestParams.put("age", empAge);
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		
		response = httpRequest.request(Method.POST, "/create");
		
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
		Assert.assertEquals(responseBody.contains(empName), true);
		Assert.assertEquals(responseBody.contains(empSalary), true);
		Assert.assertEquals(responseBody.contains(empAge), true);
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
		logger.info("*********  Finished TC003_Post_Employee_Record **********");
	}
	
}