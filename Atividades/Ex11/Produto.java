package Ex11;

public class Produto {
    private String nomeLoja;
    private double preco;
    private String descricao;

    public Produto() {
        super();
    }

    public Produto(String descricao) {
        super();
        this.descricao = descricao;
    }

    public Produto(String nomeLoja, double preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de informatica - "+descricao;
    }

}
