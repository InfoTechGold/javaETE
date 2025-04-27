
package games;

/**
 *
 * @author Nilton Sousa
 */

import java.util.Scanner;
public class Games {

    public static void main(String[] args) {
        
        String[][] Velha=new String[3][3];
        int linhas, colunas;
        boolean comecar=true;
        boolean jogador=false;
        boolean Venceu=false;
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<Velha.length;i++){

             for(int j=0;j<Velha.length;j++){

                 Velha[i][j]="#";
              }
             System.out.println("");
         }
        while(comecar && Venceu==false){
            System.out.println("Jogo Da Velha");
         
           
            System.out.println("");
            for(int i=0;i<Velha.length;i++){
                
                for(int j=0;j<Velha.length;j++){
                    
                    System.out.print(Velha[i][j] + " ");
                 }
                System.out.println("");
            }
            
            if(jogador==false && Venceu==false){
                System.out.println(" jogador 1, escolha a sua linha");
                linhas=input.nextInt();
                System.out.println(" jogador 1, escolha a sua coluna");
                colunas=input.nextInt();
                if(linhas<3 && colunas<3){
                    if(Velha[linhas][colunas]=="#"){
                        Velha[linhas][colunas]="X";
                        jogador=true;
                    }
                    else{
                        System.out.println(" opção já preenchida ou invalida");
                        jogador=false;
                    }
                }
                else{
                        System.out.println(" opção já preenchida ou invalida");
                        jogador=false;
                    }
            }
            else if(jogador && Venceu==false){
                System.out.println(" jogador 2, escolha a sua linha");
                linhas=input.nextInt();
                System.out.println(" jogador 2, escolha a sua coluna");
                colunas=input.nextInt();
                if(colunas<3 && linhas>3){
                    if(Velha[linhas][colunas].equals("#")){
                        Velha[linhas][colunas]="O";
                        jogador=false;
                    }
                    else{
                        System.out.println(" opção já preenchida ou invalida");
                        jogador=true;
                    }
                }
                else{
                        System.out.println(" opção já preenchida ou invalida");
                        jogador=true;
                    }
            }
            
            
            for(int i=0;i<Velha.length;i++){
                for(int j=0;j<Velha.length;j++){
                    
                if(Velha[0][0]=="X" && Velha[0][1]=="X" && Velha[0][2]=="X")
                {
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[1][0]=="X" && Velha[1][1]=="X" && Velha[1][2]=="X")
                {
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[2][0]=="X" && Velha[2][1]=="X" && Velha[2][2]=="X")
                {
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][0]=="X" && Velha[1][0]=="X" && Velha[2][0]=="X"){
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][1]=="X" && Velha[1][1]=="X" && Velha[2][1]=="X"){
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                 else if(Velha[0][2]=="X" && Velha[1][2]=="X" && Velha[2][2]=="X"){
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][0]=="X" && Velha[1][1]=="X" && Velha[2][2]=="X"){
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][2]=="X" && Velha[1][1]=="X" && Velha[2][0]=="X"){
                    System.out.println("jogador 1 Venceu");
                    Venceu=true;
                    break;
                }
                
                
                
                if(Velha[0][0]=="O" && Velha[0][1]=="O" && Velha[0][2]=="O")
                {
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[1][0]=="O" && Velha[1][1]=="O" && Velha[1][2]=="O")
                {
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[2][0]=="O" && Velha[2][1]=="O" && Velha[2][2]=="O")
                {
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][0]=="O" && Velha[1][0]=="O" && Velha[2][0]=="O"){
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][1]=="O" && Velha[1][1]=="O" && Velha[2][1]=="O"){
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;  
                    break;
                }
                 else if(Velha[0][2]=="O" && Velha[1][2]=="O" && Velha[2][2]=="O"){
                    System.out.print("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][0]=="O" && Velha[1][1]=="O" && Velha[2][2]=="O"){
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                }
                else if(Velha[0][2]=="O" && Velha[1][1]=="O" && Velha[2][0]=="O"){
                    System.out.println("jogador 2 Venceu");
                    Venceu=true;
                    break;
                    
                }
                
            }
            }
        } 
        for(int i=0;i<Velha.length;i++){
                
                for(int j=0;j<Velha.length;j++){
                    
                    System.out.print(Velha[i][j] + " ");
                 }
                System.out.println("");
            }
        
    }
    
}
