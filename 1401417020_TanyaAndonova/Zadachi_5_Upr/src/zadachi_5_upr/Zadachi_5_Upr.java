/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachi_5_upr;

/**Дефинирайте клас който отразява човек. За решаване на конкретен проблем от 
 * всички характерситики на човека ни интересуват име, фамилия и години. 
 * Класът трябва да съдържа функционалност,  която позволява на всеки конкретен
 * обек от този клас да се представи с името, фамилията и възрастта си.
 *
 * @author tan4ett
 */
public class Zadachi_5_Upr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        HomoSapiens person = new HomoSapiens();
        
        person.setName("Adam");
        person.setSurname("Sandler");
        person.setAge(27);
            //System.out.println("Hallo, I am a human. They call me", name + surname + "And I am" + age + "years old");
        person.sayHallo();
 
}
    
}
