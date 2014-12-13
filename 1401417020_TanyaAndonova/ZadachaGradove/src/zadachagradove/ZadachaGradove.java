/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachagradove;

/**Решение на задачата чрез въвеждане на имена на градове от клавиатурата.
 * Задължително условие те да са с главни букви.
 *
 * @author tan4ett
 */

import java.util.Scanner;

public class ZadachaGradove {
    public static void main(String[] args){
        String a []=new String [3];
        Scanner input = new Scanner(System.in);
        System.out.println("въведете име на град :");
        
        for(int i=0; i<a.length; i++){
            a[i]=input.nextLine();
        }
            for (int i=0; i<a.length; i++){
            while(Character.isLowerCase(a[i].charAt(0))){
                System.out.println("Имената на градове се пишат с главни букви!Моля въведете името отново: "+a[i]);
                a[i]=input.nextLine();
                }
            }
            System.out.println("Вие въведохте следния списък с градове: ");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
            
        System.out.println("От изброените градове");
                завършващиНаОво(a, "ovo");
    }
    public static void завършващиНаОво(String m[], String search){
        System.out.println("на " + search + " завършват:");
          for(int i=0;i<m.length;i++){
          if(m[i].toLowerCase().endsWith(search.toLowerCase()))
 
          System.out.println(m[i]);
        }
    }
    }
    
 

