package com.mycompany.hackerrankproblems;

//Count the surface area for a 3D rectangular solid, varying heights
public class SurfaceArea3D {
    static int surfaceArea(int[][] A) {
    int result = 0;
    for(int row = 0; row < A.length - 1; row++){
        for (int col = 0; col < A[0].length - 1; col++){
        
            result += 4 * A[row][col] + 2;
            result -= 2 * Math.min(A[row][col], A[row+1][col]);
            result -= 2 * Math.min(A[row][col], A[row][col+1]);
        } 
    } 
    return result;
    }
}
