package Ex05;
import java.util.Scanner;
public class calculoRetangulo {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.println("Digite a largura do retangulo: ");
        float l = ent.nextFloat();
        System.out.println("Digite o comprimento do retangulo: ");
        float c = ent.nextFloat();

        while(l<=0 || c<=0){
            System.out.println("Por favor digite valores validos");

            System.out.println("Digite a largura do retangulo: ");
            l = ent.nextFloat();

            System.out.println("Digite o comprimento do retangulo: ");
            c = ent.nextFloat();
        }

        r.largura = l;
        r.comprimento = c;
        System.out.println("O valor do comprimento e de "+r.perimetro());
        System.out.println("O valor da area e de "+r.area());

    }
}
