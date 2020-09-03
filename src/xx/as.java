package xx;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class as {

	public static void main(String[] args) {
		
	      
	    // Date cdate = new Date();
	     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	     String startTime = format.format( new Date());
	     System.out.println(startTime);    
	     String endTime = format.format( new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24)));
	     System.out.println(endTime);
	     System.out.println("Hello there !!!!");
	    
	 }
}