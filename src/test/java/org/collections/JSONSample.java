package org.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonArray;

public class JSONSample {
public static void main(String[] args) throws IOException, ParseException {
	FileReader file = new FileReader("C:\\Users\\nagav\\eclipse-workspace\\API\\src\\test\\resources\\Read.json");
	JSONParser jsonparser = new JSONParser();
	Object parse = jsonparser.parse(file);
	JSONObject json=(JSONObject)parse;
	
	Object object = json.get("name");
	String s1=(String)object;
	System.out.println(s1);
	
	System.out.println((String)json.get("role"));
	
	Object object2 = json.get("courses");
	JSONArray jsonarray = (JSONArray)object2;
	for (int i = 0; i < jsonarray.size(); i++) {
		System.out.println((String)jsonarray.get(i));
	}
	
	Object object3 = json.get("address");
	JSONObject jsonobject=(JSONObject)object3;
	System.out.println((String)jsonobject.get("city"));
	System.out.println((String)jsonobject.get("state"));
	System.out.println((String)jsonobject.get("country"));
	
	Object object4 = json.get("employees");
	JSONArray jsonarray1=(JSONArray)object4;
	for (int i = 0; i < jsonarray1.size(); i++) {
		Object object5 = jsonarray1.get(i);
		JSONObject jsonobject1=(JSONObject)object5;
		System.out.println((String)jsonobject1.get("name"));
		System.out.println(jsonobject1.get("id"));
		System.out.println(jsonobject1.get("status"));
		
	}
	
}
}
