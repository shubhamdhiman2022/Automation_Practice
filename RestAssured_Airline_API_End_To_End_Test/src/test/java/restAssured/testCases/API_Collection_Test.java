package restAssured.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Collection_Test
{
	public String url = "https://api.instantwebtools.net/v1";
	public RequestSpecification httprequest;
	public Response response;
	public Logger logger;
	
	public String responseBody, passengerID; 
	public int AirlineID;
	 
	@BeforeTest
	public void startTest()
	{
		RestAssured.baseURI = url;
		httprequest = RestAssured.given();
		logger = Logger.getLogger("API Collection Test");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
	@Test(priority = 1)
	public void createAirlineAPI()
	{
		System.out.println("---------------Start createAirlineAPI Test----------------");
		logger.info("---------------Start createAirlineAPI Test----------------");
		RestAssured.baseURI = url;
		httprequest = RestAssured.given();
		response = httprequest.header("Content-Type", "application/json; charset=utf-8")
		.body("{ \"id\": \"7856\", \"name\": \"QA Railway\", \"country\": \"USA\", \"logo\": \"https://picsum.test/200\", \"slogan\": \"Be Extensive be Aggorant\", \"head_quaters\": \"Brazil, Usa\", \"website\": \"www.testwebsite.com\", \"established\": \"1998\" }")
		.post("/airlines");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody= response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		AirlineID= response.jsonPath().from(responseBody).get("id");
		System.out.println("Air ID: "+AirlineID);
	
	} 
	@Test (priority = 2, dependsOnMethods= {"createAirlineAPI"})
	public void getAirlineByIdAPI()
	{
		System.out.println("---------------Start getAirlineByIdAPI Test----------------");
		logger.info("---------------Start getAirlineByIdAPI Test----------------");
		response = httprequest.get("/airlines/"+AirlineID);
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody= response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		Assert.assertEquals(responseBody.contains(String.valueOf(AirlineID)), true);
	}
	
	@Test (priority = 3, dependsOnMethods= {"getAirlineByIdAPI"})
	public void createPassengerAPI()
	{
		System.out.println("---------------Start createPassengerAPI Test----------------");
		logger.info("---------------Start createPassengerAPI Test----------------");
		response = httprequest.header("Content-Type", "application/json; charset=utf-8").body("{ \"name\": \"QA Shubham Test\", \"trips\": 25, \"airline\": "+AirlineID+" }").post("/passenger");
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody= response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		passengerID = response.jsonPath().from(responseBody).get("_id");
		System.out.println("Passenger ID is : "+passengerID);
		
	}
	 
	@Test (priority = 4, dependsOnMethods= {"createPassengerAPI"})
	public void getPassengerByIdAPI()
	{
		System.out.println("---------------Start getPassengerByIdAPI Test----------------");
		logger.info("---------------Start getPassengerByIdAPI Test----------------");
		response = httprequest.get("passenger/"+passengerID);
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody = response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		Assert.assertEquals(responseBody.contains(passengerID), true);
	}
	
	@Test (priority = 5, dependsOnMethods= {"getPassengerByIdAPI"})
	public void updatePassengerPartialAPI()
	{
		System.out.println("---------------Start updatePassengerPartialAPI Test----------------");
		logger.info("---------------Start updatePassengerPartialAPI Test----------------");
		response = httprequest.header("Content-Type", "application/json; charset=utf-8").body("{\"name\":\"Shubham Dhiman Updated 2.0\"}").patch("/passenger/"+passengerID);
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody = response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		Assert.assertEquals(responseBody.contains("Passenger data updated successfully."), true);
	}
	
	@Test (priority = 6, dependsOnMethods= {"getPassengerByIdAPI"})
	public void updatePassengeFullyAPI()
	{
		System.out.println("---------------Start updatePassengeFullyAPI Test----------------");
		logger.info("---------------Start updatePassengeFullyAPI Test----------------");
		response = httprequest.header("Content-Type", "application/json; charset=utf-8").body("{ \"name\": \"QA Shubham Updated full\", \"trips\": 10, \"airline\": 9853 }").put("/passenger/"+passengerID);
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody = response.asPrettyString();
		logger.info(responseBody);
		//System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Passenger data put successfully completed."), true);
	}
	
	@Test (priority = 7, dependsOnMethods= {"getPassengerByIdAPI"})
	public void deletePassenger()
	{
		System.out.println("---------------Start deletePassenger Test----------------");
		logger.info("---------------Start deletePassenger Test----------------");
		response = httprequest.header("Content-Type", "application/json; charset=utf-8").delete("/passenger/"+passengerID);
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody = response.asPrettyString();
		logger.info(responseBody);
		//System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Passenger data deleted successfully."), true);
	}
	
	@Test (priority = 8, dependsOnMethods= {"getPassengerByIdAPI"})
	public void getAllPassengersData()
	{
		System.out.println("---------------Start getAllPassengersData Test----------------");
		logger.info("---------------Start getAllPassengersData Test----------------");
		response = httprequest.get("/passenger?page=0&size=5");
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("Status Code: "+response.getStatusCode());
		logger.info("Response Time: "+response.getTimeIn(TimeUnit.MILLISECONDS));
		responseBody = response.asPrettyString();
		//System.out.println(responseBody);
		logger.info(responseBody);
		Assert.assertEquals(responseBody.contains("data"), true);
		System.out.println(response.jsonPath().from(responseBody).getInt("totalPassengers"));
	}
	
	
}