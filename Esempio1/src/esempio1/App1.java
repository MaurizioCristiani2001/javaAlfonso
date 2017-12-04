/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class App1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dammi x");
        int x = s.nextInt();
        
        System.out.println("Dammi y");
        int y = s.nextInt();

        if (x >= y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

    }
}
