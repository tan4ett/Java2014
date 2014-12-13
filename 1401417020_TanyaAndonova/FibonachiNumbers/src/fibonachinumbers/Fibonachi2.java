/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachinumbers;

    public class Fibonachi2 {
        private static int[] f = new int[100];
        private static int count = 1;
        
        public static long F(int N){
            if(N<count)return f[N];
            if(N==1){ count = 1; return f[0]=1; }
            if(N==2){ count = 2; return f[1]=1; }
            return f[N]=(int)(F(N-1)+F(N-2));
    }
        public static void main(String[]args){
     
            for(int N=1;N<30;N++)System.out.println(N+" "+F(N));
         
     
    }
}
