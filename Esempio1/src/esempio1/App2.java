/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio1;

import java.util.stream.IntStream;

/**
 *
 * @author tss
 */
public class App2 {
    
    public static void main(String[] args) {
        
        int[] numeri = IntStream.rangeClosed(0, 100).toArray();
        
        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            System.out.println(valore);
        }
        
    }
}
