package restAssured.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import restAssured.baseClass.BaseClass;

public class TC009_Get_All_Passengers extends BaseClass
{
	@BeforeClass
	public void getPassengerData()
	{
		String pageNo = read.get_page_no();
		String size = read.get_data_size();
		
		logger.info("*********Started TC009_Get_All_Passengers**********");
		RestAssured.baseURI= "https://api.instantwebtools.net/v1";
		httprequest =RestAssured.given();
		response = httprequest.request(Method.GET, "/passenger?page="+pageNo+"&size="+size);
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
		Assert.assertTrue(jsonPathEvaluator.get("data")!=null);
		Assert.assertTrue(responseBody.contains("totalPassengers"));
		Assert.assertTrue(responseBody.contains("totalPages"));
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
		logger.info("*********Finished TC009_Get_All_Passengers**********");
	}
}
