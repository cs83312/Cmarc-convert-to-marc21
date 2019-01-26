package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert8xx extends ControlPanel{
	
	
	public List<String> signalData  ;    
    
    public DataConvert8xx() {
    	this.signalData = new ArrayList<>();
    }
	/*
	 * test
	 * 225 1  $a�{�N�D�q��ǽ��O(490|a��830|a)$v27(490|v��830|v)	
	 */
private String setSignal830(String n) {
		
		String prefix = "830  0 ";
		String name = "";
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
			signalData.add(setSignal830(n));
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
