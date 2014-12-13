/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachi_4_upr;

public class zad4 {


    public static void main(String[] args) {

    String names[] = {"Ivan", "Mariya", "Petrana", "Iwanka", "Matrina", " ivailo"};

    capitalLetter(names,"A");
    capitalLetter(names,"B");
    capitalLetter(names,"C");
    capitalLetter(names,"D");
    capitalLetter(names,"E");
    capitalLetter(names,"F");
    capitalLetter(names,"G");
    capitalLetter(names,"J");
    capitalLetter(names,"I");
    capitalLetter(names,"H");
    capitalLetter(names,"K");
    capitalLetter(names,"L");
    capitalLetter(names,"M");
    capitalLetter(names,"N");
    capitalLetter(names,"P");
    capitalLetter(names,"R");
    capitalLetter(names,"S");
    capitalLetter(names,"T");
    
   
 }

public static void capitalLetter(String m[], String search){

    System.out.println("Names starting with capital letters  " + search + ":");

    for(int i=0; i<m.length; i++){

    if(m[i].toUpperCase().startsWith(search.toUpperCase()))

    System.out.println(m[i]);
    }
 }
    
}


