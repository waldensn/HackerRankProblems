
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.json.JSONObject;
//import org.json.JSONTokener;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */

//for year 2011, answer is 516
public class RestApiIntermediateCert {
    public static int getNumDraws(int year){
        int numDraws = 0;
        
        try
        {
            URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            int status = con.getResponseCode();
            InputStream is = url.openStream();
            JsonReader reader = Json.createReader(is);
            JsonObject object = reader.readObject();
            int numPages = object.getInt("total_pages");
            JsonArray data = object.getJsonArray("data");
            con.disconnect();
           for( int i = 1; i <= numPages; i++ ){
               
            //make api call for the current page
            String apiUrl = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&page=" + i;
            url = new URL(apiUrl);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            status = con.getResponseCode();
            is = url.openStream();
            reader = Json.createReader(is);
            object = reader.readObject();
            data = object.getJsonArray("data");
            con.disconnect(); 
            
            //loop through the data, sum up draw matches
             for ( int j = 0; j < data.size(); j++){
                 if ( data.get(j).asJsonObject().getString("team1goals").equals(data.get(j).asJsonObject().getString("team2goals") ) ) {
                     numDraws++;
                 }
             }
            }           
        } 
        catch (Exception e){return -1;}
         
        return numDraws;
    }
    
    //get winner of a competition for a year, add up the goals they scored that year
    //for UEFA Champions League 2011, answer is 28
    public static int getWinnerTotalGoals(String competition, int year) {
        int numGoals = 0;
        try
        {
            String apiUrl = "https://jsonmock.hackerrank.com/api/football_competitions?name=" + competition + "&year=" + year;
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            int status = con.getResponseCode();
            InputStream is = url.openStream();
            JsonReader reader = Json.createReader(is);
            JsonObject object = reader.readObject();
            String winner = object.get("data").asJsonArray().get(0).asJsonObject().getString("winner");
            
            //get goals by the winner
            apiUrl = "https://jsonmock.hackerrank.com/api/football_matches?competition=" + competition + "&year=" + year;
            url = new URL(apiUrl);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            status = con.getResponseCode();
            is = url.openStream();
            reader = Json.createReader(is);
            object = reader.readObject();
            int numPages = object.getInt("total_pages");
            JsonArray data = object.getJsonArray("data");
            con.disconnect();
            
            for( int i = 1; i <= numPages; i++ ){
             
                apiUrl = "https://jsonmock.hackerrank.com/api/football_matches?competition=" + competition + "&year=" + year+ "&page=" + i;
                url = new URL(apiUrl);
                con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.addRequestProperty("Content-Type", "applicaton/json");
                con.connect();
                status = con.getResponseCode();
                is = url.openStream();
                reader = Json.createReader(is);
                object = reader.readObject();
                data = object.getJsonArray("data");
                con.disconnect(); 

                 //loop through the data, sum up draw matches
                 for ( int j = 0; j < data.size(); j++){
                     if ( data.get(j).asJsonObject().getString("team1").equals(winner) ) {
                         numGoals += Integer.valueOf( data.get(j).asJsonObject().getString("team1goals") );
                     }
                     if ( data.get(j).asJsonObject().getString("team2").equals(winner) ) {
                         numGoals += Integer.valueOf( data.get(j).asJsonObject().getString("team2goals") );
                     }
                 }
           }   
        }
        catch (Exception e){return -1;}
        
        return numGoals;          
    }
    
}
