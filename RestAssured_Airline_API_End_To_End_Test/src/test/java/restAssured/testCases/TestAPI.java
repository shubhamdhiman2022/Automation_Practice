package restAssured.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI
{
	
	public String url = "https://api.instantwebtools.net/v1";
	public RequestSpecification httprequest;
	public Response response;
	
	public String responseBody, passengerID="628f33ed26124351a42b2e42"; 
	public int AirlineID;
	 
	@BeforeTest
	public void startTest()
	{
		RestAssured.baseURI = url;
		httprequest = RestAssured.given();
	}
	
	/*
	 * @Test public void updatePassengeFullyAPI() { System.out.
	 * println("---------------Start updatePassengeFullyAPI Test----------------");
	 * response = httprequest.header("Content-Type",
	 * "application/json; charset=utf-8").body("{\r\n" +
	 * "    \"name\": \"QA Shubham\",\r\n" + "    \"trips\": 10,\r\n" +
	 * "    \"airline\": 9853\r\n" + "}").put("/passenger/"+passengerID);
	 * Assert.assertEquals(response.getStatusCode(), 200); responseBody =
	 * response.asPrettyString(); System.out.println(responseBody);
	 * Assert.assertEquals(responseBody.
	 * contains("Passenger data put successfully completed."), true); }
	 */
	@Test
	public void deletePassenger()
	{
		System.out.println("---------------Start deletePassenger Test----------------");
		response = httprequest.header("Content-Type", "application/json; charset=utf-8").delete("/passenger/"+passengerID);
		Assert.assertEquals(response.getStatusCode(), 200);
		responseBody = response.asPrettyString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("Passenger data deleted successfully."), true);
	}
	@Test
	public void getAllPassengersData()
	{
		System.out.println("---------------Start getAllPassengersData Test----------------");
		response = httprequest.get("/passenger?page=0&size=5");
		Assert.assertEquals(response.getStatusCode(), 200);
		responseBody = response.asPrettyString();
		System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains("data"), true);
		System.out.println(response.jsonPath().from(responseBody).getInt("totalPassengers"));
	}
	
}
