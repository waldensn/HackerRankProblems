
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
public class VeryLargeFactorials {
        static void extraLongFactorials(int n) {
        BigInteger fact=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
        
}
