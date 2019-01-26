package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert2xx extends ControlPanel {

	
	 public List<String> signalData  ;    
     
	    public DataConvert2xx() {
	    	this.signalData = new ArrayList<>();
	    }
	
	
	//unfinish
	//"454  1 $12001 $aThe history of medicine(240|a)\r\n"
	private String setSignal240(String n){
		
		String prefix = "240 10 ";
		String translateWorksName ="";
		if(n.indexOf("$a")>0)
			translateWorksName ="|a"+n.split("\\$a")[1].split("\\$")[0];
		String language = "|l中文";
		
		
		String output =prefix+translateWorksName+language+"\r\n";
		
		return output;
	}
	
	public String setSignal245(String n) {
		
		String prefix = "245 10 ";
		String mainName = "|a"+n.split("\\$a")[1].split("\\$")[0];
		String number ="";
		if(n.indexOf("$h")>0)
			number = ". |n"+n.split("\\$h")[1].split("\\$")[0];
		
		String numberName = "";
		if(n.indexOf("$i")>0)
			numberName = ". |p"+n.split("\\$i")[1].split("\\$")[0];
		
		String paraName = "";
		 if(n.indexOf("$e")>0)
			 paraName = " :|b"+n.split("\\$e")[1].split("\\$")[0];
		 
		String books = "";
		if(n.indexOf("$f")>0)
			books = " /|c"+n.split("\\$f")[1].split("\\$")[0];
		
		String output =prefix+mainName+number+numberName+paraName+books+"\r\n";
		
		return output;
	}
	private String setSignal250(String n) {
		
		String prefix = "250    ";
		String firstEdition = "";
		
		if(n.indexOf("$a")>0)
			firstEdition = "|a"+n.split("\\$a")[1].split("\\$")[0];
		
			
		
		String output =prefix+firstEdition+"\r\n";
		
		return output;
	}
	public String setSignal260(String n) {
		
		String prefix = "260    ";
		String place = "";
		if(n.indexOf("$a")>0)
			place = "|a"+n.split("\\$a")[1].split("\\$")[0];
		
		String author = "";
		if(n.indexOf("$c")>0)
			author = " :|b"+n.split("\\$c")[1].split("\\$")[0];
		
		String year = "";
		if(n.indexOf("$d")>0)
			year = ", |c"+n.split("\\$d")[1].split("\\$")[0];
		
		String output =prefix+place+author+year+"\r\n";
		
		return output;
	}
	public static void main(String[] str) {
		
		String test="200 1  $a青卿畫世(245|a)$e陳俊卿作品集(245|b)$f張至敏(245|c, 700|a, 楊雅筑(245|c ,700|a)編輯(700|e)\r\n" + 
				"       $h編次(245|n) $i編次名稱(245|p)";
		System.out.println("result: "+test.indexOf("$a"));
		DataConvert2xx dataC = new DataConvert2xx();
		System.out.println("result: "+dataC.setSignal245(test));
		
	}

	@Override
	public void putInput(String n) {
		// TODO Auto-generated method stub
		String prefixNumber = n.substring(0,3);
		switch(prefixNumber){
		case "200":
			signalData.add(setSignal245(n));
			break;
		case "205":
			signalData.add(setSignal250(n));
			break;
		case "454":
			signalData.add(setSignal240(n));
			break;
		case "210":
			signalData.add(setSignal260(n));
			break;
		default:
			break;
		
		}
	}

	@Override
	public List<String> getOutPut() {
		// TODO Auto-generated method stub
		return signalData;
	}
}
