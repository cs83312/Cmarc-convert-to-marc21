package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert3xx extends ControlPanel{
	
	String signalData300 = "300    |a�� :|b�m�� ;|c���� \r\n";
	
	//215 ��300 �٨S��
	 public List<String> signalData  ;    
     
	    public DataConvert3xx() {
	    	this.signalData = new ArrayList<>();
	    }
	private String setSignal300(String n) {
		
		
		String out = null;
		return out;
	}
	@Override
	public void putInput(String n) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<String> getOutPut() {
		// TODO Auto-generated method stub
		signalData.add(signalData300);
		return signalData;
	}
	
	
	

}
