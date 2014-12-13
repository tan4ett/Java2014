/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachi_5_upr;

/**Дефинирайте клас който отразява човек. За решаване на конкретен проблем от 
 * всички характерситики на човека ни интересуват име, фамилия и години. Класът
 * трябва да съдържа функционалност,  която позволява на всеки конкретен обек 
 * от този клас да се представи с името, фамилията и възрастта си.
 *
 * @author tan4ett
 */
public class HomoSapiens {
    public String name;
    public String surname;
    public int age;
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    
    }
    public String getSurname() {
        return this.name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = 27;
    }
    
    public void sayHallo() {
        System.out.println("Hallo, I am a human. They call me " + name + " "+ surname + ". "+ "And I am " + age + " years old");
    }
}