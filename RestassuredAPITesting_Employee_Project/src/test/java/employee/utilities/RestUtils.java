package employee.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils

{
	public static String getEmpName()
	{
		String gen_empName = RandomStringUtils.randomAlphabetic(1);
		return ("Shubham"+gen_empName);
	}
	
	public static String getEmpSalary()
	{
		String gen_empSalary = RandomStringUtils.randomNumeric(5);
		return gen_empSalary;
	}
	
	public static String getEmpAge() {
		String gen_empAge = RandomStringUtils.randomNumeric(2);
		return gen_empAge;
	}
}
