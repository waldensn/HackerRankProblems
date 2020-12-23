
import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/morgan-and-a-string
public class MorganAndString {
       public static String morganAndString(String a, String b) {
           StringBuilder result = new StringBuilder();
           List<Character> charListA = new ArrayList<>();
           List<Character> charListB = new ArrayList<>();
           //put options into lists
           for ( int i = 0; i < a.length(); i++){
               charListA.add(a.charAt(i));
           }
           for ( int i = 0; i < b.length(); i++){
               charListB.add(b.charAt(i));
           }
           //our current options for choosing letters
           int currOptionAIndex = 0;
           int currOptionBIndex = 0;
           
           //we have letters left in either list
           while ( currOptionAIndex < charListA.size() || currOptionBIndex < charListB.size() ){
               //have letters left in both lists
               if ( currOptionAIndex < charListA.size()  &&  currOptionBIndex < charListB.size() ){
                   // put A in result
                    if ( charListA.get(currOptionAIndex) < charListB.get(currOptionBIndex) ){
                        result.append(charListA.get(currOptionAIndex));
                        currOptionAIndex++;
                    } 
                    // put B in result
                    else if ( charListA.get(currOptionAIndex) > charListB.get(currOptionBIndex) ){
                        result.append(charListB.get(currOptionBIndex));
                        currOptionBIndex++;
                    }
                   
                   //equal
                   else{
                        //runners
                        int tempa = currOptionAIndex;
                        int tempb = currOptionBIndex;
                        while(tempa < charListA.size() && tempb < charListB.size() && charListA.get(tempa)==charListB.get(tempb) && charListA.get(tempa) <= charListA.get(currOptionAIndex)){
                            tempa++;
                            tempb++;
                        }

                        if(tempa < charListA.size() && tempb < charListB.size() && charListA.get(tempa)<charListB.get(tempb)){
                            for(int d = 0; d < tempa - currOptionAIndex; d++){
                                result.append(charListA.get(currOptionAIndex));
                                currOptionAIndex++;
                            }
                        }
                        else if(tempa < charListA.size() && tempb < charListB.size() && charListA.get(tempa)>charListB.get(tempb)){
                            for(int e = 0; e < tempb - currOptionAIndex; e++){
                                result.append(charListB.get(currOptionBIndex));
                                currOptionBIndex++;
                            }
                        }
                        else if(tempa>=charListA.size()){
                            for(int e = 0; e < tempb - currOptionBIndex; e++){
                                result.append(charListB.get(currOptionBIndex));
                                currOptionBIndex++;
                            }
                        }
                        else{
                            for(int d = 0; d < tempa - currOptionAIndex; d++){
                                result.append(charListA.get(currOptionAIndex));
                                currOptionAIndex++;
                            }
                        }
                    }
               }
               //only have letters left in A
               else if ( currOptionAIndex < charListA.size() && currOptionBIndex >= charListB.size() ){
                     result.append(charListA.get(currOptionAIndex));
                     currOptionAIndex++;
               }
                //only have letters left in A
               else if ( currOptionBIndex < charListB.size() && currOptionAIndex >= charListA.size() ){
                      result.append(charListB.get(currOptionBIndex));
                      currOptionBIndex++;
               }
           }
           
            return result.toString();

    }
}
