package core;

public class Experiment {

	static String cmarc = "000    cam0(����)\r\n" + 
			"010 0  $a978-986-05-6036-7(020|a)$b����(020|q)$dNT$500(020|c)\r\n" + 
			"091    $atw$bCIP107008650(����)\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"101 0  $achi(����)\r\n" + 
			"102    $atw(����)\r\n" + 
			"200 1  $a�C��e�@(245|a)$e���T��@�~��(245|b)$f�i�ܱ�(245|c, 700|a, ������(245|c ,700|a)�s��(700|e)\r\n" + 
			"       $h�s��(245|n) $i�s���W��(245|p)\r\n" + 
			"205    $a�쪩(250|a)\r\n" + 
			"210    $a��饫(260|a)$c�祫��Ƨ�(260|b)$d��107(260|c)\r\n" + 
			"211    $a1806(����)\r\n" + 
			"215 0  $a  ��(300|a) $c��(300|b) $d  ����(300|c)\r\n" + 
			"225 1  $a�{�N�D�q��ǽ��O(490|a��830|a)$v27(490|v��830|v)\r\n" + 
			"454  1 $12001 $aThe history of medicine(240|a)\r\n" + 
			"606    $2cst$a��v�e(650|a)\r\n" + 
			"606    $2cst$a�e�U(650|a)\r\n" + 
			"681    $a947.5(084|a)  ";
	public static void main(String[] str) {
		
		DataConvert0xx data0 = new DataConvert0xx();
		int indexof = cmarc.indexOf("010");
		int indexend = indexof + cmarc.indexOf("\\r");
		System.out.println(indexend);

		System.out.println(cmarc.split("010")[1].split("\\r")[0]);
		
		
	}
	
	
	
	
}
