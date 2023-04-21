package Ex05;

public class Retangulo {
    float comprimento, largura;

    public float perimetro(){
        float perimetro = 2*largura + 2*comprimento;
        return perimetro;
    }

    public float area(){
        float area = comprimento * largura;
        return area;
    }
}
