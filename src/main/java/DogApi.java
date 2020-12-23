/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import org.json.*;

public class DogApi {
    public static String getDogImg(){
        try
        {
            //URL url = new URL("https://dog.ceo/api/breeds/image/random");
            URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?team1=Barcelona&year=2011");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            int status = con.getResponseCode();
            //String response = "";
            //Scanner scanner = new Scanner(url.openStream());
            JSONTokener tokener = new JSONTokener(url.openStream());
            JSONObject response = new JSONObject(tokener);
            
           //return response.toString();
           //{"per_page":10,"total":6,"data":[{"team1goals":"2","round":"GroupH","year":2011,"team1":"Barcelona","team2":"AC Milan","competition":"UEFA Champions League","team2goals":"2"},{"team1goals":"2","round":"GroupH","year":2011,"team1":"Barcelona","team2":"Viktoria Plzen","competition":"UEFA Champions League","team2goals":"0"},{"team1goals":"4","round":"GroupH","year":2011,"team1":"Barcelona","team2":"BATE Borisov","competition":"UEFA Champions League","team2goals":"0"},{"team1goals":"7","round":"R16","year":2011,"team1":"Barcelona","team2":"Bayer Leverkusen","competition":"UEFA Champions League","team2goals":"1"},{"team1goals":"3","round":"QF","year":2011,"team1":"Barcelona","team2":"AC Milan","competition":"UEFA Champions League","team2goals":"1"},{"team1goals":"2","round":"SF","year":2011,"team1":"Barcelona","team2":"Chelsea","competition":"UEFA Champions League","team2goals":"2"}],"page":1,"total_pages":1}
           //return String.valueOf(response.getInt("per_page"));
           StringBuilder goals = new StringBuilder();
           JSONArray games = response.getJSONArray("data");
           for(int i = 0; i < games.length(); i++){
              goals.append(((JSONObject)games.get(i)).getInt("team1goals") ).append(" ");
           }
           //return response.getJSONArray("data").toList();
           return goals.toString();
        }
        catch (Exception e){return "Error: " + e.getMessage();}
    }
}
