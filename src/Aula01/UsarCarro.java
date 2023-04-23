package Aula01;
import java.util.Scanner;
public class UsarCarro {
    public static void main(String[] args){

        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(60);
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(5.16));

        System.out.println("------------------------------------------");

        Carro carro2 = new Carro("Verde", "Mercedes Benz", 210);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(4.21));

    }
}
