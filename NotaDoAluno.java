package TarefaEBAC;

import java.util.Scanner;

/**
 * @author Ramon.Migueis
 */

public class NotaDoAluno {

    static double mediaBimestre = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Olá, por favor digite seu nome: ");
        String nome = s.next();
        System.out.println("Olá " + nome + ", Vamos começar? ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")) {

            getBimeste();
            getNota();

        } while (resposta.equalsIgnoreCase("não")) {
            System.out.println("Ok, obrigado");
            break;
        }

        System.out.println("Por favor, siga as instruções. ");

    }
    public static void getBimeste() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota do Primeiro Bimestre ");
        double primeiroBimestre = s.nextDouble();
        System.out.println("Digite a nota do Segundo Bimestre ");
        double segundoBimestre = s.nextDouble();
        System.out.println("Digite a nota do Terceiro Bimestre ");
        double terceiroBimestre = s.nextDouble();
        System.out.println("Digite a nota do Quarto Bimestre ");
        double quartoBimestre = s.nextDouble();

        mediaBimestre = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
        System.out.println("Media final " + mediaBimestre);


    }
    public static void getNota() {
        if (mediaBimestre >= 7 && mediaBimestre <= 10) {
            System.out.println("Aprovado");
        } else if (mediaBimestre >= 5 && mediaBimestre < 7) {
            System.out.println("Recuperação ");
        }else{
            System.out.println("Reprovado");
        }

    }
}