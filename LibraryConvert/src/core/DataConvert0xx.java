package core;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * 00000nam a2200241Iib4500(必備)
 * 008 171019s2017    ch     e      000 0 chi d(必備)
 * 017  8 |aGPN|2rocgpt(必備)
 * 066    |c$1(必備)
 * 84    |a分類號|2ncsclt(必備)
 * 020    |aISBN|q(平裝/精裝) :|cNT$
 * 040    |aNDHU|bchi|cNDHU|eccr
 * 
 * 
 * 缺017 ,008細節待確認
 * 
 * 
 */

public class DataConvert0xx extends ControlPanel{
	
	final static String  signal000 = "00000nam a2200241Iib4500\r\n";
	final static String  signal040 = "040    |aNDHU|bchi|cNDHU|eccr\r\n";
	final static String  signal066 = "066    |c$1\r\n";
	
                 
          public List<String> signalData  ;    
                 
    public DataConvert0xx() {
    	this.signalData = new ArrayList<>();
    }             
	@Override
	public void putInput(String n) {
		String prefixNumber = n.substring(0,3);
		switch(prefixNumber) {
		case "010":
			signalData.add(setSignal020(n));
			break;
		case "000017":
			break;
		case "681":
			
			signalData.add(setSignal084(n));
		default:
			break;		
		}
		
	}

	@Override
	public List<String> getOutPut() {
		signalData.add(setSignal008(""));
		signalData.add(setSignal017(""));
		signalData.add(signal040);
		signalData.add(signal066);
		return signalData;
	}
	private String setSignal008(String n){
		
		String prefix = "008 ";
		LocalDate a = LocalDate.now(Clock.systemDefaultZone());
		String mar21Date = a.toString().split("-")[0].substring(2,4)+
				a.toString().split("-")[1]+
				a.toString().split("-")[2];
		String publishTime = "請同學填寫出版日期";
		String suffix = "    ch     e      000 0 chi d";
		String output = prefix+mar21Date+"s"+publishTime+suffix+"\r\n";
		return output;
	}
	//unfinish
    private String setSignal017(String n){
	
    	String prefix = "017  8 ";
		String GPN = "|a"+"請同學填寫GPN,非政府出版則刪除該列";
		String suffix= "|2rocgpt";
		
		String output = prefix + GPN + suffix+"\r\n";
		
		return output;
	}
    
    private String setSignal020(String n){
    	String prefix = "020    ";
		String ISBN = "";
		if(n.indexOf("$a")>0)
		ISBN ="|a"+n.split("\\$a")[1].split("\\$")[0].replace("-", "");
		String packet = "";
		if(n.indexOf("$b")>0)
		packet ="|q("+n.split("\\$b")[1].split("\\$")[0]+")";
		
		String money = "";
		if(n.indexOf("$d")>0)
		money =" :|c"+n.split("\\$d")[1];
		
		String output = prefix+ISBN+packet+money+"\r\n";
		
		return output;
	}
    
    //finish
    private String setSignal084(String n){
    	String prefix = "084    ";
    	String classNumber = "|a"+n.split("\\$a")[1].split("\\r")[0];
    	String suffix = "|2ncsclt";
		String output = prefix + classNumber + suffix +"\r\n";
		return output;
	}
    
   
	

 }
