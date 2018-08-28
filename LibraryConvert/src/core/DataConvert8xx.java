package core;

public class DataConvert8xx {
	
	
	
	/*
	 * test
	 * 225 1  $a現代主義文學論叢(490|a及830|a)$v27(490|v及830|v)	
	 */
private String setSignal830(String n) {
		
		String prefix = "490  0 ";
		String name = "|a"+n.split("\\$a")[1].split("\\$")[0]+" ;";
		String version = "|v"+n.split("\\$v")[1].split("\\$")[0];
		String out = prefix+name+version;
		return out;
	}

}
