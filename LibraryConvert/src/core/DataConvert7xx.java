package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert7xx extends ControlPanel{

	
	public List<String> signalData  ;    
    private String[] matchStr= {"執行編輯","總編輯","第二著者","編輯","作詞","主演","攝影","圖","編","譯"};
    
		
    public DataConvert7xx() {
    	this.signalData = new ArrayList<>();
    }
    
    // 700 圖，攝影，主演，作詞
    private String setSignal700(String n){
    	
    	String prefix = "700 1  ";
    	
    	if(n.indexOf("$g")>0){
    	String secAuthorName = n.split("\\$g")[1].split("\\$")[0];
    	int sTail = secAuthorName.length();
    	//process sec auth
    	if(findBook(secAuthorName,sTail)>0){
    		System.out.println("debug:"+secAuthorName);
        	String bookAuth = getBook(secAuthorName,sTail);
        	String book = "|e"+bookAuth;
        	String name = "|a"+secAuthorName.substring(0,sTail - bookAuth.length());	  
        	String out = prefix+name+book+"\r\n";
        	signalData.add(out);
    		}
    	
    	}
    	//process main auth
    	if(n.indexOf("$f")>0){
    		String mainAuthorName = n.split("\\$f")[1].split("\\$")[0];
    	int tail = mainAuthorName.length();
		if(findBook(mainAuthorName,tail)>0){
    	String bookAuth = getBook(mainAuthorName,tail);
    	String book = "|e"+bookAuth;
    	String name = "|a"+mainAuthorName.substring(0,tail - bookAuth.length());	  
    	String out = prefix+name+book+"\r\n";
    	return out;
		}
		}
	
		return "";
		
    }
    public int findBook(String mainAuthorName,int tail){
    	
    	String s100 = "-1";
    	String s = "-1";
    	DataConvert1xx match100 = new DataConvert1xx();
    	
    	
    	
    	
    	for(int i=0;i<match100.matchStr.length;i++){
    	s100= ((mainAuthorName.indexOf(match100.matchStr[i])>0)?"1":"-1");
		if(s100.matches("1"))break;}
    	
    	
    	
    	if(s100=="-1")
    		for(int i=0;i<matchStr.length;i++){
    			s= ((mainAuthorName.indexOf(matchStr[i])>0)?"1":"-1");
    			if(s.matches("1"))
    				break;
    		}
    			
   	
	if(s.matches("1"))
		return 1;
	else if(s.matches("-1"))
    	return -1;
	else 
		return -1;
    }
    public String getBook(String mainAuthorName,int tail){
    	
    	String output = "";
    	for(int i=0;i<matchStr.length;i++){
    		output = ((mainAuthorName.indexOf(matchStr[i])>0)?matchStr[i]:"");
    		if(output!="")
    			break;
    	}
    	
    	return output;
    }
    public String multiSignal700(String name){
		String prefix = "700 1  ";
		String aName = "|a"+name;
		String output = prefix+aName+"\r\n";
		return output;
	}
    
	@Override
	public void putInput(String n) {
		// TODO Auto-generated method stub
		String prefixNumber = n.substring(0,3);
		switch(prefixNumber){
		case "200":
			signalData.add(setSignal700(n));
			break;
		default:
			break;
		
		}
	}

	@Override
	public List<String> getOutPut() {
		// TODO Auto-generated method stub
		return signalData;
	}
    

}
