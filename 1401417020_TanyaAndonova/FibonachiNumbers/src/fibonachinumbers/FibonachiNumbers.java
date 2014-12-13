/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachinumbers;

/**
 *
 * @author tan4ett
 */
public class FibonachiNumbers {

       
    public static long F(int N){
        if(N==0)return 0;
        if(N==1)return 1;
        return F(N-1)+F(N-2);
    }
    public static void main(String[]args){
     
     for(int N=0;N<30;N++)
        System.out.println(N+" "+F(N));

     
    }
       
}
