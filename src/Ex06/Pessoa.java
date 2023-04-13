package Ex06;

/*
Crie uma classe chamada "Pessoa" que tenha os seguintes atributos:
nome, idade, altura, peso e profissão.
Crie um construtor para a classe e métodos de acesso para cada atributo.

Crie métodos para:
Calcular o índice de massa corporal (IMC) da pessoa
Exibir os dados da pessoa (nome, idade, altura e peso)
*/
public class Pessoa {
    private String nome, profissao;
    private int idade;
    private double altura, peso;

    public Pessoa(String nome, String profissao, int idade, double altura, double peso){
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public double IMC(){
        double imc = peso / (altura*altura) ;
        return imc;
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+getNome());
        System.out.println("Profissao: "+getProfissao());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
    }

}
