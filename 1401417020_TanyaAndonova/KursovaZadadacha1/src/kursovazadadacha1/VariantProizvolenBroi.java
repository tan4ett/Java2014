/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovazadadacha1;

import static java.lang.Math.pow;
import java.util.Random;

/**
 *
 * @author tan4ett
 */
public class VariantProizvolenBroi {
    int a [];
    public static void main(String [] args) {
        Random rand = new Random();
        
        int n=rand.nextInt(200)+1;
        int br=0;
        int b=1;
        int a[] = new int [n];
        
        System.out.println("Елементите се въвеждат от компютъра....");
        for (int i=0; i<n; i++)
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
                System.out.println("Брой произволни числа " + n);
                System.out.println("От тях " + br + " в търсения интервал.");
            if(br>0 && b>0)
             System.out.println(  "Средногеометричното на числата в интервала (6,50] е: " + pow(b,1.0/br));
            else System.out.println("Няма числа в интервала (6,50]");
           
             
    }
      
}
