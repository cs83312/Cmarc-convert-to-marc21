package core;

import java.time.Clock;
import java.time.LocalDate;

/*
 * 00000nam a2200241Iib4500(必備)
 * 008 171019s2017    ch     e      000 0 chi d(必備)
 * 017  8 |aGPN|2rocgpt(必備)
 * 066    |c$1(必備)
 * 84    |a分類號|2ncsclt(必備)
 * 020    |aISBN|q(平裝/精裝) :|cNT$
 * 040    |aNDHU|bchi|cNDHU|eccr
 */

public class DataConvert0xx extends ControlPanel{
	
	final static String  signal000 = "00000nam a2200241Iib4500";
	final static String  singal040 = "040    |aNDHU|bchi|cNDHU|eccr";
	final static String  signal066 = "066    |c$1";
	
                 String  signal008;
                 
	@Override
	public void putInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOutPut() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//unfinish
	private String setSignal008(String n){
		
		LocalDate a = LocalDate.now(Clock.systemDefaultZone());
		String mar21Date = a.toString().split("-")[0].substring(2,4)+
				a.toString().split("-")[1]+
				a.toString().split("-")[2];
		String publishTime = null;
		
		String output = "008 "+mar21Date+"s"+publishTime+"    ch     e      000 0 chi d";
		return output;
	}
	//unfinish
    private String setSignal017(String n){
	
		String GPN = null;
		
		String output = "017  8 |a"+GPN+"|2rocgpt";
		
		return output;
	}
    
    private String setSignal020(String n){
    	
		String GPN = null;
		
		String output = "017  8 |a"+GPN+"|2rocgpt";
		
		return output;
	}
    
    //finish
    private String setSignal084(String n){
    	
		String iSBN = n.split("\\$a")[1].split("\\$")[0];
		String packages = n.split("\\$b")[1].split("\\$")[0];
		String money = n.split("\\$d")[1].split("\\$")[0];
		String output = "020    |a"+iSBN+"|q"+packages+" :|cNT$"+money;
		return output;
	}
    
   
	

 }
