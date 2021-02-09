
package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class ArrayLeftRotation {
    // Complete the rotLeft function below.
    //Do d left rotations on array 
    //if array is 1 2 3 4 5, and d is 2, then result is 3 4 5 1 2
    static int[] rotLeft(int[] a, int d) {
        if (d<=0) {return a;}
        int n = a.length;
        int[] subArrayBack = new int[d];
        int[] subArrayFront = new int[n-d];       
        for ( int i = 0; i < d; i++){
            subArrayBack[i] = a[i];
        }        
        for( int i = 0; i < n-d; i++){
            subArrayFront[i] = a[i+d];
        }       
        int[] newArray = new int[n];
        for(int i = 0; i < subArrayFront.length; i++){
            newArray[i] = subArrayFront[i];
        }
        for(int i = 0; i < subArrayBack.length; i++){
            newArray[n-d+i] = subArrayBack[i];
        }
        return newArray;
    }
}
