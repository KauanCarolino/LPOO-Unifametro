package Ex09;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){}
    public Funcionario(String nome, double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        super();
        this.nome = nome;
    }

    public double addAumento(double valor){
        salario = salario + valor;
        return salario;
    }
    public double ganhoAnual(){
        return salario * 13;
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Novo Salario: "+salario);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
