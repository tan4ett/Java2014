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
import java.util.Scanner;
public class zad13 {
    public static void index(int arr[]){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]>30){
                System.out.println("индекса на първия срещнат елемент със стойност над 30 e " + i);
                return; //с break ще продължи изпълняване на метода след цукъла if
                // a с return директно излиза от метода
            }
        }
           if (i==arr.length)
           System.out.println("В масива няма елемент със стойност над 30");
                               
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Въведете броя на елементите на масива");
        int n=input.nextInt();
        int arr[]=new int[n];
               
        for (int i=0;i<n;i++){
            System.out.println("Въведете "+i+"-я елемент на масива");
            arr[i]=input.nextInt();
        }
        input.close();
        index(arr);
    }
    
}

