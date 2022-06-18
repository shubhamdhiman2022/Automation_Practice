import java.util.Arrays;

public class splitstrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sdhfsd2343@#423434645!23!@";
		StringBuffer alpha= new StringBuffer(), num=new StringBuffer(), special= new StringBuffer();
		/*
		 * for(int i=0; i<str.length();i++) { if(Character.isDigit(str.charAt(i)))
		 * num.append(str.charAt(i)); else if(Character.isAlphabetic(str.charAt(i)))
		 * alpha.append((str.charAt(i))); else special.append(str.charAt(i)); }
		 * System.out.println(alpha); System.out.println(num);
		 * System.out.println(special);
		 */
		System.out.println("//////////////////////////////////////////");
		System.out.println("Second method: ");
		String dummy="";
		String[] strarr= {"$1234jhdf","$123 qwerty","$678 fghjk"};
		dummy=Arrays.toString(strarr);
		System.out.println(dummy);
		
		for(int i=0; i<dummy.length();i++)
		{
			/*if(Character.isDigit(dummy.charAt(i)))
			num.append(dummy.charAt(i));*/
			if(Character.isAlphabetic(dummy.charAt(i)))
			alpha.append((dummy.charAt(i)));
			else special.append(dummy.charAt(i));
		}
		System.out.println(alpha);
		/* System.out.println(num); */
		System.out.println(special);
		String abc= special.toString();
		String test;
		test=abc.replace("[", "").replace("]", "").replaceAll(",", "").replaceAll(" ", "");
		System.out.println(test);
		String[] strarr1=test.split("$");
		for(int i=0; i<strarr1.length;i++)
		{
			System.out.println("Split: "+strarr1[i]+" ");
		}
		String[] strarr2= new String[strarr1.length];
		for(int i=0; i<strarr1.length;i++)
		{
			strarr2[i]=strarr1[i].replaceAll("$", " ");
			System.out.print(strarr2[i]+" ");
		}
		
		/*
		 * String[] strarr1= new String[special.length]; for(int i=0;
		 * i<strarr.length;i++) {
		 * 
		 * }
		 */
		
	
		/*
		 * String[] strarr1= new String[strarr.length]; for(int i=0;
		 * i<strarr.length;i++) {
		 * 
		 * dummy=Arrays.toString() for(int a=0; a<str.length();a++) {
		 * if(Character.isDigit(str.charAt(a))) num.append(str.charAt(a)); else
		 * if(Character.isAlphabetic(str.charAt(a))) alpha.append((str.charAt(a))); else
		 * special.append(str.charAt(a)); } System.out.println(alpha);
		 * System.out.println(num); System.out.println(special); }
		 */
	}

}
