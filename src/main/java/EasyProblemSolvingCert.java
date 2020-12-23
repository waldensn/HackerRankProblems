
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
public class EasyProblemSolvingCert {
//    static int getBatteryLife(int[] events){
//        int charge = 50;
//        for (int i = 0; i < events.length; i++){
//            charge += events[i];           
//            if ( charge > 100){charge = 100;}
//            else if (charge < 0){charge = 0;}
//        }
//        return charge;
//    }
//    
//    static int[] stringAnagram(String[] dictionary, String[] query){
//        //an array of ints, same length as query, with each int is the count of anagrams in dictionary
//        //for strings to be anagrams,they must be the same length
//        int[] arrays = new int[query.length];
//        int numAnagrams = 0;
//        for (int i = 0; i < query.length; i++){
//            numAnagrams = 0;
//            String currentQuery = query[i];
//            
//            for ( int j = 0; j < dictionary.length; j++){
//                if ( isAnagram(dictionary[j].toCharArray(), query[i].toCharArray() ) ){
//                    numAnagrams++;
//                }
//            }
//            
//            arrays[i] = numAnagrams;
//        }
//        
//        return arrays;
//    }
//    
//   static boolean isAnagram(char[] a, char[] b){
//        if ( a.length != b.length ){return false;}
//        Arrays.sort(a);
//        Arrays.sort(b);
//        return Arrays.equals(a, b);
//    }
    
    //this answer doesn't solve in enough time
//   static String vowelSubstring(String s, int k){
//        int numVowelsInSubstring = 0;
//        int maxNumVowels = 0;
//        String answer = "";
//        for (int i = 0; i <= s.length() - k ; i++){
//            String substring = s.substring(i, i + k );
//
//            numVowelsInSubstring = getVowelCount(substring);
//            
//            if ( numVowelsInSubstring > maxNumVowels ){
//                maxNumVowels = numVowelsInSubstring;
//                answer = substring;
//                }
//        }
//        
//        if ( answer.length() == 0){
//            return "Not found!";
//        }
//        else {
//            return answer;
//        }
//    
//   }
    
    static String vowelSubstring(String s, int k){
        int numVowelsInSubstring = 0;
        int maxNumVowels = 0;
        String answer = "";
        boolean hasCountedFirstSubstring = false;
        //string is czaredqatmoi, length 12, index from 0 to 11, should check from 0 to 7
        //k = 5
        for (int i = 0; i < s.length() - k + 1 ; i++){
            String substring = "";
            //count the initial substring of length k, then use sliding window
            if ( !hasCountedFirstSubstring ){
                substring = s.substring(i, i + k);
                numVowelsInSubstring = getVowelCount(substring);
                hasCountedFirstSubstring = true;
            }
            //if first letter of next substring is a vowel, then add
            // if first letter of current substring is a vowel, then subtract
            else{
                if ( isVowel( s.charAt(i+k-1) )){
                    numVowelsInSubstring++;
                }
                if( isVowel( s.charAt(i-1) ) ){
                    numVowelsInSubstring--;
                }
                substring = s.substring(i, i + k);
            }
            
            if ( numVowelsInSubstring > maxNumVowels ){
                maxNumVowels = numVowelsInSubstring;
                answer = substring;
                }
        }
        
        if ( answer.length() == 0){
            return "Not found!";
        }
        else {
            return answer;
        }
    
   }
   
   static int getVowelCount(String s){
       int count = 0;
       for ( int i = 0; i < s.length(); i++){
         if ( isVowel(s.charAt(i)) ){
                count++;
            }
       }
       return count;
   }
   
   static boolean isVowel(char c){
       return  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
   }
   
   //points on highway need repair, equal num of crews available
   //one crew must be assigned to each job
   //min total amount of distance traveled by all crews, so they can begin work?
   //if crews are a 1,3,5 and repairs required at 3,5,7
   //first line is n, num of crews and jobs
   
   static long getMinCost(List<Integer> crew_id, List<Integer> job_id){
        long answer = 0;
        //greedy algorithm?
        //take a crew location, find nearest job to it?
        //smallest crew location, to smallest job location?
        Collections.sort(crew_id);
        Collections.sort(job_id);
        for ( int i = 0; i < crew_id.size(); i++){
            answer += Math.abs(crew_id.get(i) - job_id.get(i));
        }
        return answer;
   }
}
