package Ex03;
import java.util.Scanner;
public class UsarConta{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        /*Criar uma nova classe de teste que vai conter o método main,
        e nele deverá ser criado um objeto da conta bancária, e em seguida:*/

        //Solicitar que o usuário digite o seu nome; Este nome deve ser alterado no objeto da classe
        //Conta de Banco, através do método Alterar Nome;
        System.out.println("Qual o nome do correntista?");
        String nome = ent.nextLine();

        ContaBancaria c1 = new ContaBancaria(nome, 2.00f);
        ContaBancaria c2 = new ContaBancaria("Leticia");

        int opcao = 0;
        //Em seguida, imprimir um menu que exibirá 4 opções:
        //o 1 – Sacar; 2 – Depositar; 3 – Consultar Saldo; 4 - Sair;
        /*Observação: Após ter executado uma das opções do menu, deve exibir
        novamente as opções ao usuário (não finaliza a aplicação, exceção para
        quando digitar a opção 4).*/
        while(opcao != 5) {
            System.out.println("Qual opcao deseja fazer? ");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");

            opcao = ent.nextInt();

            //Se o usuário digitar 1 ou 2, então deve pedir para digitar o valor que irá sacar/depositar.
            //Realiza saque/depósito, e depois imprime o novo saldo;
            //Se digitar 3, imprime o saldo atual;
            //Se digitar 4, finaliza a aplicação.
            switch (opcao) {
                case 1:
                    System.out.println("Quanto deseja sacar? ");
                    double saque = ent.nextDouble();
                    System.out.println("Saldo " + c1.sacar(saque));
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar? ");
                    double deposito = ent.nextDouble();
                    System.out.println("Saldo " + c1.depositar(deposito));
                    break;
                case 3:
                    System.out.println("Saldo atual " + c1.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Quanto deseja transferir? ");
                    double valtransferencia = ent.nextDouble();
                    c1.transferir(c2, valtransferencia);
                    System.out.println("Saldo do recebedor: "+c2.saldo);
                    break;
                case 5:
                    System.out.println("Atendimento finalizado!");
                    break;
                default:
                    System.out.println("[|!ERRO!|] Opcao invalida!");
                    break;
            }
        }
    }
}
