/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upr5_zad4;

/**
 *
 * @author tan4ett
 */
public class Upr5_Zad4 {

   
    public static void main(String[] args){
        
        Books firstBook = new Books ();
        firstBook.name = "The Father";
        firstBook.author = "Unknown";
        firstBook.pages = 156;
        firstBook.inStock = true;
        
        Books secondBook = new Books ();
        secondBook.name = "11 Seconds";
        secondBook.author = "Paulo Koelio";
        secondBook.pages = 259;
        secondBook.inStock = true;
        
        Books thirdBook = new Books ();
        thirdBook.name = "The Parfum";
        thirdBook.author = "Partik Zuskin";
        thirdBook.pages = 115;
        thirdBook.inStock = false;
        
        System.out.println("I have 3 books: " + firstBook.name +"," + secondBook.name + " and " + thirdBook.name + ".");
        }
        
}
