package Ex01;
import java.util.Scanner;

/*
* Crie uma classe chamada Pessoa que tem como atributos nome, idade, identidade e sexo (F ou
M) e o método fazAniversario que aumenta a idade da pessoa em uma unidade.
* */

public class Principal {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Pessoa p = new Pessoa();

        p.mostrarInfo();

        System.out.println("----------------------------------");

        System.out.println("Qual o seu nome? ");
        p.nome = ent.nextLine();
        System.out.println("Qual o seu sexo? ");
        p.sexo = ent.next().toUpperCase().charAt(0);
        System.out.println("Qual a sua idade? ");
        p.idade = ent.nextInt();
        System.out.println("Qual o seu RG? ");
        p.RG = ent.nextLong();

        System.out.println("----------------------------------");

        p.mostrarInfo();

        int novaIdade = p.fazAniversario();
        System.out.println("Nova idade: "+novaIdade);

        System.out.println("----------------------------------");
    }
}
