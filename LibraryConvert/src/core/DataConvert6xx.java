package core;

public class DataConvert6xx {
	
	
	/*
	 * test
	    606    $2cst$a¦è¬vµe(650|a)
	    606    $2cst$aµe¥U(650|a)
	 */
	
private String setSignal650(String n) {
		
		String prefix = "650  7 ";
		String subject = "|a"+n.split("\\$a")[1].split("\\$")[0];
		String suffix = "|2lcstt";
		String out = prefix+subject+suffix;
		return out;
	}

}
