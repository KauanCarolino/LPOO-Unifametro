package Aula02;

public class RodarAplicacao {
    public static void main(String[] args){

        Funcionario[] funcionarios = new Funcionario[]{ new Gerente(), new Vendedor(), new Funcionario()};

        for(Funcionario funcionario: funcionarios){
            funcionario.metodo1();
        }

        System.out.println("");

        for (Funcionario funcionario: funcionarios){
            funcionario.metodo2();
        }

        System.out.println("");

        Funcionario vendedor = new Vendedor();
        vendedor.metodo2();
    }
}
