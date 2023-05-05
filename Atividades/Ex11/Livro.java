package Ex11;

public class Livro extends Produto{
    String autor;

    public Livro(String Descricao, String autor){
        super(Descricao);
        this.autor = autor;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao()+"; autor: "+autor;
    }
}
