/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
public class UtopianTree {
        public static int utopianTree(int n) {
            int height = 1;
            for ( int i = 0; i <= n; i++ ){
                if ( i % 2 == 1){height *= 2;}
                else if (i % 2 == 0 && i > 0){height++;}
            }
                
            return  height;
    }
}
