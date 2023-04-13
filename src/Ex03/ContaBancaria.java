package Ex03;
public class ContaBancaria {
    String nome;
    double saldo = 0;

    public ContaBancaria(String nome){
        this.nome = nome;
    }

    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    /*
     public <tipo de retorno> <nome do metodo>(<parametros>){
         //o que o metodo faz
     }
     */
    //Sacar -> Diminui o valor sacado do valor do saldo,
    //e retorna o saldo após operação;
    public double sacar(double valorRetirado) {
        if((saldo - valorRetirado)<0) {
            System.out.println("Saldo insuficiente!!!");
        }else {
            saldo = saldo - valorRetirado;
            System.out.println("Saque realizado com sucesso!");
        }
        return saldo;
    }
    /*
     * Depositar -> Soma o valor depositado com o valor do saldo,
     * e retorna o saldo após operação;
     */
    public double depositar(double valorAdicionado) {
        saldo = saldo + valorAdicionado;
        return saldo;
    }

    //Consultar Saldo -> Retorna o valor do salto atual;
    public double consultarSaldo() {
        return saldo;
    }
    //Consultar Nome -> Retorna o nome atual;
    public String consultarNome() {
        return nome;
    }
    //Alterar Nome -> Altera o nome cadastrado.
    public void alterarNome(String novoNome) {
        nome = novoNome;
    }

    public void transferir(ContaBancaria clienteRecebedor, double valor){
        if ((saldo-valor)<0) {
            System.out.println("Saldo Insuficiente!");
        }else{
            clienteRecebedor.depositar(valor);
            saldo = saldo - valor;
            System.out.println("Transferência realizada com sucesso");
            System.out.println("Seu novo saldo é "+saldo+" reais");
        }
    }
}