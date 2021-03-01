package org.mycompany.utils;
public class MyClass {

	private String foo;
	
	 
	 public static String snakeToCamel(String str) 
	 { 
	     // Capitalize first letter of string 
	     str = str.substring(0, 1).toUpperCase() 
	           + str.substring(1); 

	     // Convert to StringBuilder 
	     StringBuilder builder 
	         = new StringBuilder(str); 

	     // Traverse the string character by 
	     // character and remove underscore 
	     // and capitalize next letter 
	     for (int i = 0; i < builder.length(); i++) { 

	         // Check char is underscore 
	         if (builder.charAt(i) == '_') { 

	             builder.deleteCharAt(i); 
	             builder.replace( 
	                 i, i + 1, 
	                 String.valueOf( 
	                     Character.toUpperCase( 
	                         builder.charAt(i)))); 
	         } 
	     } 

	     // Return in String type 
	     return builder.toString(); 
	 }
	 


public static String camelcase(String base) {
	   // Given string 
    String str = snakeToCamel(base); 
	
	return str;
}

}
	




