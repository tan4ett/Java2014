/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

import static task3upr.zad7.максималенЕлемент;

/**
 *
 * @author tan4ett
 */
public class zad9 {
    public static void сумаОтЕлементиНаЧетнаПозиция(int m[]) {
        int suma = 0;
        for (int i = 0; i < m.length; i++)
        if (i % 2 == 0) 
        suma += m[i];
            System.out.println("Сума от числата на четна позиция: " + suma);
}
    public static void main(String[] args) {
        int m[] = { 5, 15, 20, 25, 30, 35, 45 };
        сумаОтЕлементиНаЧетнаПозиция (m);
}
}
