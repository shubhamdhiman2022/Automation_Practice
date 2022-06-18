package restAssured.baseClass;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restAssured.utilities.ReadConfig;

public class BaseClass
{
	public RequestSpecification httprequest;
	public static Response response;
	public Logger logger; 
	public ReadConfig read;
	
	@BeforeClass
	public void setup()
	{	
		read = new ReadConfig();
		logger = Logger.getLogger("Airline Rest API");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
}
