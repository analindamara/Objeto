package objeto;

import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("digite uma senha :");
        int senhadigitada= sc.nextInt();

        int senha = senha1 (senhadigitada);
        showResult (senha);
        sc.close();

    }

    public static int senha1 (int senhadigitada) {
        int senhacorreta = 1234;
        if (senhadigitada == senhacorreta) {
            System.out.printf ("");
        } else {
            System.out.println("senha incorreta");

        }
        return senhacorreta;
    }
        public static void showResult(int senha){
            System.out.println( "senha correta: ");

        }

    }

