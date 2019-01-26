package core;

import java.util.List;

public class Experiment {

	static String cmarc = 
			"010 0  $a978-986-05-6036-7(020|a)$b平裝(020|q)$dNT$500(020|c)\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"200 1  $a青卿畫世(245|a)$e陳俊卿作品集(245|b)$f張至敏(245|c, 700|a, 楊雅筑編寫"
			+ "$h編次(245|n) $i編次名稱(245|p)\r\n" + 
			"205    $a初版(250|a)\r\n" + 
			"210    $a桃園市(260|a)$c桃市文化局(260|b)$d民107(260|c)\r\n" + 
			"215 0  $a  面(300|a) $c圖(300|b) $d  公分(300|c)\r\n" + 
			"225 1  $a現代主義文學論叢(490|a及830|a)$v27(490|v及830|v)\r\n" + 
			"454  1 $12001 $aThe history of medicine(240|a)\r\n" + 
			"606    $2cst$a西洋畫(650|a)\r\n" + 
			"606    $2cst$a畫冊(650|a)\r\n" + 
			"681    $a947.5(084|a)\r\n"+
			"-1   ";
	static String cmarcStandard = "010 0  $a978-986-05-6036-7$b平裝$dNT$500\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"200 1  $a青卿畫世$e陳俊卿作品集$f張至敏, 文楊雅筑導演$h編次$i編次名稱\r\n" + 
			"205    $a初版\r\n" + 
			"210    $a桃園市$c桃市文化局$d民107\r\n" + 
			"215 0  $a  面$c圖$d  公分\r\n" + 
			"225 1  $a現代主義文學論叢$v27\r\n" + 
			"454  1 $12001 $aThe history of medicine\r\n" + 
			"606    $2cst$a西洋畫\r\n" + 
			"606    $2cst$a畫冊\r\n" + 
			"681    $a947.5\r\n"+
			"-1   ";
	public StringBuffer processCmarcToMarc21(String data){
		
		DataConvert0xx data0 = new DataConvert0xx();
		DataConvert1xx data1 = new DataConvert1xx();
		DataConvert2xx data2 = new DataConvert2xx();
		DataConvert3xx data3 = new DataConvert3xx();
		DataConvert4xx data4 = new DataConvert4xx();
		DataConvert5xx data5 = new DataConvert5xx();
		DataConvert6xx data6 = new DataConvert6xx();
		DataConvert7xx data7 = new DataConvert7xx();
		DataConvert8xx data8 = new DataConvert8xx();
		String indexof = data.substring(0,3);
		// classification
		String[] array = data.split("\\n", -1);
		for(int i=0;i<array.length;i++)
		{
			data0.putInput(array[i]);
			data1.putInput(array[i]);
			data2.putInput(array[i]);
			data3.putInput(array[i]);
			data4.putInput(array[i]);
			data5.putInput(array[i]);
			data6.putInput(array[i]);
			data7.putInput(array[i]);
			data8.putInput(array[i]);	
		}
		//test output
		StringBuffer output = new StringBuffer();
		
		for(String out:data0.getOutPut())
		{
		System.out.println(out);
		output.append(out);
		}
		if(data1!=null)
		for(String out:data1.getOutPut())
		{
		System.out.println(out);
		output.append(out);
		}
		for(String out:data2.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data3.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data4.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data5.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data6.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data7.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		for(String out:data8.getOutPut())
		{
			System.out.println(out);output.append(out);
		}
		return output;
		
	}
	public static void main(String[] str) {
		
		DataConvert0xx data0 = new DataConvert0xx();
		DataConvert1xx data1 = new DataConvert1xx();
		DataConvert2xx data2 = new DataConvert2xx();
		DataConvert3xx data3 = new DataConvert3xx();
		DataConvert4xx data4 = new DataConvert4xx();
		DataConvert5xx data5 = new DataConvert5xx();
		DataConvert6xx data6 = new DataConvert6xx();
		DataConvert7xx data7 = new DataConvert7xx();
		DataConvert8xx data8 = new DataConvert8xx();
		
		String indexof = cmarcStandard.substring(0,3);
		// classification
		String[] array = cmarcStandard.split("\\n", -1);
		for(int i=0;i<array.length;i++)
		{
			data0.putInput(array[i]);
			data1.putInput(array[i]);
			data2.putInput(array[i]);
			data3.putInput(array[i]);
			data4.putInput(array[i]);
			data5.putInput(array[i]);
			data6.putInput(array[i]);
			data7.putInput(array[i]);
			data8.putInput(array[i]);
			
		}
		//test output
		for(String out:data0.getOutPut())
		System.out.println(out);
		if(data1!=null)
		for(String out:data1.getOutPut())
		System.out.println(out);
		for(String out:data2.getOutPut())
			System.out.println(out);
		for(String out:data3.getOutPut())
			System.out.println(out);
		for(String out:data4.getOutPut())
			System.out.println(out);
		for(String out:data5.getOutPut())
			System.out.println(out);
		for(String out:data6.getOutPut())
			System.out.println(out);
		for(String out:data7.getOutPut())
			System.out.println(out);
		for(String out:data8.getOutPut())
			System.out.println(out);
	
		
		
		
	}
	
	
	
	
}
