package Ex04;

/*Por exemplo, imagine que você precisa criar uma aplicação para fazer a gestão
de uma frota de veículos. Nessa aplicação, com certeza será necessário manipular
informações de carros. E todos os carros geralmente possuem um “molde” padrão com
características e ações que são comuns a todos os carros.

Todos os carros, por exemplo, possuem características como:

• Modelo; • Marca; • Fabricante; • Chassi.

E possuem ações em comum, como:

• Ligar; • Acelerar; • Frear; • Desligar.

 */
public class Carro {
    //Atributos ou Caracteristicas de um carro
    public String modelo;
    public String marca;
    public String fabricante;
    public String chassi;

    //Métodos ou ações de um carro
    public void Ligar(){
        System.out.println("Carro ligando...");
    }
    public void Desligar(){
        System.out.println("Carro Desligando...");
    }
    public void Acelerar(){
        System.out.println("Carro Acelerando...");
    }
    public void Frear(){
        System.out.println("Carro Freando..");
    }

    public void Informacoes(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Chassi: "+chassi);
    }
}
