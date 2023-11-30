package Idade;

import java.util.Scanner;

public class ControleIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = input.next();
        System.out.println("Digite sua  idade");
        int idade = input.nextInt();
        if (idade < 10 ){
            System.out.println( nome + " Particpará da categoria infatil");
        }else if(idade >=11 && idade <= 15){
            System.out.println( nome + " Particpará da categoria juvenil");
        } else if (idade >=16 && idade <=19) {
            System.out.println( nome + " Particpará da categoria Pré-adulto");
        }else{
            System.out.println( nome + " Particpará da categoria Adulto");
        }

    }
}
