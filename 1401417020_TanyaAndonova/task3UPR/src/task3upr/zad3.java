/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

/**
 *
 * @author tan4ett
 */
public class zad3 {
    public static void сумаНаПоложителнитеЕлементи(double m[]) {

        double suma = 0;
        for (int i = 0; i < m.length; i++)
        if (m[i] > 0)
        suma += m[i];

            System.out.println("Сумата на положителните елементи: " + suma);

}
    public static void main(String[] args) {
        double m[] = { 9.5, -8.5, 16, -3, 8 };
        сумаНаПоложителнитеЕлементи(m);
}
}
