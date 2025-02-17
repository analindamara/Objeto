package objeto;

import java.util.Scanner;
//Determine se uma pessoa está apta para doar sangue (idade entre 18 e
//65 anos e peso &gt;= 50 kg).
public class teste5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insira sua idade");
        int idade= sc.nextInt();
        System.out.println("insira seu peso");
        double peso= sc.nextDouble();


        int idadeEpeso= Peso1(peso,idade);
        ShowResult (idadeEpeso);
         sc.close();

    }
  public static S







































}
