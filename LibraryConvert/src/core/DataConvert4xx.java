package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert4xx extends ControlPanel{

	
	 public List<String> signalData  ;    
     
	    public DataConvert4xx() {
	    	this.signalData = new ArrayList<>();
	    }
	
	
	
/*
 * test
 * 225 1  $a現代主義文學論叢(490|a及830|a)$v27(490|v及830|v)	
 */
private String setSignal490(String n) {
		
		String prefix = "490 1  ";
		String name ="";
		if(n.indexOf("$a")>0)
			name = "|a"+n.split("\\$a")[1].split("\\$")[0]+" ;";
		String version = "";
		if(n.indexOf("$v")>0)
			version = "|v"+n.split("\\$v")[1].split("\\$")[0];
		String out = prefix+name+version+"\r\n";
		return out;
	}



@Override
public void putInput(String n) {
	// TODO Auto-generated method stub
	String prefixNumber = n.substring(0,3);
	switch(prefixNumber){
	case "225":
		signalData.add(setSignal490(n));
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
