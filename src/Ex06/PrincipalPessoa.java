package Ex06;

public class PrincipalPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Gerivaldo", "Pedreiro", 52, 1.50, 57);
        Pessoa p2 = new Pessoa("Jubileu", "Biologo", 22, 1.80, 74);

        p1.mostrarInfo();
        System.out.printf("%.2f",p1.IMC());
        System.out.println(" ");
        System.out.println("------------------------------------------");
        p2.mostrarInfo();
        System.out.printf("%.2f",p2.IMC());
    }
}
