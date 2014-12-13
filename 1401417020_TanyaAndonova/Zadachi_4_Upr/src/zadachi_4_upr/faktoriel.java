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
public class faktoriel {


    public static long fak(int num){
    if (num==0) return 1;
    if (num==1) return 1;
    return (num)*fak(num-1);
}
    public static void main(String[] args){
        System.out.println(fak(5));
}
}
    