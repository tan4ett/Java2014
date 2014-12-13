/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package kursovazadadacha1;

import java.util.Random;
import static java.lang.Math.pow;

/**Задача 1. Да се генерира по случаен начин едномерен масив от цели числа 
 * принадлежащи на интервала [–100,100]. Да се намери:
 е) средно геометрично на елементите, които принадлежат на интервала (6, 50]; */

public class KursovaZadadacha1 {  
    int a [];
    public static void main(String [] args) {
        int br=0;
        int b=1;
        int a[] = new int [2];
        Random rand = new Random();
        System.out.println("Елементите се въвеждат от компютъра....");
        for (int i=0; i<a.length; i++)
            a[i]=rand.nextInt(201)-100;
        
        for (int i=0; i<a.length; i++)
            if(a[i]>6 && a[i]<=50)
                br++;
        for (int i=0; i<a.length; i++)
            if(a[i]>6 && a[i]<=50)
                b*=a[i];
            System.out.println("Отпечатване");
            for(int i=0; i<a.length; i++)
                System.out.println(a[i]);    
            
            if(br>0 && b>0)
             System.out.println(  "Средногеометричното на числата в интервала (6,50] е: " + pow(b,1.0/br));
            else System.out.println("Няма числа в интервала (6,50]");
           
             
    }
      
}
