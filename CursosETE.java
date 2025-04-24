package com.mycompany.cursosete;

public class CursosETE {

    public static void main(String[] args) {
        
        int aaa[]={1,2,3,4,5};
        int bbb[]={5,4,3,2,1};
        int ccc[]=new int[5];
        for(int i=0;i<aaa.length;i++){
            
           ccc[i]= aaa[i]+bbb[i];
        }
        
        for(int i=0;i<ccc.length;i++){
            
            System.out.print(ccc[i] + " , ");
        }
    }
}
