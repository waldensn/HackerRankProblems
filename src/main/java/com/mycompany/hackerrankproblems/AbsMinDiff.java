
package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms

import java.util.Arrays;

public class AbsMinDiff {
    // Complete the minimumAbsoluteDifference function below.
    //Min difference between any pair of elements
    //7, -10, 20, 60, -13
    //sorted -13, -10, 7, 20, 60
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int absMinDiff = Integer.MAX_VALUE;
        //compare adjacent numbers
        for(int i = 0; i < arr.length - 1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            if ( diff < absMinDiff){
                absMinDiff = diff;
            }
        }
        
        return absMinDiff;
    }
}
