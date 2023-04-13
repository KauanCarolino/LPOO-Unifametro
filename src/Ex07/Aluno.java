package Ex07;
/*
Crie uma classe chamada "Aluno" que tenha os seguintes atributos:
nome, matrícula e notas 1 e nota 2.
Crie métodos para:
Calcular a média do aluno
Verificar se o aluno foi aprovado (média maior ou igual a 7)
Exibir os dados do aluno (nome, matrícula, notas e média)
*/
public class Aluno {
    String nome, matricula;
    float nota1, nota2;

    public float media(){
        float media = (nota1 + nota2)/2;
        return media;
    }

    public void aprovacao(){
        if (media() >= 7){
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }
    }

    public void info(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Media :"+media());
    }
}
