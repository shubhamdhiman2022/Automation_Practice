package restAssured.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import restAssured.baseClass.BaseClass;

public class TC008_Delete_Passenger_By_ID extends BaseClass
{
	@BeforeClass
	public void deletePassenger()
	{
		String PassId= read.get_passenger_get_id();
		logger.info("*********Started TC008_Delete_Passenger_By_ID**********");
		RestAssured.baseURI= "https://api.instantwebtools.net/v1";
		httprequest = RestAssured.given();
		
		response = httprequest.request(Method.DELETE, "/passenger/"+PassId);
	}
	
	@Test (priority=1)
	public void checkStatusCode()
	{
		logger.info("***********  Checking Status Code **********");
		int statusCode = response.getStatusCode();
		logger.info("Status Code is : "+statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test  ( priority=2, dependsOnMethods = {"checkStatusCode"} )
	public void checkResposeBody()
	{
		logger.info("***********  Checking Respose Body **********");
		
		String responseBody = response.getBody().asPrettyString();
		logger.info("Response Body is : "+responseBody);
		Assert.assertTrue(responseBody!=null);
		JsonPath jsonPathEvaluator  = response.jsonPath();
		Assert.assertEquals(jsonPathEvaluator.get("message"), "Passenger data deleted successfully.");
	}
	
	@Test (priority=3, dependsOnMethods = {"checkStatusCode"})
	public void checkResponseTime()
	{
		logger.info("***********  Checking Response Time **********");
		
		long responseTime = response.getTime();
		logger.info("Response Time is : " + responseTime);
		
		if(responseTime>2000)
			logger.warn("Response Time is greater than 2000");
		
		Assert.assertTrue(responseTime<10000);	
	}
	
	@Test (priority=4, dependsOnMethods = {"checkStatusCode"})
	public void checkstatusLine()
	{
		logger.info("***********  Checking Status Line **********");
		
		String statusLine = response.getStatusLine();
		logger.info("Status Line is : " + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	@Test (priority=5, dependsOnMethods = {"checkStatusCode"})
	void checkContentType()
	{
		logger.info("***********  Checking Content Type **********");
		
		String contentType = response.header("Content-Type");
		logger.info("Content type is : " + contentType);
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
	}
	
	@Test (priority=6, dependsOnMethods = {"checkStatusCode"})
	void checkContentLenght()
	{
		logger.info("***********  Checking Content Lenght**********");
		
		String contentLength = response.header("Content-Length");
		logger.info("Content Length is : " +contentLength); 
		
		if(Integer.parseInt(contentLength)<50)
			logger.warn("Content Length is less than 50");
		
		Assert.assertTrue(Integer.parseInt(contentLength)>=50);
		
	}
	
	@AfterClass
	public void terminate()
	{
		logger.info("*********Finished TC008_Delete_Passenger_By_ID**********");
	}
}
