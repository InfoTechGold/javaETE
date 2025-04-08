import java.util.Scanner;
public class TrabalhoEmGrupo01Menu {
    public static void main(String[]args){
     
        
        Scanner sc=new Scanner(System.in);
     
     int opcao,escolha,operador;
     byte  valor =1;
     int num1, num2, calculo;
     int tab;
     double ImC, peso, altura;
     double resultado=0;
     
     
     
     opcao=1;
     while(opcao!=0){
         System.out.print("escolha a sua opç?o\n");
         System.out.print("[1]Média Notas \n[2]=Tabuada \n[3]=Calculadora \n[4]=IMC \n[5]=Sair \n");
         
         escolha=sc.nextInt();
         
         if(escolha==1){
             
            
             double media,notas1,notas2;
             
             System.out.print("digite a sua primeira nota : \n");
             notas1=sc.nextDouble();
             System.out.print("digite a sua segunda nota : \n");
             notas2=sc.nextDouble();
             
             media=(notas1+notas2)/2;
             
             System.out.println("sua média final é : " + media + "\n");
             
         }
         else if(escolha==2){
             
             System.out.println("digite a sua operaç?o\n[1]=Adicao \n[2]=Subtracao \n[3]=Multiplicacao \n[4]=divisao \n");
             operador=sc.nextInt();
             if(operador==1){
                
                System.out.print("Qual a valor?");
                int numero= sc.nextInt();
                for (int i=1; i<=10; i++) {
                    tab=numero+i;
                    System.out.println(numero+" + "+i+"="+tab);
                }
                
                 
             }
             else if(operador==2){
                System.out.print("Qual a valor?");
                int numero= sc.nextInt();
                for (int i=1; i<=10; i++){
                    tab=numero-i;
                    System.out.println(numero+" - "+i+"="+tab);
        
                }
             }
             else if(operador==3){
                System.out.print("Qual a valor?");
                int numero= sc.nextInt();
                for (int i=1; i<=10; i++) {
                    tab=numero*i;
                    System.out.println(numero+" x "+i+"="+tab);
                }
                 
                 
             }
             else if(operador==4){
                 System.out.print("Qual a valor?");
                int numero= sc.nextInt();
                for (int i=1; i<=10; i++) {
                    tab=numero/i;
                    System.out.println(numero+" / "+i+"="+tab);
                }
             }
             else{
                 System.out.print("valor Invalido");
             }
         }
         else if(escolha==3){
             
             while((valor !=0)&&(valor<=5)){
                System.out.println("***");
                System.out.println("(0) Sair");
                System.out.println("(1) Somar");
                System.out.println("(2) Subtrair");
                System.out.println("(3) Multiplicar");
                System.out.println("(4) Dividir");
                System.out.println("(5) Raiz");
                System.out.print("Escolha uma opç?o: ");
                System.out.println("##############################");
                valor = sc.nextByte();
            
                if(valor==1){
                    System.out.print("Primeiro Num: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo Num: ");
                    num2=sc.nextInt();
                    calculo = num1+num2;
                    System.out.println("A soma dos numeros "+num1+" "
                        + " + "+num2+ " = "+calculo);
                
            }
                if(valor==2){
                    System.out.print("Primeiro Num: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo Num: ");
                    num2=sc.nextInt();
                    if(num1>=num2){
                    calculo = num1-num2;
                    System.out.println("A subtraç?o dos numeros "+num1+" "
                        + " - "+num2+ " = "+calculo);
                    }else{
                        System.out.println("O Primeiro Num deve ser maior que o segundo.");
                    }

            }

                if(valor==3){
                    System.out.print("Primeiro Num: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo Num: ");
                    num2=sc.nextInt();
                    calculo = num1*num2;
                    System.out.println("A multiplicaç?o dos numeros "+num1+" "
                        + " x "+num2+ " = "+calculo);
            }
            
                if(valor==4){
                    System.out.print("Primeiro Num: ");
                    num1 = sc.nextInt();
                    System.out.print("Segundo Num: ");
                    num2=sc.nextInt();
                    if(num1>=num2){
                    calculo = num1/num2;
                    System.out.println("A divis?o dos numeros "+num1+" "
                        + " / "+num2+ " = "+calculo);
                    }else{
                        System.out.println("O Primeiro Num deve ser maior que o segundo.");
                    }
    
            }
               
               
             }
             System.out.println("Saiu da Calc");
         }
         else if(escolha==4){
             
            System.out.print("Escreva seu peso: ");
            peso = sc.nextDouble();
            System.out.print("Escreva sua altura: ");
            altura = sc.nextDouble();
            ImC = peso / (altura * altura);
            if (ImC<18.5){
             System.out.println("Seu IMC é de: "+ImC+"kg/m2");
             System.out.println("Você está baixo peso");
            } 
            else if(ImC >= 18.5 || ImC <= 24.9) {
                 System.out.println("Seu IMC é de: "+ImC+"kg/m2");
                 System.out.println("Você tem um peso normal.");
            } 
            else if (ImC >= 25 || ImC <= 29.9){
                 System.out.println("Seu IMC é de: "+ImC+"kg/m2");
                 System.out.println("Você tem sobrepeso.");
            } else if (ImC >= 30 || ImC <= 34.9){
                 System.out.println("Seu IMC é de: "+ImC+"kg/m2");
                 System.out.println("Você é Obeso(a) de Grau I.");
            } else if (ImC >= 35. || ImC <= 39.9){
                 System.out.println("Seu IMC é de: "+ImC+"kg/m2");
                 System.out.println("Você é Obeso(a) de Grau II.");
            } else if (ImC > 40 ){
                 System.out.println("Seu IMC é de: "+ImC+"kg/m2");
                 System.out.println("Você é Obeso(a) de Grau III.");
            } 
             
             
         }
         else if(escolha==5){
             System.out.print("entrou");
             break;
         }
         else{
             System.out.println("Opç?o Invalida\n");
        }   
    }
}    
       
}

