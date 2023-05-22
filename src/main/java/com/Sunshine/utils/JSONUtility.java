package com.Sunshine.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtility {
	
	/*public void readjson() throws IOException  {

		JSONParser jp = new JSONParser();// to parse data from json file to java use jsonparser
		
		FileReader fr = new FileReader("C:\\\\Users\\\\AnushaYaramal-Kairos\\\\eclipse-workspace\\\\com.Sunshine\\\\login.json");// require the location of json file
		//return null;
		
		Object obj = jp.parse(fr); // java obj
		
		JSONObject userlogobj = (JSONObject)obj; // json obj --need to convert java obj to json obj //down-casting
		//String value = (String) userlogobj.get("url");
		JSONArray userlogArray = (JSONArray) userlogobj.get("Login_Data"); // here data is in json array
		
		// now json array is converted into java array

		String arr[] = new String[userlogArray.size()];
		for (int i = 0; i < userlogArray.size(); i++) {// every ele in json array are json objects
			JSONObject users = (JSONObject) userlogArray.get(i);

			String user = (String) users.get("username");
			String pwd = (String) users.get("Password");
			// now we need to add the json obj's from jsonArray to normal array
			arr[i] = user + " ," + pwd;

		}

	return arr;

	}*/
	

       @DataProvider (name="login")
	public String getdata(String Key) throws IOException {
		
		HashMap<String,Object> mapper=(HashMap<String, Object>) new ObjectMapper()
			.readValue(new File("./Test_data/login.json"),new TypeReference<Map<String,Object>>(){
				
			});

			//System.out.println(mapper.size());
			
			for(Map.Entry<String,Object>m:mapper.entrySet()) {
				System.out.println(m.getKey()+":"+m.getValue());
			}
		return  (String)mapper.get(Key);
		
		
	}
	
/*	@DataProvider(name ="login")
	public String jsonread( Object key) throws Exception {

	
		FileReader fileobj=new FileReader(ConstantUtilities.JsonFilePath);
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(fileobj);
		HashMap map=(HashMap)obj;
		Set <String >s=map.entrySet();
		System.out.println(s.size());
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Object>e=(Map.Entry)i.next();
			
		}
		
		return (String)map.get(key);
		
	}
	*/
		
	/*	@DataProvider(name = "login")
		public Object[][] getData(String Key)  throws IOException, ParseException, org.json.simple.parser.ParseException {
			
			JSONParser jsonParser = new JSONParser();
			int i = 0;
	
		JSONArray Array = (JSONArray) jsonParser.parse(new FileReader("C:\\Users\\AnushaYaramal-Kairos\\"
				+ "eclipse-workspace\\com.Sunshine\\Test_data\\login.json"));

		Object[][] data = new Object[Array.size()][1];
		for (Map<String,String> Map : (List<Map<String,String>>) Array) {
		data[i][0]=Map;

		i++;

		}

		return data;

		}*/

		}

/*try {
	Map<String,Object> userdata=mapper.readValue(fileobj, new TypeReference<Map<String,Object>>(){
	});
	System.out.println("username"+ userdata.get("Username"));
	System.out.println("Password"+userdata.get("Password"));
*/	