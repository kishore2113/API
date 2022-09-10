package org.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PetJson {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader("C:\\Users\\nagav\\eclipse-workspace\\API\\src\\test\\resources\\Pet.json");
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(file);
		JSONObject json = (JSONObject) parse;

		Object object2 = json.get("id");
		System.out.println(object2);

		Object object = json.get("category");
		JSONObject jsonobject = (JSONObject) object;
		System.out.println(jsonobject.get("id"));
		System.out.println((String) jsonobject.get("name"));

		System.out.println((String) json.get("name"));

		Object object3 = json.get("photoUrls");
		JSONArray jsonarray = (JSONArray) object3;
		for (int i = 0; i < jsonarray.size(); i++) {
			System.out.println((String) jsonarray.get(i));
		}

		Object object4 = json.get("tags");
		JSONArray jsonarray1 = (JSONArray) object4;
		for (int i = 0; i < jsonarray1.size(); i++) {
			Object object5 = jsonarray1.get(i);
			JSONObject object6=(JSONObject)object5;
			System.out.println(object6.get("id"));
			System.out.println((String)object6.get("name"));
		}
		
		System.out.println((String)json.get("status"));

	}
}
