package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameCheck {

	public static final String TEXT = "Мне очень нравится Тайланд. "
			+ "Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";
	
	 private static final String IPADDRESS_PATTERN =   
			 "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +  
			 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +  
			 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +  
			 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";  

	public static void main(String[] args) {
		// System.out.println("Cool check:");
		//
		// System.out.println(checkWithRegExp("_@BEST"));
		// System.out.println(checkWithRegExp("vovan"));
		// System.out.println(checkWithRegExp("vo"));
		// System.out.println(checkWithRegExp("Z@OZA"));
		//
		// System.out.println("\nDumb check:");
		//
		// System.out.println(dumbCheck("_@BEST"));
		// System.out.println(dumbCheck("vovan"));
		// System.out.println(dumbCheck("vo"));
		// System.out.println(dumbCheck("Z@OZA"));

		// System.out.println(test("BACON")); //true
		// System.out.println(test(" BACON")); //false
		// System.out.println(test("BACON ")); //false
		// System.out.println(test("^BACON$")); //false
		// System.out.println(test("bacon")); //false

//		System.out.println(test2("trololow.com")); // true
//		System.out.println(test2("trololo.ua ")); // false
//		System.out.println(test2("trololo.ua")); // true
//		System.out.println(test2("trololo/ua")); // false
//		System.out.println(test2("i love java because it is cool.ru")); // true
//		System.out.println(test2("BACON.ru")); // true
//		System.out.println(test2("BACON.de")); // false
		
//		 System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина")); 
//
//		 
//		 System.out.println(test3("pizza"));   //true  
//	        System.out.println(test3("@pizza"));  //false  
//	        System.out.println(test3("pizzaaaaa"));  //true 
//	        
	        
	        Pattern p = Pattern.compile("(якороль).+(\\1)");  
	        Matcher m = p.matcher("регулярные выражения это круто регулярные выражения это круто регулярные выражения это круто"
	        		+ " якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные выражения это круто" );  
	        if(m.find()){  
	            System.out.println(m.group());  
	        }  
	        
	        
	        
	}

	public static boolean checkWithRegExp(String userNameString) {
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}

	public static boolean dumbCheck(String userNameString) {

		char[] symbols = userNameString.toCharArray();
		if (symbols.length < 3 || symbols.length > 15)
			return false;

		String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

		for (char c : symbols) {
			if (validationString.indexOf(c) == -1)
				return false;
		}

		return true;
	}

	public static boolean test(String testString) {
		Pattern p = Pattern.compile("[^BACON$]");
		Matcher m = p.matcher(testString);
		return m.matches();

	}

	public static boolean test2(String testString) {
		Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
		Matcher m = p.matcher(testString);
		return m.matches();
	}

	public static boolean test3(String testString){  
        Pattern p = Pattern.compile("^[a-z]+");  
        Matcher m = p.matcher(testString);  
        return m.matches();  
    } 
	
	
		   
		   

}