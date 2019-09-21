package wash.functions;

import java.time.*; 
import java.time.format.DateTimeFormatter; 
public class DateAndTime {

	public static String LocalDateTimeApi() 
	{ 
	   
    
	   
	    // will give us the current time and date 
	    LocalDateTime current = LocalDateTime.now(); 

	   
	    // to print in a particular format 
	    DateTimeFormatter format =  
	      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
	    
	    String formatedDateTime = current.format(format);   
		return formatedDateTime;
	} 
	  
	 
}
