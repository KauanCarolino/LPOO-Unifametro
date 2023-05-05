package Ex11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Mouse("Mouse Optico", "Saída USB, 1.600"));
        carrinho.add(new Livro("Ficcao", "Alice no País das Maravilhas"));

        carrinho.add(new Mouse("Mouse Gamer", "Saída USB, 12.000"));
        carrinho.add(new Livro("Ficcao", "Harry Potter"));

        carrinho.add(new Mouse("Mouse Wi fi", "1.600"));
        carrinho.add(new Livro("Romance", "Acaba assim"));

        carrinho.add(new Livro("Mistério", "O Gato Preto"));
        carrinho.add(new Livro("Romance", "Rei Destruido"));
        carrinho.add(new Livro("Horror", "O Modelo de Pickman"));

        for(int i = 0; i<carrinho.size();i++){
            System.out.println(carrinho.get(i).getDescricao());
        }
    }
}
