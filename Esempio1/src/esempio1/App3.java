/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author tss
 */
public class App3 {

    public static void main(String[] args) {

        int[] numeri = IntStream.rangeClosed(57, 1000).toArray();

        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            if (valore % 2 == 0) {
                System.out.println(valore);
            }
        }
        
        
    }
}
