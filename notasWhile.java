import java.util.Scanner;
public class notasWhile {
    public static void main(String[]args){
        
        Scanner input=new Scanner(System.in);
        
        int idades,idadeMaior,idadeMenor,idadeAtual,idadeNova,idadeAcumulada;
        int contador;
        double media;
        
        contador=0; //iniciando com zero e ir aumentando sempre que o while rodar
        idadeMaior=0; //mostrar quantas pessoas tem maior que 18 anos
        idadeMenor=0; //mostrar quantas pessoas tem com menos de 5 anos
        idadeAtual=0; // salvar o valor mais alto de idades 
        idadeAcumulada=0; //somar todas as idades para pegar a média das idades
        while(contador<10){
            
            System.out.print("digite sua idade : \n");
            idades=input.nextInt();
            idadeNova=idades;
            
            if(idades>18){
              idadeMaior++; 
            }
            else if(idades<5){
                idadeMenor++;
            }
            if(idadeAtual<idadeNova){
                
                idadeAtual=idadeNova;
            
            }
            idadeAcumulada+=idades;
            
            contador++;
            
        }
        
        media=idadeAcumulada/10;
        
        System.out.println(idadeAcumulada);
        System.out.println("idade mais velho : " + idadeAtual + "\nquantidade de pessoas mais de 18 anos : " +
         idadeMaior + "\nquantidade de pessoas com menos de 5 anos : " + idadeMenor + "\nMedia : " + media);
        
        input.close();
        //30,31,26,21,10 = 118 media 23.6
        
        
        
    }
}
