package core;

public class DataConvert1xx {

	private String setSignal100(String n){
		String mainAuthorName = "|a"+n.split("%f")[1].split("%")[0];
		String froiegnName = null;
		String book = null;
		
		
		String output = "100 1  "+mainAuthorName;
		
		return output;
	}
	
	
}
