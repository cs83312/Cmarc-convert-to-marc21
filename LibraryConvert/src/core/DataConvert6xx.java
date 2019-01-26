package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert6xx extends ControlPanel{
	
	 public List<String> signalData  ;    
     
	    public DataConvert6xx() {
	    	this.signalData = new ArrayList<>();
	    }
	/*
	 * test
	    606    $2cst$a¦è¬vµe(650|a)
	    606    $2cst$aµe¥U(650|a)
	 */
	
private String setSignal650(String n) {
		
		String prefix = "650  7 ";
		String subject = "|a"+n.split("\\$a")[1].split("\\$")[0].replace("/r/n","");
		String suffix = "|2lcstt";
		String out = prefix+subject+suffix+"\r\n";
		return out;
	}

@Override
public void putInput(String n) {
	// TODO Auto-generated method stub
	String prefixNumber = n.substring(0,3);
	switch(prefixNumber){
	case "606":
		signalData.add(setSignal650(n));
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
