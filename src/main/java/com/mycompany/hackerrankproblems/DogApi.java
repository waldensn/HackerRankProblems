package com.mycompany.hackerrankproblems;

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

//Get the image for an API that returns pictures of dogs
public class DogApi {
    public static String getDogImg(){
        try
        {
            URL url = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Content-Type", "applicaton/json");
            con.connect();
            int status = con.getResponseCode();
            JSONTokener tokener = new JSONTokener(url.openStream());
            JSONObject response = new JSONObject(tokener);
            return response.getString("message");
        }
        catch (Exception e){return "Error: " + e.getMessage();}
    }
}
