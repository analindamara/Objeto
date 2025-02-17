package objeto;
import java.util.Scanner;
public class teste1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero");
        int x = sc.nextInt();

        int n1 = numero(x);
        showResult (n1);
        sc.close();
    }

    public static int numero (int x) {
        int n2 = 0;
        if (x >= 0) {
            n2 = x;

        }

        return n2;
    }

    public static void showResult(int x) {
        System.out.print ("numero positivo: " + x);


    }
}


