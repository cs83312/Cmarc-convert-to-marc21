package core;

public class DataConvert8xx {
	
	
	
	/*
	 * test
	 * 225 1  $a�{�N�D�q��ǽ��O(490|a��830|a)$v27(490|v��830|v)	
	 */
private String setSignal830(String n) {
		
		String prefix = "490  0 ";
		String name = "|a"+n.split("\\$a")[1].split("\\$")[0]+" ;";
		String version = "|v"+n.split("\\$v")[1].split("\\$")[0];
		String out = prefix+name+version;
		return out;
	}

}
