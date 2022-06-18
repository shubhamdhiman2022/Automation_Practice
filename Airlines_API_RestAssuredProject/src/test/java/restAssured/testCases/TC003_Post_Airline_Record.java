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

public class TC003_Post_Airline_Record extends BaseClass
{
		
	@BeforeClass
	public void createAirline()
	{
		String airline_id = read.enter_airline_id();
		String airline_name = read.enter_airline_name();
		String airline_country = read.enter_airline_country();
		String airline_logo = read.enter_airline_logo();
		String airline_slogan = read.enter_airline_slogan();
		String airline_head_quaters = read.enter_airline_head_quaters();
		String airline_website = read.enter_airline_website();
		String airline_established = read.enter_airline_established();

		logger.info("*********Started TC003_Post_Airline_Record**********");
		RestAssured.baseURI= "https://api.instantwebtools.net/v1";
		httprequest =RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", airline_id);
		requestParams.put("name", airline_name);
		requestParams.put("country", airline_country);
		requestParams.put("logo", airline_logo);
		requestParams.put("slogan", airline_slogan);
		requestParams.put("head_quaters", airline_head_quaters);
		requestParams.put("website", airline_website);
		requestParams.put("established", airline_established);
		
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestParams.toJSONString());
		
		response = httprequest.request(Method.POST, "/airlines");
		
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
		/*
		 * Assert.assertEquals(Integer.toString(jsonPathEvaluator.get("id")),
		 * airline_id); Assert.assertEquals(jsonPathEvaluator.get("name"),
		 * airline_name); Assert.assertEquals(jsonPathEvaluator.get("country"),
		 * airline_country); Assert.assertEquals(jsonPathEvaluator.get("logo"),
		 * airline_logo); Assert.assertEquals(jsonPathEvaluator.get("slogan"),
		 * airline_slogan); Assert.assertEquals(jsonPathEvaluator.get("head_quaters"),
		 * airline_head_quaters); Assert.assertEquals(jsonPathEvaluator.get("website"),
		 * airline_website); Assert.assertEquals(jsonPathEvaluator.get("established"),
		 * airline_established);
		 */
		
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
		logger.info("*********Finished TC003_Post_Airline_Record**********");
	}
}
