/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
public class SurfaceArea3D {
    //H rows and W columns
    
    //copied from discussion?
    //need to sum up the 6 sides, 2 of the sides are just H x W
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
