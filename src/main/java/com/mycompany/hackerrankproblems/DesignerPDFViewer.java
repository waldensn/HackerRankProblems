package com.mycompany.hackerrankproblems;

//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

//h is an array of 26 ints, each one is the height of a letter of the alphabet
//word is a string, determine the area needed to display the word
public class DesignerPDFViewer {
       public static int designerPdfViewer(int[] h, String word) {
           int tallest = 0;
           int numLetters = word.length();
           
           for ( int i =0; i < word.length(); i++ ){
               //find current letter in array h
               int letter = word.charAt(i);
               if ( h[letter - 97] > tallest){tallest = h[letter-97];}
           }
           return tallest * numLetters;

    }
}
