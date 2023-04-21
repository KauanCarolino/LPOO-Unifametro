package Ex04;

public class UsarCarro {
    public static void main(String[] args){
        Carro c1 = new Carro();

        c1.modelo = "BMW x4";
        c1.marca = "BMW";
        c1.chassi = "ABC123";
        c1.fabricante = "BMW";

        System.out.println(" ");

        c1.Informacoes();

        System.out.println(" ");

        c1.Ligar();
        c1.Acelerar();
        c1.Frear();
        c1.Desligar();

        System.out.println("-------------------------------------------------");

        Carro c2 = new Carro();

        c2.modelo = "Ford Mustang";
        c2.marca = "Ford";
        c2.chassi = "DEF456";
        c2.fabricante = "Ford";
        System.out.println(" ");

        c2.Informacoes();

        System.out.println(" ");

        c2.Ligar();
        c2.Acelerar();
        c2.Frear();
        c2.Desligar();

    }
}
