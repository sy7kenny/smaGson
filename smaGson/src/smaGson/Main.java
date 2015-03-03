package smaGson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonSetParObj = jsonGen();
		
		DBObject data = (DBObject)JSON.parse(jsonSetParObj);
		//System.out.println(jsonSetParObj);
		MongoClientURI uri = new MongoClientURI("mongodb://test:test@ds050077.mongolab.com:50077/experimental");
		try{
			MongoClient mongoClient = new MongoClient(uri);
			DB db = mongoClient.getDB(uri.getDatabase());
			System.out.println("Connect to database successfully");
			DBCollection testJson = db.getCollection("testJson");
			//testJson.insert(data);
			DBCursor cursor = testJson.find();
			int i=1;
	         while (cursor.hasNext()) { 
	            System.out.println("Inserted Document: "+i); 
	            DBObject doc = cursor.next();
	            String json1 = doc.toString();
	            System.out.println(json1); 
	            
	            i++;
	         }
		}catch(Exception e){
			System.out.println("Failed");
		}
	}

	public static String jsonGen(){
		Database d1 = new Database();
		d1.setTime("Now");
		
		Overall o1 = new Overall();
		o1.setcPack("1.0");
		o1.settMax("22");
		o1.settMin("21");
		o1.setvMax("3.6");
		o1.setvMin("3.4");
		o1.setvPack("50.1");
		
		d1.setOverall(o1);
		
		Power p1 = new Power();
		p1.setpB("1082.50");
		p1.setpG("146.29");
		p1.setpH("489.87");
		p1.setpP("1727.66");
		
		d1.setPower(p1);
		
		CellIndv c1 = new CellIndv();
		c1.setCellBalance("True");
		c1.setCellCur("0.3");
		c1.setCellSocC("1.0");
		c1.setCellSohC("0.98");
		c1.setCellSohP("0.8");
		c1.setCellTemp("24");
		c1.setCellVol("3.4");
		c1.setCellNumber("1");
		
		CellIndv c2 = new CellIndv();
		c2.setCellBalance("True");
		c2.setCellCur("0.3");
		c2.setCellSocC("1.0");
		c2.setCellSohC("0.98");
		c2.setCellSohP("0.8");
		c2.setCellTemp("24");
		c2.setCellVol("3.4");
		c2.setCellNumber("2");
		List<CellIndv> col1 = new ArrayList<CellIndv>();
		col1.add(c1);
		col1.add(c2);
		
		d1.setCellCollect(col1);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonSetParObj = gson.toJson(d1);
		
		return gson.toJson(d1);
	}
}


