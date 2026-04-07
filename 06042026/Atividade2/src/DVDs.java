public class DVDs extends Produto {
    int duracao;

    public DVDs(String nome, double preco, String codBarras, int duracao){
    super(nome, preco, codBarras);
    this.duracao = duracao;
    }

    public int getDuracao(){return this.duracao;}
    public void setDuracao(int duracao){this.duracao = duracao;}

    public String toString(){
        return super.toString()+"\tDuração: "+duracao+" min ";
    }
}
