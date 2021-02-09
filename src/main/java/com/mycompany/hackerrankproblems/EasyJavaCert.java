package com.mycompany.hackerrankproblems;


import java.util.Stack;

//HackerRank certification for Java (Easy)

//Given a string with characters { ( ) }, determine if it's a balanced string
public class EasyJavaCert {
    static boolean isBalanced(String a){
    Stack<Character> stack = new Stack<Character>();

    char currentChar;
    for(int i = 0; i < a.length(); i++) {
        currentChar = a.charAt(i);
        //if currentChar is an open bracket, then push onto stack
        if( currentChar == '(' ){
            stack.push(currentChar);
        }
        else if( currentChar == '{' ){
            stack.push(currentChar);
        }
        //if currentChar is an open bracket, check our stack
        else if( currentChar == ')' )
            if( stack.empty ()){
                return false;
            }
            else if( stack.peek() == '(' ){
                stack.pop();
            }
            else { return false; }
        else if( currentChar == '}' ){
            if( stack.empty( )){
                return false;
            }
            else if( stack.peek() == '{' ){
                stack.pop();
            }
            else { return false; }
        }
    }
    //if we have an empty stack of open brackets at the end, then good
    return stack.empty();
    }
   


        public static boolean compare(int a, int b){
            return a == b;
        }
        
        public static boolean compare(String a, String b){
            return a.equals(b);
        }
        public static boolean compare(int[] a, int[] b){
            if (a.length != b.length){return false;}
            for ( int i = 0; i < a.length; i++){
                if ( a[i] != b[i] ){
                    return false;
                }
            }
            return true;
        }
}
