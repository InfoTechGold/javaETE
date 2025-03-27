
//importando a biblioteca scanner
import java.util.Scanner;

/**
 *
 * @author nilton
 */

//iniciando a classe exercicio 02
public class Ex02 {
    //iniciando a classe main
    public static void main(String[]args){
        //criando um novo objeto chamado input para o scanner
        Scanner input=new Scanner(System.in);
        
        //iniciando as variaveis
        double aumento , salarioAtual;
        char sexo;
        int anosTrabalhados;
        
        //iniciando as saidas de dados e entradads de dados usando o objeto input
        System.out.print("digite qual seu sexo: ");
        sexo=input.next().charAt(0);
        System.out.print("digite seu salário atual: ");
        salarioAtual=input.nextDouble();
        System.out.print("digite quantos anos trabalha na empresa : ");
        anosTrabalhados=input.nextInt();
        
        
        //condições para checar se é feminino 
        if(sexo=='f' || sexo=='F'){
            
            //se for feminino e for menor que 15 anos e maior que 0
            if(anosTrabalhados<15 && anosTrabalhados>0){
                
                //sistema para calcular o aumento
                aumento=salarioAtual*0.05;
                /*calculando o novo salário , também pode ser assim ...
                Ex: SalarioAtual=salarioAtual+aumento */
                
                salarioAtual+=aumento;
                
                //mostrando na tela o valor do salario atual
                System.out.print("seu salário atual é : R$: " + salarioAtual);
            }
            //se anos trabalhados for maior ou igual a 15 e menor que 20 
            else if(anosTrabalhados<=20){
                //calculando o aumento
                aumento=salarioAtual*0.12;
                //calculando o salário
                salarioAtual+=aumento;
                //mostrando o novo salário na tela
                System.out.print("seu salário atual é de R$: " + salarioAtual);
            }
            //se anos trabalhados for >20 
            else if(anosTrabalhados>20){
                
                //calculando o aumento
                aumento=salarioAtual*0.23;
                //calculando o novo salario
                salarioAtual+=aumento;
                //mostrando na tela o valor do salário atual
                System.out.print("seu salário atual é de : R$ : " + salarioAtual);
            }
            //se digitar qualquer outro valor exemplo 0 ou números negativos 
            else{
                //mostrar que o valor é inválido
                System.out.print("valor inválido");
            }
        }
        //se for masculino
        else if(sexo=='M' || sexo=='m'){
            //se anos trabalhado for menor que 20 e maior que 0
            if(anosTrabalhados<20 && anosTrabalhados>0){
                //calculando o aumento
              aumento=salarioAtual*0.03;
              //calculando o salario
              salarioAtual+=aumento;
              //mostrando na tela o salário atual
              System.out.print("seu salário atual é de : R$: " + salarioAtual);
            }
            //se anos trabalhados for menor ou igual a 30 e maior que 20
            else if(anosTrabalhados<=30){
                //calculando o aumento
                aumento=salarioAtual*0.13;
                //calculando o salário
                salarioAtual+=aumento;
                //mostrando na tela o novo salário
                System.out.print("seu salário atual é de : R$: " + salarioAtual);
                
            }
            //se anos trabalhados for maior que 30 
            else if(anosTrabalhados>30){
                //calculando o aumento
                aumento=salarioAtual*0.25;
                //calculando o salário atual
                salarioAtual+=aumento;
                //mostrando na tela o novo salário
                System.out.print("seu salário atual é de : R$: " + salarioAtual);
            }
            //caso valores inválidos
            else{
                //mostrar na tela valor inválido
                System.out.print("valor iválido");
            }
        }
        //caso seja qualquer outro valor mostrar na tela valor inválido
        else{
            // mostrar na tela valor inválido
            System.out.print("Valor inserido Inválido");
        }
  }
    
}
