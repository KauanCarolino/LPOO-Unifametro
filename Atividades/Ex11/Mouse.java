package Ex11;

public class Mouse extends Produto{
    String tipo;

    public Mouse(String tipo, String descricao){
        super(descricao);
        this.tipo = tipo;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao()+"; tipo: "+tipo;
    }
}
