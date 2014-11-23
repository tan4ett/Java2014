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
public class zad8 {
    public static void минималенЕлемент(int m[]) {

    int minElement = m[0]; // избираме първия елемент от масива за максимален
    for (int i = 1; i < m.length; i++)
    if (minElement > m[i]) // ако текущия елемент e по-голям от максималния
    minElement = m[i]; // задаваме текущия като максимален
        System.out.println("Минимален елемент: " + minElement);
}
    public static void main(String[] args) {
        int m[] = { 5, 15, 20, 25, 30, 35, 45 };
        минималенЕлемент(m);
}
}

