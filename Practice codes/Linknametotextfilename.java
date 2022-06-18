import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linknametotextfilename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		 * WebDriver driver= new ChromeDriver();
		 */
		String homepage = "Kye ";
		File folder = new File("e://Test docx");
		folder.mkdir();
		String filename= "e://Test docx//"+homepage+"testing.txt";
		System.out.println(filename);
		FileWriter file = new FileWriter(filename);
	    BufferedWriter br = new BufferedWriter(file); 
	    br.write("Created");
	    br.close();
		System.out.println("passed");

	}

}
