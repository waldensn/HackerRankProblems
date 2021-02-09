
package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
public class AlternatingChars {
    // Complete the alternatingCharacters function below.
    //string with A and B, delete chars until there are only alternating chars
    static int alternatingCharacters(String s) {
        int numDeleted = 0;

        //check if adjacent chars are the same, if so delete one
        for (int i = 0; i < s.length()-1; i++){
            if ( s.charAt(i) == s.charAt(i+1)  ) {
                numDeleted++;
            }
        }
        return numDeleted;
    }
}
