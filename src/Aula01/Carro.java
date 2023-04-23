package Aula01;
public class Carro {
    String cor;
    String modelo;
    double capacidadeTanque;

    public Carro(){

    }

    public Carro(String cor, String modelo, double capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){ this.modelo = modelo; }


    public double getCapacidadeTanque(){ return this.capacidadeTanque; }

    public void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public double valorTotalTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
