import java.util.Scanner;
import java.util.*;
import java.text.*;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:{
                //media
                int nota1 = 10;
                int nota2 = 5;
                int nota3 = 7;
                double media = (double) (nota1 + nota2 + nota3) / 3;
    
                System.out.println("Médiaa");
                System.out.println("Primeira Nota: " + nota1);
                System.out.println("Segunda Nota: " + nota2);
                System.out.println("Terceira Nota: " + nota3);
    
                System.out.println("Média das Notas: " + media);
    
               
    
                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
                //System.out.println("Relogio: ");
                //System.out.println(relogio.toString());
        
                
                
            
            
                break;
            }

            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:{
                
                 //area
                 int lado1 = 5;
                 int lado2 = 7;
                 int area = lado1 * lado2;
     
                 System.out.println("Lado 1: " + lado1);
                 System.out.println("Lado 2: " + lado2);
                 System.out.println("Area: " + area);

                 Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
                break;
            }
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:{

                double largura = 20;
                double altura = 10;
                double profundidade = 5;
                double volume = largura * altura * profundidade;

                System.out.println("");
                System.out.println("Largura: " + largura);
                System.out.println("Altura: " + altura);
                System.out.println("Profundidade: " + profundidade);
                System.out.println("Volume: " + volume);


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // volume(double largura, double altura, double profundidade)
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:{


                double n1 = 3;
                double n2 = 3.5;
                double maior = 0;

                System.out.println("Número 1 = " + n1);
                System.out.println("Número 2 = " + n2);
                if(n1>n2){
                    maior = n1;
                    System.out.println("Maior Número: " + maior);
                }else{
                    maior = n2;
                    System.out.println("Maior Número: " + maior);
                }
                

                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);

            }
                // valorMaiorQueDobro(double base, double verificar)
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
                
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // bhaskara(int a, int b, int c);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // mediaViagem(double distancia, double tempo)
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // percentualImposto(double faturamento, double qtdImposto)
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // parOuImpar(int valor)
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:{


                Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);
            }
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:{


              Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s);  
            }
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:{


               Date relogio = new Date();
                DateFormat dhf = new SimpleDateFormat("dd/MM/yyyy");
                //Locale BRAZIL = new Locale("pt","BR");
                String s;
        
                dhf = DateFormat.getDateTimeInstance(); 
                s = dhf.format(relogio);
                System.out.println("Data : " + s); 
            }
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return 0;
    }

    public static boolean parOuImpar(int valor) {
        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}