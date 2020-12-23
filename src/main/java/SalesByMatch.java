
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://www.hackerrank.com/challenges/sock-merchant/problem

//count the number of pairs in an array
//in ar, find the number of matching pairs
//take the first number, and if we find a second number, remove both and increment matches?
//if no match, remove first number?
public class SalesByMatch {
    public static int sockMerchant(int n, int[] ar) {
            int numMatches = 0;
            HashSet<Integer> colors = new HashSet();
            for (int i = 0; i < n; i++){
                if ( !colors.contains( ar[i] ) ){
                    colors.add(ar[i]);
                }
                else{
                    colors.remove(ar[i]);
                    numMatches++;
                }
            }
            
            return numMatches;
    }

}
