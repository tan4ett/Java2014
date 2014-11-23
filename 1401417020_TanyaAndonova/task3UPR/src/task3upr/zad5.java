/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

import static task3upr.zad4.средноКвадратично;

/**
 *
 * @author tan4ett
 */
public class zad5 {
   public static void СумаОтКвадратите (double m[]){
        double suma = 0;
        for (int i = 0; i < m.length; i++)
        if (m[i] > 3)
        suma += Math.pow(m[i], 2);
      
            System.out.println("zad 5: " + suma);

}
    public static void main(String[] args) {
        double m[] = { 2.5, 1.5, 3, 5, 6 };
        СумаОтКвадратите(m);
}
}
