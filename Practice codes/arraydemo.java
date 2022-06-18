
import java.util.Arrays;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"5,5","9,8","65"};
		String str1=Arrays.toString(str);
		System.out.println("String array: "+str);
		System.out.println("Array to String: "+str1);
		String str2 = str1.replace(",", "").replace("[","").replace("]","");
		System.out.println("Replaced String values: "+str2);
		
		/*
		 * String str3=str2.replace("[","");
		 * System.out.println("2Replaced String values: "+str3); String
		 * str4=str3.replace("]","");
		 * System.out.println("2Replaced String values: "+str4);
		 */
		 
		
		
		  String[] strarr = str2.split(" ");
		  
		  
		  for(int i=0; i<strarr.length; i++) {
		  System.out.println("replaced string to String array: "+strarr[i]); }
		 
		
        int[] strarr1 = new int[strarr.length];
         
		for(int i=0; i<strarr.length; i++)
		{
			strarr1[i]=Integer.parseInt(strarr[i]);
			System.out.println("replaced String array to int array: "+strarr1[i]);
		}
		
		
		/*
		 * String[] prstrarr= {"5.5","9.8","65"}; int[] printarr = new
		 * int[prstrarr.length]; for(int i=0; i<prstrarr.length; i++) {
		 * printarr[i]=Integer.parseInt(prstrarr[i]);
		 * System.out.println("replaced String array to int array: "+strarr1[i]); }
		 */
		
		/*
		 * String[] integer= {"34&4455","54","34&4"};
		 *  String[] intr=new String[3];
		 * for(int i=0; i<integer.length; i++) 
		 * {
		 *  intr[i]=integer[i].replaceAll("&","");
		 * System.out.println(intr[i]);
		 *  }
		 */

		
		
		
		
		
		
		
		
		
		/*
		 * int [] arr= new int[str.length]; int temp;
		 * System.out.print("Integer array: "); for(int i=0;i<str.length;i++) {
		 * arr[i]=Integer.parseInt(str[i]); System.out.print(arr[i]+" "); }
		 */
		  
			/*
			 * for(int i=0;i<str.length;i++) { for(int j=i+1;j<str.length;j++) {
			 * if(arr[i]>arr[j]) { temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
			 * 
			 * } } } System.out.println(); System.out.print("Accending order: "); for(int
			 * i=0;i<str.length;i++) { System.out.print (arr[i]+" "); }
			 */
		int a=1;
		for(int i=1; i<100; i++)
		{
			System.out.println(i++);
		}
		 
	}

}
