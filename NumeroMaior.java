

/*	
Escreva um programa em Java que solicita 10 n�meros ao usu�rio,
atrav�s de um la�o do while, e ao final mostre qual destes n�meros � o maior.
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
           System.out.println("digite seu n�mero ");
           numeros[contador]=input.nextInt();
           if(maior<numeros[contador]){
               maior=numeros[contador];
           }
           contador++;
       }while(contador<numeros.length);
       
       System.out.print("Seu maior n�mero � : " + maior);
    }
}
