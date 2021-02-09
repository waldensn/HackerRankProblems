
package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
//2D 6x6 array, hourglass is 3 across in a row, one in middle in next row, three across in next row
public class HourglassSum {
    // Complete the hourglassSum function below.
    //16 total hourglasses in 6x6 array
    //hourglasses start at (0,0), (0,1),(0,2),(0,3),(1,0), (1,1),(1,2),(1,3),(2,0),(2,1),(2,2),(2,3),(3,0), (3,1),(3,2),(3,3)
    //hourglass at (0,0) would be (0,0), (0,1), (0,2), (1,1), (2,0), (2,1), (2,2)
    static int hourglassSum(int[][] arr) {
       int maxHourglass = Integer.MIN_VALUE;
       for(int i = 0; i < 4; i++){
           for (int j = 0; j < 4; j++){
               int hourglass = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
               if ( hourglass > maxHourglass ){
                   maxHourglass = hourglass;
               }
           }
       }
       return maxHourglass;
    }
}
