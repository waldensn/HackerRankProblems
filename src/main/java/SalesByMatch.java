
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */

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
