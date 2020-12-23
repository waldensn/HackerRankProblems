/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
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
