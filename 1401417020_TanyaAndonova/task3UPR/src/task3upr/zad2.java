/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3upr;

public class zad2 {
    public static void средноАритметично(double m[]) {

        double suma = 0; // в тази променлива ще записваме сумата

        for (int i = 0; i < m.length; i++)
        suma += m[i]; // прибавяме стойността на i-ия елемент към suma
        double rezultat = suma / m.length;

        System.out.println("Средно аритметичната сума е: " + rezultat);

    }
    public static void main(String[] args) {

        double m[] = { 9.5, -8.5, 16, -3, 8 };

        средноАритметично(m);
}
}
