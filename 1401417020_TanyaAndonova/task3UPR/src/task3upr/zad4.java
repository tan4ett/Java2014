/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

import static task3upr.zad3.сумаНаПоложителнитеЕлементи;

/**
 *
 * @author tan4ett
 */
public class zad4 {
    public static void средноКвадратично(double m[]) {

        double suma = 0;

        for (int i = 0; i < m.length; i++)

        suma += Math.pow(m[i], 2);
        double rezultat = Math.sqrt(suma);

            System.out.println("Средно квадратично: " + rezultat);

}
    public static void main(String[] args) {
        double m[] = { 5, 15, 20, 25 };
        средноКвадратично(m);
}
}
