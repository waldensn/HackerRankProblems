package com.mycompany.hackerrankproblems;


import java.math.BigInteger;

//https://www.hackerrank.com/challenges/extra-long-factorials/problem
//Factorials where n > 20 cause overflow for 64-bit long integers
//Calculate very large factorials using BigInteger
public class VeryLargeFactorials {
        static void extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for(int i = 1;i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }        
}
