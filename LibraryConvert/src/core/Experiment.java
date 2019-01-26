package core;

import java.util.List;

public class Experiment {

	static String cmarc = 
			"010 0  $a978-986-05-6036-7(020|a)$b����(020|q)$dNT$500(020|c)\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"200 1  $a�C��e�@(245|a)$e���T��@�~��(245|b)$f�i�ܱ�(245|c, 700|a, �������s�g"
			+ "$h�s��(245|n) $i�s���W��(245|p)\r\n" + 
			"205    $a�쪩(250|a)\r\n" + 
			"210    $a��饫(260|a)$c�祫��Ƨ�(260|b)$d��107(260|c)\r\n" + 
			"215 0  $a  ��(300|a) $c��(300|b) $d  ����(300|c)\r\n" + 
			"225 1  $a�{�N�D�q��ǽ��O(490|a��830|a)$v27(490|v��830|v)\r\n" + 
			"454  1 $12001 $aThe history of medicine(240|a)\r\n" + 
			"606    $2cst$a��v�e(650|a)\r\n" + 
			"606    $2cst$a�e�U(650|a)\r\n" + 
			"681    $a947.5(084|a)\r\n"+
			"-1   ";
	static String cmarcStandard = "010 0  $a978-986-05-6036-7$b����$dNT$500\r\n" + 
			"100    $a20180612d2018    k   0chiy50      e\r\n" + 
			"200 1  $a�C��e�@$e���T��@�~��$f�i�ܱ�, �巨�����ɺt$h�s��$i�s���W��\r\n" + 
			"205    $a�쪩\r\n" + 
			"210    $a��饫$c�祫��Ƨ�$d��107\r\n" + 
			"215 0  $a  ��$c��$d  ����\r\n" + 
			"225 1  $a�{�N�D�q��ǽ��O$v27\r\n" + 
			"454  1 $12001 $aThe history of medicine\r\n" + 
			"606    $2cst$a��v�e\r\n" + 
			"606    $2cst$a�e�U\r\n" + 
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
