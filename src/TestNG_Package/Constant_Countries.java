package TestNG_Package;

import org.testng.annotations.DataProvider;

public class Constant_Countries {


	public static final String EGYPT_URL = "https://subscribe.jawwy.tv/eg-en";
	public static final String EGYPT_NAME = "Egypt";
	
	public static final String UAE_URL = "https://subscribe.jawwy.tv/ae-en";
	public static final String UAE_NAME = "UAE";
	
	public static final String Algeria_URL = "https://subscribe.jawwy.tv/dz-en";
	public static final String Algeria_NAME = "Algeria";
	
	public static final String Djibouti_URL = "https://subscribe.jawwy.tv/dj-en";
	public static final String Djibouti_NAME = "Djibouti";
	
	public static final String Chad_URL = "https://subscribe.jawwy.tv/td-en"; 
	public static final String Chad_NAME = "Chad";
	
	public static final String Iraq_URL = "https://subscribe.jawwy.tv/iq-en"; 
	public static final String Iraq_NAME = "Iraq";
	
	public static final String Jordan_URL = "https://subscribe.jawwy.tv/jo-en"; 
	public static final String Jordan_NAME = "Jordan";
	
	public static final String Lebanon_URL = "https://subscribe.jawwy.tv/lb-en"; 
	public static final String Lebanon_NAME = "Lebanon";
	
	public static final String Morocco_URL = "https://subscribe.jawwy.tv/ma-en"; 
	public static final String Morocco_NAME = "Morocco";
	
	public static final String Oman_URL = "https://subscribe.jawwy.tv/om-en"; 
	public static final String Oman_NAME = "Oman";
	
	public static final String Tunisia_URL = "https://subscribe.jawwy.tv/tn-en";
	public static final String Tunisia_NAME = "Tunisia";
	
	public static final String Yemen_URL = "https://subscribe.jawwy.tv/ye-en"; 
	public static final String Yemen_NAME = "Yemen";
	
	public static final String Palestine_URL = "https://subscribe.jawwy.tv/ps-en";
	public static final String Palestine_NAME = "Palestine";
	
	public static final String Lite_Subscription ="#lite-selection";
	public static final String Classic_Subscription ="#classic-selection";
	public static final String premium_Subscription ="#premium-selection";

	@DataProvider
	public Object[][] getCountry()
	{
		Object[][] data= new Object[13][5];
		data[0][0]= EGYPT_URL;
		data[0][1]=EGYPT_NAME;
		data[0][2]=Lite_Subscription;
		data[0][3]= Classic_Subscription;
		data[0][4]= premium_Subscription;
						
		data[1][0]= UAE_URL;
		data[1][1]= UAE_NAME;
		data[1][2]=Lite_Subscription;
		data[1][3]= Classic_Subscription;
		data[1][4]= premium_Subscription;
		
		data[2][0]= Algeria_URL;
		data[2][1]= Algeria_NAME;
		data[2][2]=Lite_Subscription;
		data[2][3]= Classic_Subscription;
		data[2][4]= premium_Subscription;
		
		data[3][0]= Djibouti_URL;
		data[3][1]= Djibouti_NAME;
		data[3][2]=Lite_Subscription;
		data[3][3]= Classic_Subscription;
		data[3][4]= premium_Subscription;

		data[4][0]= Chad_URL;
		data[4][1]= Chad_NAME;
		data[4][2]=Lite_Subscription;
		data[4][3]= Classic_Subscription;
		data[4][4]= premium_Subscription;
		
		data[5][0]= Iraq_URL;
		data[5][1]= Iraq_NAME;
		data[5][2]=Lite_Subscription;
		data[5][3]= Classic_Subscription;
		data[5][4]= premium_Subscription;
		
		data[6][0]= Jordan_URL;
		data[6][1]=Jordan_NAME;
		data[6][2]=Lite_Subscription;
		data[6][3]= Classic_Subscription;
		data[6][4]= premium_Subscription;
		
		data[7][0]= Lebanon_URL;
		data[7][1]= Lebanon_NAME;
		data[7][2]=Lite_Subscription;
		data[7][3]= Classic_Subscription;
		data[7][4]= premium_Subscription;
		
		data[8][0]= Morocco_URL;
		data[8][1]= Morocco_NAME;
		data[8][2]=Lite_Subscription;
		data[8][3]= Classic_Subscription;
		data[8][4]= premium_Subscription;
		
		data[9][0]= Oman_URL;
		data[9][1]=Oman_NAME;
		data[9][2]=Lite_Subscription;
		data[9][3]= Classic_Subscription;
		data[9][4]= premium_Subscription;
		
		data[10][0]= Tunisia_URL;
		data[10][1]= Tunisia_NAME;
		data[10][2]=Lite_Subscription;
		data[10][3]= Classic_Subscription;
		data[10][4]= premium_Subscription;
		
		data[11][0]= Yemen_URL;
		data[11][1]= Yemen_NAME;
		data[11][2]=Lite_Subscription;
		data[11][3]= Classic_Subscription;
		data[11][4]= premium_Subscription;
		
		data[12][0]= Palestine_URL;
		data[12][1]= Palestine_NAME;
		data[12][2]=Lite_Subscription;
		data[12][3]= Classic_Subscription;
		data[12][4]= premium_Subscription;
		
		return data;	
	}
}
