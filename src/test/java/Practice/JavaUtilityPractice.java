package Practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {
	public static void main(String[] args) {
		JavaUtility jutil = new JavaUtility();
		String value = jutil.getCalendarDetails("dd-MM-YY");
		System.out.println(value);
		
		String value1 = jutil.getCalendarDetails("dd-MM-YY hh-mm-ss");
		System.out.println(value1);
		
		int number = (int)(Math.random()*9999);
		System.out.println(number);
		
		int num = jutil.generateRandomNumber(100000);
		System.out.println(num);
	}
}
