import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpricetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\deftsoft\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.amazon.in/";
		driver.get(baseurl);
		/* driver.manage().window().maximize(); */
		String title = driver.getTitle();
		System.out.println("Title of the website: " + title);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("External Harddisk 2tb seagate");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
		driver.navigate().refresh();
		int count = 1;
		int temp = 0;
		int a = 0;
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		System.out.println("size: " + price.size());
		for (int i = 0; i < price.size(); i++) {
			System.out.print("Sr.no: " + (count++) + "  ||  Price:");
			System.out.println(price.get(i).getText());
			System.out.println("==================");
		}

		
		  String[] strarr =new String[price.size()]; for(int c = 0;c<price.size();c++)
		  { strarr[c] = price.get(c).getText(); System.out.print(strarr[c]+" "); }
		  System.out.println(); System.out.println("(String array created)");
		  System.out.println();
		  
		  String[] priceonly = new String[strarr.length]; for(int b=0;
		  b<strarr.length;b++) { priceonly[b]=strarr[b].replaceAll(",", "");
		  System.out.print(priceonly[b]+" "); } System.out.println();
		  System.out.println("(Only Price String array created)");
		  System.out.println();
		  
		  
		  int[] arr=new int[priceonly.length]; for(a=0;a<strarr.length; a++) {
		  arr[a]=Integer.parseInt(priceonly[a]); System.out.print(arr[a]+" "); }
		  System.out.println();
		  System.out.println("(String array converted into int array successfully)");
		  System.out.println();
		  
		  int[] arr1=new int[arr.length]; for(int i=0;i<arr.length; i++) {
		  arr1[i]=arr[i]; System.out.print(arr1[i]+" "); } System.out.println();
		  System.out.println("(Copy of int array has been successfully)");
		  System.out.println();
		  
		  for(int i=0;i<strarr.length; i++) { for(int j=i+1;j<strarr.length; j++) {
		  if(arr[i] > arr[j]) { temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; } } }
		  System.out.print("With accending order: "); for(int i=0;i<arr.length; i++) {
		  
		  System.out.print(arr[i]+" "); } System.out.println();
		  
		  for(int i=0;i<arr.length; i++) { if(arr[i]==arr1[i]) {
		  System.out.println(arr[i]+"value match with: "+arr1[i]+" Sucessfully"); }
		  else { System.out.println(arr[i]+"value does not match with: "+arr1[i]); } }
		 

	}

}
