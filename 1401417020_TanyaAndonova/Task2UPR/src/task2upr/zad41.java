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
public class zad41 {
    //public static void max1(int i1, int i2) {

    //int max = i1 > i2 ? i1 : i2;

    //System.out.println(max);
    public static void max(int i1, int i2){
     int max = i1;
     if(max < i2) max = i2;
     System.out.println(max);
    }
    public static void main(String[] args) {

    max(5, 16);
    max(4, 8);
    max(15, 11);
    max(14, 8);
}
}
