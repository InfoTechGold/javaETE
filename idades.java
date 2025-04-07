//importar biblioteca Scanner para inputar dados para o sistema
import java.util.Scanner;
//classe criada idades
public class idades {
     //assinatura da classe para iniciar nossos códigos
    public static void main(String[]args){
        
        //criando um objeto com o nome input para o Scanner
        Scanner input=new Scanner(System.in);
        
        //criando as variaveis do tipo inteiro
        int idades,idadeMaior,idadeMenor,idadeAtual,idadeNova,idadeAcumulada,contador;
        //criando a variavel do tipo double
        double media;
        
        contador=0; //iniciando com zero e ir aumentando sempre que o while rodar
        idadeMaior=0; //mostrar quantas pessoas tem maior que 18 anos
        idadeMenor=0; //mostrar quantas pessoas tem com menos de 5 anos
        idadeAtual=0; // salvar o valor mais alto de idades 
        idadeAcumulada=0; //somar todas as idades para pegar a média das idades
        
        //iniciando o while quanto o contador for menor que 10
        while(contador<10){
            //mando mensagem na tela para digitar uma idade
            System.out.print("digite sua idade : \n");
            //salvando o valor obtido no input dentro da variavel idades
            idades=input.nextInt();
            //fazendo minha idade nova,receber o valor da idade obtida no input
            idadeNova=idades;
            //condiç?o para checar se minha idades é maior que 18 anos
            if(idades>18){
              //caso seja verdade, ent?o coloco a quantidade de idades aqui
              idadeMaior++; 
            }
            //caso idade for menor que 5 anos
            else if(idades<5){
                //coloco a quantidade de idades aqui
                idadeMenor++;
            }
            // condiç?o para checar se minha idade atual é menor que idade nova
            if(idadeAtual<idadeNova){
                //caso for verdade minha idade atual recebe minha idade nova
                idadeAtual=idadeNova;
            
            }
            //calcular a idade acumulada
            idadeAcumulada+=idades;
            //subir o contador em 1, acrescentar em 1
            contador++;
            
        }
        //calculando a media de idades
        media=idadeAcumulada/10;
        //mostrando a media de idades
        //System.out.println(idadeAcumulada);
        //mostrando na tela a idade mais velho , quantidade de pessoas maior de 18 e menor de 5 e a média
        System.out.println("idade mais velho : " + idadeAtual + "\nquantidade de pessoas mais de 18 anos : " +
         idadeMaior + "\nquantidade de pessoas com menos de 5 anos : " + idadeMenor + "\nMedia : " + media);
        
        //encerrando o meu input
        input.close();
        //30,31,26,21,10 = 118 media 23.6
        
        
        
    }
}
