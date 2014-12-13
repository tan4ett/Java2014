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
public class Books {
    public String name; //fields
    public String author; 
    public int pages;
    public boolean inStock;
    
    
    public String getName(){
    return name;
    }
    
    public String getAuthor(){
    return author;
    }
    
    public int getPages(){
    return pages;
    }
    
    public boolean getPrinted(){
    return inStock;
    }
    
    public void giveMeBook(){
        
        System.out.println("The last book on the shelf is " + name + ".");
    }
}
