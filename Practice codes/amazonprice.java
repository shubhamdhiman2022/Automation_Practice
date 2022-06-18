import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.amazon.com/s?k=mobile+phone+under+5000&crid=21CLWOF2D5MZW&sprefix=mobile+phone+und%2Caps%2C431&ref=nb_sb_ss_ts-doa-p_3_16";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title = driver.getTitle();
		System.out.println("Title of the website: " + title);
		 driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		 driver.findElement(By.id("s-result-sort-select_1")).click();
		driver.navigate().refresh();
		int count = 1;
		int temp =0;
		int a=0;
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		System.out.println("size: " + price.size());
		for (int i = 0; i < price.size(); i++)
		{
			System.out.print("Sr.no: " + (count++) + "  ||  Price:");
			System.out.println(price.get(i).getText());
			System.out.println("==================");
		}
		/*
		 * for(WebElement str: price ) { pricetext=str.getText();
		 * System.out.print("Sr.no: "+(count++)+"  ||  Price:");
		 * System.out.println("InString: "+pricetext); System.out.print(pricetext);
		 */
	String[] strarr =new String[price.size()];
	for(int i = 0;i<price.size();i++)
	{
		strarr[i] = price.get(i).getText();
		System.out.print(strarr[i]+" ");
	}
	System.out.println("(String array created)");
	System.out.println();
	   int[] arr=new int[strarr.length];
	   for(a=0;a<strarr.length; a++)
	   {
		 arr[a]=Integer.parseInt(strarr[a]); 
		 System.out.print(arr[a]+" "); }
		 System.out.println("(String array converted into int array successfully)");
		 System.out.println();
		 
		 int[] arr1=new int[arr.length];
		 for(int i=0;i<arr.length; i++)
		   {
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" ");
		 }
		 System.out.println("(Copy of int array has been successfully)");
		 System.out.println();

	for(int i=0;i<strarr.length; i++) 
	{
		for(int j=i+1;j<strarr.length; j++)
		{
			if(arr[i] > arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	 System.out.print("With accending order: ");
	 for(int i=0;i<arr.length; i++)
	   {
		
		 System.out.print(arr[i]+" "); }
	 System.out.println();
	
	 for(int i=0;i<arr.length; i++) {
		 if(arr[i]==arr1[i])
		 {
				/* System.out.println(arr[i]+"value match with: "+arr1[i]+" Sucessfully"); */
		 }
		 else
		 {
			 System.out.println(arr[i]+"value does not match with: "+arr1[i]);
		 }
	 }
	/*
	 * System.out.println(); String pricetext = Arrays.toString(strarr);
	 * System.out.println("String value: "+pricetext); System.out.println();
	 * System.out.println("Webelement to string completed");
	 * 
	 * 
	 * String rplc = pricetext.replaceAll(",", "");
	 * System.out.print("replace string: "+rplc); System.out.println();
	 * System.out.println(rplc.length());
	 * 
	 * 
	 * 
	 * 
	 * String[] spltarr = rplc.split(" ");
	 * System.out.println("String to string array completed");
	 * 
	 * int[] arr=new int[spltarr.length]; for(int i=0;i<spltarr.length; i++) {
	 * arr[i]=Integer.parseInt(spltarr[i]); System.out.print(arr[i]); }
	 * System.out.println("String array to int array completed");
	 */
	
	 
	}
}

