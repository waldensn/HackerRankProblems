
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */

//hiker took steps number of steps
//U for uphill, D for downhill, each step up or down is 1 unit of altitude
//if we go above sea level and then back down to sea level, that's a mountain
//if we go below sea level and then back up to sea level, that's a valley
public class CountingValleys {
       public static int countingValleys(int steps, String path) {
        // Write your code here
        int numValleys = 0;
        int altitude = 0;
        for ( int i = 0; i < path.length(); i++){
            if ( path.charAt(i) == 'U'){
                altitude++;
            }
            else if ( path.charAt(i) == 'D'){
                altitude--;
            }
          
            if ( altitude == 0 && path.charAt(i) == 'U'){numValleys++;}
        }    
        return numValleys;
    }
}
