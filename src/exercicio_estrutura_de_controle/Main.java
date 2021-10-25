package exercicio_estrutura_de_controle;

import java.util.Scanner;

/*Desafio:Criar um programa que informe se o ano atual
é bissexto


Como determinar se um ano é bissexto
  Para determinar se um ano é bissexto, execute estas etapas:

  Etapa 1: - Se o ano for uniformemente divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
  Etapa 2: - Se o ano for uniformemente divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 5.
  Etapa 3: - Se o ano for uniformemente divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.
  Etapa 4: - O ano é bissexto (tem 366 dias).
  Etapa 5: - O ano não é um ano bissexto (tem 365 dias).
*/
public class Main {

    public static void main(String[] args) {

        int anoAtual;
        Scanner scan = new Scanner(System.in);
        boolean rodando = true;
        String respMenu;

        while (rodando){
            System.out.println("Digite um ano qualquer para saber se é bissexto:");
            anoAtual = scan.nextInt();
            if ((anoAtual%4==0) || (anoAtual%100==0) || (anoAtual%400==0)){
                System.out.println("-------------------------\n");
                System.out.println("O ano digitado é bissexto\n");
                System.out.println("-------------------------");

            }else {
                System.out.println("----------------------------\n");
                System.out.println("O ano digitado NÃO é bissexto!\n");
                System.out.println("------------------------------");
            }
            System.out.println("Deseja continuar?");
            System.out.println("[1] Para sim");
            System.out.println("[2] Para não");
            respMenu = scan.next().strip();
            switch (respMenu){
                case "1":
                    break;
                case "2":
                    rodando =false;
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    while (!respMenu.equals("1") && !respMenu.equals("2")){
                        System.out.println("Opção inválida\nTente novamente!");
                        System.out.println("Deseja continuar?");
                        System.out.println("[1] Para sim");
                        System.out.println("[2] Para não");
                        respMenu = scan.next().strip();
                        if (respMenu.equals("2")){
                            rodando=false;
                        }
                    }
                    break;
            }

        }


        scan.close();
    }

}
