package Ex09;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(int matricula){
        super();
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matricula: "+getMatricula());
    }

}
