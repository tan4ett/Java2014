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
public class faktorielIteracia {
    
    public static long факториелЦикъл(int num){

    long result = 1;
    for (int i = 2; i <= num; i++) result*=i;
     return result;
    
}
    
    public static void main(String[] args){
        System.out.println(факториелЦикъл(6));
}
}

