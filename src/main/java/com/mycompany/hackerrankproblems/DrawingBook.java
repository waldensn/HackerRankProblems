package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/drawing-book
//didn't finish
public class DrawingBook {
    public static int pageCount(int n, int p) {
        boolean oddPages = false;
        int numTurns = 0;
        //odd number of pages means we would have 2 pages at the end
        if ( n % 2 == 1) {oddPages = true;}
        //even number of pages, only one page at end
        if ( !oddPages ){
            //page we want is at the very beginning or end
            if ( n == p || p == 1 ){numTurns = 0;}
            else {
                //start at beginning of book
                if ( n > 2*p ) {numTurns = n / (p + 1);}
                else {}
            }
        }
        //odd number of pages, two pages at end
        else{
            //page we want is at the very beginning or end
            if ( n == p || n - 1 == p || p == 1 ){numTurns = 0;}
            else {
                //start at beginning of book
                if ( n > 2*p ) {numTurns = n / (p + 1);}
                else {}
        }
        }
        
        return numTurns;
    }
}
