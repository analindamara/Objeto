package objeto;
//Receba duas notas e informe se o aluno foi aprovado (média &gt;= 7).
import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int senhacorreta = 1234;
        System.out.println("digite um senha");
        int senhadigitada= sc.nextInt();

        int senha = senha1 (senhadigitada);
        showResult (senha)
    }
}
