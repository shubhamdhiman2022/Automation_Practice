package restAssured.testCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import restAssured.baseClass.BaseClass;

public class TC005_Post_Passenger_Record extends BaseClass
{
	@BeforeClass
	public void createPassenger()
	{
		String passengerName= read.get_passenger_name();
		String trip =read.get_passenger_trips();
		String airlineId= read.enter_airline_id();
		
		logger.info("*********Started TC005_Post_Passenger_Record**********");
		RestAssured.baseURI= "https://api.instantwebtools.net/v1";
		httprequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("name", passengerName);
		requestParams.put("trips", trip);
		requestParams.put("airline", airlineId);
		
		httprequest.header("Content-Type", "application/json"); 
		httprequest.body(requestParams.toJSONString());
		
		response = httprequest.request(Method.POST, "/passenger");
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
		Assert.assertTrue(jsonPathEvaluator.get("airline")!=null);
		Assert.assertEquals(responseBody.contains("Shubham Dhiman"), true);
		//Assert.assertEquals(jsonPathEvaluator.getInt("trips"), Integer.parseInt(trip));
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
		
		if(Integer.parseInt(contentLength)<100)
			logger.warn("Content Length is less than 100");
		
		Assert.assertTrue(Integer.parseInt(contentLength)>100);
		
	}
	
	@AfterClass
	public void terminate()
	{
		logger.info("*********Finished TC005_Post_Passenger_Record**********");
	}
}
