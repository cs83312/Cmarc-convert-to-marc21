package core;

public class DataConvert2xx {

	//unfinish
	private String setSignal240(String n){
		
		String prefix = "240 10 ";
		String translateWorksName =null;
		String language = "|l����";
		
		
		String output =prefix+translateWorksName+language;
		
		return output;
	}
	
	public String setSignal245(String n) {
		
		String prefix = "245 10 ";
		String mainName = "|a"+n.split("\\$a")[1].split("\\$")[0]+". ";
		
		String number = "|n"+n.split("\\$h")[1].split("\\$")[0]+" ,";
		String numberName = "|p"+n.split("\\$h")[1].split("\\$")[0]+" :";
		String paraName = "|b"+n.split("\\$i")[1].split("\\$")[0]+" /";
		System.out.println("debug: "+paraName);
		String books = "|c"+n.split("\\$f")[1].split("\\$")[0];
		String output =prefix+mainName+number+numberName+paraName+books;
		
		return output;
	}
	private String setSignal250(String n) {
		
		String prefix = "250    ";
		String firstEdition = "|a"+n.split("\\$a")[1].split("\\$")[0];
		String output =prefix+firstEdition;
		
		return output;
	}
	public String setSignal260(String n) {
		
		String prefix = "260    ";
		String place = "|a"+n.split("\\$a")[1].split("\\$")[0]+" :";
		String author = "|b"+n.split("\\$c")[1].split("\\$")[0]+", ";
		String year = "|c"+n.split("\\$d")[1].split("\\$")[0];
		 
		
		String output =prefix+place+author+year;
		
		return output;
	}
	public static void main(String[] str) {
		
		String test="200 1  $a�C��e�@(245|a)$e���T��@�~��(245|b)$f�i�ܱ�(245|c, 700|a, ������(245|c ,700|a)�s��(700|e)\r\n" + 
				"       $h�s��(245|n) $i�s���W��(245|p)";
		DataConvert2xx dataC = new DataConvert2xx();
		System.out.println("result: "+dataC.setSignal245(test));
		
	}
}
