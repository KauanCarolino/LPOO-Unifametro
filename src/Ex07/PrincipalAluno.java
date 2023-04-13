package Ex07;
import java.util.Scanner;
public class PrincipalAluno {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Qual o nome do aluno: ");
        aluno1.nome = ent.nextLine();
        System.out.println("Informe a matricula do aluno: ");
        aluno1.matricula = ent.nextLine();
        System.out.println("Informe a primeira nota do aluno: ");
        aluno1.nota1 = ent.nextFloat();
        System.out.println("Informe a segunda nota do aluno: ");
        aluno1.nota2 = ent.nextFloat();

        aluno1.info();
        aluno1.aprovacao();
    }
}
