package Ex01;

/*
* Crie uma classe chamada Pessoa que tem como atributos nome, idade, identidade e sexo (F ou
M) e o método fazAniversario que aumenta a idade da pessoa em uma unidade.
* */
public class Pessoa {
    String nome;
    int idade;
    char sexo;
    long RG;

    public int fazAniversario(){
        idade = idade + 1;
        return idade;
    }
    public void mostrarInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("RG: "+RG);
    }
}
