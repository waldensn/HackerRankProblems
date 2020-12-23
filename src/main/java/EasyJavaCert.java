
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
public class EasyJavaCert {
    static boolean isBalanced(String a){
//        if (a.isEmpty()){return true;}
//        
//        //boolean balanced = true;
//        
//        Stack<Character> openChars = new Stack();
//        //push all open bracket chars onto a stack    
//        for (int i = 0; i < a.length(); i++){
//            if ( a.charAt(i) == '{' || a.charAt(i) == '(' ){
//                openChars.push(a.charAt(i));
//            } 
//        }
//        
//        //if stack becomes empty, we are starting a new string
//        //compare the closed bracket to what's on the string
//        for (int i = 0; i < a.length(); i++){
//            if ( a.charAt(i) == '}' || a.charAt(i) == ')' ){
//                char openChar = openChars.pop();
//                if ( a.charAt(i) == '}' && openChar != '{' ||
//                        a.charAt(i) == ')' && openChar != '('){
//                    return false;
//                }
//            } 
//        }
//        return true;
//        
//         if (str.charAt(0) == '{')
//        return false;

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
