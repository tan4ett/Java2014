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
public class zad7 {
    public static void максималенЕлемент(int m[]) {

    int maxElement = m[0]; // избираме първия елемент от масива за максимален
    for (int i = 1; i < m.length; i++)
    if (maxElement < m[i]) // ако текущия елемент e по-голям от максималния
    maxElement = m[i]; // задаваме текущия като максимален
       System.out.println("Максимален елемент: " + maxElement);

}
    public static void main(String[] args) {
        int m[] = { 5, 15, 20, 25, 30, 35, 45 };
        максималенЕлемент(m);
}
}