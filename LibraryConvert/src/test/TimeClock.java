package test;

import java.time.Clock;
import java.time.LocalDate;

public class TimeClock {
	
	 public static void main(String[] args) {
		    LocalDate a = LocalDate.now(Clock.systemDefaultZone());
		    String date ="2018-08-14";
		    
		    System.out.println(a);
		    System.out.println(date.toString().split("-")[0].substring(2,4)+
		    		date.toString().split("-")[1]+date.toString().split("-")[2]);
		  }
}
