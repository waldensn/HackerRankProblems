package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/utopian-tree
//Each spring, tree doubles in height
//Each summer, tree height increases by 1
public class UtopianTree {
        public static int utopianTree(int n) {
            int height = 1;
            for ( int i = 0; i <= n; i++ ){
                if ( i % 2 == 1){height *= 2;}
                else if (i % 2 == 0 && i > 0){height++;}
            }
                
            return height;
    }
}
