package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert5xx extends ControlPanel {
	
	public List<String> signalData  ;    
    
    public DataConvert5xx() {
    	this.signalData = new ArrayList<>();
    }

	@Override
	public void putInput(String n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getOutPut() {
		// TODO Auto-generated method stub
		return signalData;
	}
    


}
