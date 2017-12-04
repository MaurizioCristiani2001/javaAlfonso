/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio1;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class App {
    
    public static void main(String[] args) {
        
        String x = JOptionPane.showInputDialog("Dammi il primo numero");
        String y = JOptionPane.showInputDialog("Dammi il secondo numero");
        
        if (Integer.parseInt(x) >= Integer.parseInt(y)) {
            System.out.println("Il più grande è: " + x);
        } else {
            System.out.println("Il più grande è: " + y);
        }
        
    }
}
