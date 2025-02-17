package objeto;

import java.util.Scanner;

//Verifique se uma pessoa pode votar (idade mínima de 16 anos).
public class teste4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira sua idade: ");
        int idade= sc.nextInt();

        int idade1 = voto(idade);
        ShowResult (idade1);
        sc.close();

    }
    public static int voto (int idade){
        int idade16=idade;
        if (idade16>=16){
            System.out.println("essa pessoa pode votar");
        }else {
            System.out.println(" você  não pode votar");
        }

        return idade16;
    }

    public static void ShowResult (int idade1){
        System.out.println("");
    }
































































}
