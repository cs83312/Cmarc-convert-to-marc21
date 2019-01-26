package core;

import java.util.ArrayList;
import java.util.List;

public class DataConvert1xx extends ControlPanel{

	
	 public List<String> signalData  ;    
     public String[] matchStr={"�ɺt","�@��","�s��","�s�g","�@","��","��"};
 
	 
	 
	 
	 
	 
	    public DataConvert1xx() {
	    	this.signalData = new ArrayList<>();
	    }
	
	//�ۡA�@�A���A�s�g
	private String setSignal100(String n){
		//�s�W 100 �s�� �A��A�@���A�ɺt�D 700 �ϡA��v�A�D�t�A�@��
		String mainAuthorName ="";
		int tail = 0;
		if(n.indexOf("$f")>0)
		{
		mainAuthorName = n.split("\\$f")[1].split("\\$")[0];
		tail = mainAuthorName.length();
		}
		
		
		if(findBook(mainAuthorName,tail)>0){
			
		String prefix = "100 1  ";
		
		String foriegnName = "";
		String bookAuth = getBook(mainAuthorName,tail);
		String book = "|e"+bookAuth;
		String allAuthor = mainAuthorName.substring(0,tail-bookAuth.length());
		String name = "|a"+allAuthor.split("[,]")[0];
	
		for(int i=1;i<allAuthor.split("[,]").length;i++){
			signalData.add(mutliSignal700(allAuthor.split("[,]")[i],bookAuth));
		}
		
		String output = prefix+name+foriegnName+book+"\r\n";
		
		return output;
		}
		else
		return "";
		
	}
public int findBook(String mainAuthorName,int tail){
    	
    	String s ="";
    	
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
	public String mutliSignal700(String name,String book){
		String prefix = "700 1  ";
		String aName = "|a"+name;
		String aBook = "|e"+book;
		String output = prefix+aName+aBook+"\r\n";
		return output;
	}
	@Override
	public void putInput(String n) {
		// TODO Auto-generated method stub
		String prefixNumber = n.substring(0,3);
		switch(prefixNumber){
		case "200":
			signalData.add(setSignal100(n));
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
