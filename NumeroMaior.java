

/*	
Escreva um programa em Java que solicita 10 números ao usuário,
através de um laço do while, e ao final mostre qual destes números é o maior.
*/

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[]args){
        
       Scanner input= new Scanner(System.in);
       
       int contador,maior;
       int numeros[]=new int[10];
       
       contador=0;
       maior=0;
       
       
       do{
           System.out.println("digite seu número ");
           numeros[contador]=input.nextInt();
           if(maior<numeros[contador]){
               maior=numeros[contador];
           }
           contador++;
       }while(contador<numeros.length);
       
       System.out.print("Seu maior número é : " + maior);
    }
}
