/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachi_4_upr;


/**
 *
 * @author tan4ett
 */
public class zad4variant2 {
    public static void main(String[] args) {

    String names[] = {"Ivan", "Mariya", "Petrana", "Iwanka", "Matrina", " ivailo"};
    
    
    }
   
    
    public static void capitalLetter(String m[], String search){

    System.out.println("Names starting with capital letters  " + search + ":");

    for(int i=0; i<m.length; i++)
       if(Character.isUpperCase(m[i].charAt(0))) {
      System.out.println("true");
    }else{
      System.out.println("false");

    System.out.println(m[i]);
    
 }
}
}
