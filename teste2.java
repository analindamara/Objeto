package objeto;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print ("informe as notas do aluno: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();

        int media = media1(nota1, nota2);

        showResult(media);
        sc.close();
    }

public static int media1(int nota1, int nota2) {
        int resultado = nota1 + nota2 / 2;

        if (resultado >= 7) {
            System.out.println("aprovado");
        } else
            System.out.println("reprovado");

    return resultado;
}

public static void showResult (int media){
    System.out.println(media);
}



}







