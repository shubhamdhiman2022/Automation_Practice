
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_profile {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\deftsoft\\eclipse-workspace\\firefoxdriver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\deftsoft\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\s1lgp8xs.QA_Profile"));
		//FirefoxProfile profile = allprofile.getProfile("");
		
		FirefoxOptions options= new FirefoxOptions();
		options.setProfile(profile);
        WebDriver driver= new FirefoxDriver(options);
        //FirefoxDriver driver= new FirefoxDriver();
		driver.get("http:google.com");
		//driver.close();
	}

}
