/*Considerando que 1 km = 0.621371 milhas, 
o programa converte a dist�ncia informada em quil�metros para milhas.*/


import java.util.Scanner;

public class ConversorMilhas {
    public static void main(String[]args){
        
        Scanner input=new Scanner(System.in);
        
        double milhas=0.621371;
        int km;
        double kmilhas;
        System.out.println("digite quantos km voc� deseja converter para milhas");
        km=input.nextInt();
        
        kmilhas=km*milhas;
        
        System.out.print("seu km : " + km + "em milhas : " + kmilhas);
    }
}
