
package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    //Complete the checkMagazine function below
    //space seperated strings magazine and note
    //use only whole words
    public static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        //put magazine words into hashset
        for (String magazineString : magazine){
            Integer magazineStringCount = magazineMap.containsKey(magazineString) ? magazineMap.get(magazineString) : 0;
            magazineStringCount++;
            magazineMap.put(magazineString, magazineStringCount);
        }
        
        //check if note is contained in magazine
        for (String noteString : note) {
            //note string is in the map, then either decrement the count or remove from the string
            if ( magazineMap.containsKey(noteString)){
               Integer magazineStringCount = magazineMap.get(noteString);
               if ( magazineStringCount > 1){
                   magazineStringCount--;
                   magazineMap.put(noteString, magazineStringCount);
               }
               else{
                   magazineMap.remove(noteString);
               }
            }
            //note string not in the map
            else{
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }

}
