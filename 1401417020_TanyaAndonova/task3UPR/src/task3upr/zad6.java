/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

import static task3upr.zad2.средноАритметично;

/**
 *
 * @author tan4ett
 */
public class zad6 {
    public static void сумаОтАбсолютнитеСтойности(double m[]) {

        double suma = 0;
        for (int i = 0; i < m.length; i++)
        suma += Math.abs(m[i]);
            System.out.println("zad 6: " + suma);
}
    public static void main(String[] args) {
        double m[] = { 9.5, -8.5, 16, -3, 8 };
        сумаОтАбсолютнитеСтойности(m);
}
}
