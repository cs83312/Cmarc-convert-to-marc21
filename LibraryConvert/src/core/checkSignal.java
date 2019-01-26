package core;

import java.util.Hashtable;

public class checkSignal {

	String[] checkCode={"000","008","017","020","040","066","084",
			"100","240","245","246","250","260","300"
			,"490","650","700","830"};
	Hashtable<String,Integer> hm=new Hashtable<String,Integer>();  
	
	public checkSignal(){
		for(int i=0;i<checkCode.length;i++)
		{
			hm.put(checkCode[i],-1);
			
		}
	}
	public Hashtable<String,Integer> signalCheck(){
		
		return hm;
	}
}
