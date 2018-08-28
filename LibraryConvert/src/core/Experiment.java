package core;

public class Experiment {

	static String cmarc = "000    cam0(不轉)\r\n" + 
			"010 0  $a978-986-05-6036-7(020|a)$b平裝(020|q)$dNT$500(020|c)\r\n" + 
			"091    $atw$bCIP107008650(不轉)\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"101 0  $achi(不轉)\r\n" + 
			"102    $atw(不轉)\r\n" + 
			"200 1  $a青卿畫世(245|a)$e陳俊卿作品集(245|b)$f張至敏(245|c, 700|a, 楊雅筑(245|c ,700|a)編輯(700|e)\r\n" + 
			"       $h編次(245|n) $i編次名稱(245|p)\r\n" + 
			"205    $a初版(250|a)\r\n" + 
			"210    $a桃園市(260|a)$c桃市文化局(260|b)$d民107(260|c)\r\n" + 
			"211    $a1806(不轉)\r\n" + 
			"215 0  $a  面(300|a) $c圖(300|b) $d  公分(300|c)\r\n" + 
			"225 1  $a現代主義文學論叢(490|a及830|a)$v27(490|v及830|v)\r\n" + 
			"454  1 $12001 $aThe history of medicine(240|a)\r\n" + 
			"606    $2cst$a西洋畫(650|a)\r\n" + 
			"606    $2cst$a畫冊(650|a)\r\n" + 
			"681    $a947.5(084|a)  ";
	public static void main(String[] str) {
		
		DataConvert0xx data0 = new DataConvert0xx();
		int indexof = cmarc.indexOf("010");
		int indexend = indexof + cmarc.indexOf("\\r");
		System.out.println(indexend);

		System.out.println(cmarc.split("010")[1].split("\\r")[0]);
		
		
	}
	
	
	
	
}
