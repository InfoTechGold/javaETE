import java.util.Scanner;

public class Calculadora {
   public static void main(String[]args){
       
       Scanner input=new Scanner(System.in);
        int opcao,contador,operacao,contador1,opcao1;
        double calculo;
        double numero1,numero2;
        System.out.println("Deseja iniciar o projeto ? \n" + "[0]=Sair \n" + 
                 "[1]=Iniciar \n");
        opcao=input.nextInt();
        while(opcao==1){
            System.out.print("--------------------------\n");
            System.out.print(" Menu \n" + "[0]=Sair \n" + "[1]=Adiç?o \n" +
                    "[2]=Subtraç?o \n" + "[3]=Multiplicaç?o \n" + "[4]=Divis?o \n" + 
                    "[5]=Raiz quadrada \n" + "[6]=Porcentagem \n" + "[7]=Potência \n" + "[8]=Fatorial \n" + "[9]=Fibonacci \n");
            opcao1=1;
            operacao=input.nextInt();
            if(operacao==1){
              
                while(opcao1!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Dois Números próprios \n" + 
                            "[2]=Tabela Tradicional \n");
                    opcao1=input.nextInt();
                    
                    if(opcao1==0){
                        break;
                    }
                    else if(opcao1==1){
                      
                        System.out.println("digite seu primeiro número");
                        numero1=input.nextDouble();
                        System.out.println("digite seu segundo número");
                        numero2=input.nextDouble();
                        calculo=numero1+numero2;
                        System.out.println(numero1 + " + " + numero2 + " = " + calculo);
                        
                    }
                    else if(opcao1==2){
                        for(int i=0;i<=10;i++){
                            System.out.print("---------------------\n");
                            for(int j=0;j<=10;j++){
                                
                                calculo=i+j;
                                System.out.println(i + " + " + j + " = " + calculo);
                                
                            }
                        }
                    System.out.print("---------------------\n");
                    }
                    else{
                        System.out.print("Valor Invalido");
                    }
                }
                break;
            }
            else if(operacao==2){
               
              while(opcao!=0){
                 System.out.println("[0]=Sair \n" + "[1]=Dois Números próprios \n" +
                         "[2]=Tabuada Tradicional \n");
                  opcao1=input.nextInt();
                 
                 if(opcao1==0){
                     break;
                 }
                 else if(opcao1==1){
                     
                     System.out.println("digite seu primeiro número");
                     numero1=input.nextDouble();
                     System.out.println("digite seu segundo número");
                     numero2=input.nextDouble();
                     
                     calculo=numero1 - numero2;
                     System.out.println(numero1 + " - " + numero2 + " = " + calculo);
                 }
                 else if(opcao1==2){
                     for(int i=0;i<=10;i++){
                         System.out.print("---------------------\n");
                         for(int j=0;j<=10;j++){
                             
                             calculo=i-j;
                             System.out.println(i + " - " + j + " = " + calculo);
                         }
                     }
                 }
                 else{
                     System.out.println("opç?o invalida");
                    
                 }
              }
            }
            else if(operacao==3){
                
                while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Dois Números próprios \n" +
                         "[2]=Tabuada Tradicional \n");
                    opcao1=input.nextInt();
                    
                    if(opcao1==0){
                       break;
                    }
                    else if(opcao1==1){
                        System.out.println("digite seu primeiro número");
                        numero1=input.nextDouble();
                        System.out.println("digite seu segundo número");
                        numero2=input.nextDouble();
                        calculo=numero1*numero2;
                        System.out.println(numero1 + " X " + numero2 + " = " + calculo);
                    }
                    else if(opcao1==2){
                        
                       for(int i=0; i<=10;i++){
                           System.out.print("---------------------\n");
                           for(int j=0; j<=10;j++){
                               
                               calculo=i*j;
                               System.out.println(i + " X " + j + " = " + calculo);
                               
                           }
                       }
                    }else{
                        System.out.println("opç?o invalida");
                    }
                    
                }
            }
            else if(operacao==4){
                
                while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Dois Números próprios \n" +
                         "[2]=Tabuada Tradicional \n");
                    opcao1=input.nextInt();   
                    if(opcao1==0){
                         break;
                         
                    }
                    else if(opcao1==1){
                        System.out.println("digite seu primeiro número");
                        numero1=input.nextDouble();
                        System.out.println("digite seu segundo número");
                        numero2=input.nextDouble();
                        
                        if(numero1!=0 && numero2!=0){
                             calculo=numero1/numero2;
                            System.out.println(numero1 + " / " + numero2 + " = " + calculo);
                        }
                        else{
                            System.out.println("operaç?o invalida \n");
                        }
                    }
                    else if(opcao1==2){
                        for(int i=1;i<=10;i++){
                            System.out.print("---------------------\n");
                            for(int j=1;j<=10;j++){
                                calculo=i/j;
                               System.out.println(i + " / " + j + " = " + calculo); 
                            }
                        }
                    }
                } 
                
            }
            else if(operacao==5){
              while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Um Número próprio \n" );
                    opcao1=input.nextInt();   
                    if(opcao1<=0){
                         break;    
                    }
                    else if(opcao1==1){
                        System.out.print("digite seu número para saber a raíz dele : \n");
                        numero1=input.nextDouble();
                        calculo=Math.sqrt(numero1);
                        System.out.println(numero1 + " = " + calculo + "\n");
                    }
                    else{
                        System.out.println("número invalido");
                    }
                }
            }
             else if(operacao==6){
                while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Um Número próprio \n[2]=Um número próprio com base um valor" );
                    opcao1=input.nextInt();   
                    if(opcao1<=0){
                         break;    
                    }
                    else if(opcao1==1){
                        System.out.print("digite seu número: \n");
                        numero1=input.nextDouble();
                        
                        calculo=numero1/100;
                        System.out.println(numero1 + " % " + " = " + calculo + "\n");
                    }
                    else if(opcao1==2){
                        System.out.print("digite seu número principal : \n EX: 10 % de 50 (10 é o principal e 50 a base) \n");
                        numero1=input.nextDouble();
                        System.out.print("digite seu número base do valor : \n");
                        numero2=input.nextDouble();
                        
                        calculo=(numero1/100)*numero2;
                        System.out.println(numero1 + " %  de " + numero2 + " = " + calculo + "\n");
                    }
                    else{
                        System.out.println("número invalido");
                    }
                }
            }
            else if(operacao==7){
                while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Um Número próprio com a base \n" );
                    opcao1=input.nextInt();   
                    if(opcao1<=0){
                         break;    
                    }
                    else if(opcao1==1){
                        System.out.print("digite seu número expoente : \n");
                        numero1=input.nextDouble();
                        System.out.print("digite seu número base : \n");
                        numero2=input.nextDouble();
                        calculo=Math.pow(numero2,numero1);
                        System.out.println(numero2 + " ^ " + numero1 + " = " + calculo + "\n");
                    }
                    else{
                        System.out.println("número invalido");
                    }
                }
            }
            else if(operacao==8){
                 while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Um número fatorial \n" );
                    opcao1=input.nextInt();   
                    if(opcao1<=0){
                         break;    
                    }
                    else if(opcao1==1){
                        System.out.print("digite seu número : \n");
                        numero1=input.nextDouble();
                        calculo=1;
                        for(double i=numero1;i>=1;i--){
                            calculo=calculo*i;
                            System.out.print(i + " X ");
                            
                        }
                        System.out.println("Resultado : " + calculo);
                        if(numero1==0){
                            System.out.print(" Valor 0 \n");
                        }
                    }
                    else{
                        System.out.println("número invalido");
                    }
                }
            }
            else if(operacao==9){
                 while(opcao!=0){
                    System.out.println("[0]=Sair \n" + "[1]=Um número para Fibonacci \n" );
                    opcao1=input.nextInt();   
                    if(opcao1<=0){
                         break;    
                    }
                    else if(opcao1==1){
                        System.out.print("digite seu número : \n");
                        numero1=input.nextDouble();
                       
                        int num1,num2,num3;
                        num1=0;
                        num2=1;
                        num3=0;
                        System.out.print("Sequência fibonacci : " );
                        for(int i=0;i<=numero1;i++){
                            
                            System.out.print(num3 + ",");
                            num3=num1+num2;
                            num1=num2;
                            num2=num3;
                        }
                        System.out.print("\n");
                        if(numero1==0){
                            System.out.println("\n Valor invalido");
                        }
                    }
                    else{
                        System.out.println("número invalido");
                    }
                }
            }
            
        }
   }
}
