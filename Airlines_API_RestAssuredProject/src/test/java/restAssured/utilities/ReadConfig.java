package restAssured.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	public ReadConfig()
	{	
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\restAssured\\testData\\config.properties";
		File srcfile = new File(path);
		try
		{
			FileInputStream input = new FileInputStream(srcfile);
			pro = new Properties();
			pro.load(input);
		}
		catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}

		
	}
	public String get_airline_id()
	{
		String airline_id= pro.getProperty("airline_get_id");
		return airline_id;
	}
	
	public String enter_airline_id()
	{
		String airline_id= pro.getProperty("airline_id");
		return airline_id;
	}
	
	public String enter_airline_name()
	{
		String airline_name= pro.getProperty("airline_name");
		return airline_name;
	}
	
	public String enter_airline_country()
	{
		String airline_country= pro.getProperty("airline_country");
		return airline_country;
	}
	
	public String enter_airline_logo()
	{
		String airline_logo= pro.getProperty("airline_logo");
		return airline_logo;
	}
	
	public String enter_airline_slogan()
	{
		String airline_slogan= pro.getProperty("airline_slogan");
		return airline_slogan;
	}
	
	public String enter_airline_head_quaters()
	{
		String airline_head_quaters= pro.getProperty("airline_head_quaters");
		return airline_head_quaters;	
	}
	
	public String enter_airline_website()
	{
		String airline_website= pro.getProperty("airline_website");
		return airline_website;
	}
	
	public String enter_airline_established()
	{
		String airline_established= pro.getProperty("airline_established");
		return airline_established;
	}
	
	public String get_passenger_get_id()
	{
		String passenger_get_id= pro.getProperty("passenger_get_id");
		return passenger_get_id;
	}
	
	public String get_passenger_name()
	{
		String passenger_name= pro.getProperty("passenger_name");
		return passenger_name;
	}
	
	public String get_passenger_trips()
	{
		String passenger_trips= pro.getProperty("passenger_trips");
		return passenger_trips;
	}
	
	public String updated_passenger_name()
	{
		String updated_passenger_name= pro.getProperty("updated_passenger_name");
		return updated_passenger_name;
	}
	
	public String updated_passenger_trips()
	{
		String updated_passenger_trips= pro.getProperty("updated_passenger_trips");
		return updated_passenger_trips;
	}
	
	public String updated_passenger_airline()
	{
		String updated_passenger_airline= pro.getProperty("updated_passenger_airline");
		return updated_passenger_airline;
	}
	
	public String updated2_passenger_name()
	{
		String updated2_passenger_name= pro.getProperty("updated2.0_passenger_name");
		return updated2_passenger_name;
	}
	
	public String get_page_no()
	{
		String page_no= pro.getProperty("page_no");
		return page_no;
	}
	
	public String get_data_size()
	{
		String data_size= pro.getProperty("data_size");
		return data_size;
	}
}


