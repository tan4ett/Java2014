/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2upr;

/**
 *
 * @author tan4ett
 */
public class zad14 {
    
    public static void main(String[] args) {
        
        int m[] = { 1, -5, -4, 20, 0, 5, -4, 7 };    
        System.out.println("Положителни са числата:");
        int сума = 0;
        for (int i = 0; i < m.length; i++) {   
        if (m[i] <= 0) {
        сума += m[i];
        continue;
        //При изпълнение на оператора „continue” в цикъл се прекъсва 
        //изпълнението на операторите от текущата итерация след него.
        //Цикълът продължава да се изпълнява от следващата итерация.
        //Използването на “continue” може да се замени с ‘if-else”. 
        //Понякога, при сложна логика, използването на “continue” улеснява реализацията.
}
        System.out.println(m[i]);
}
        System.out.println("Сумата на отрицателните числа е "+ сума);
}
}
