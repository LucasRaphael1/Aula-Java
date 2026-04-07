public class CDs extends Produto{
    int numFaixas;

    public CDs(String nome, double preco, String codBarras, int numFaixas){
        super(nome, preco, codBarras);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas(){return this.numFaixas;}
    public void setNumFaixas(int numFaixas){this.numFaixas = numFaixas;}

    public String toString(){
        return super.toString()+"\tNúmero de Faixas: "+numFaixas;
    }
}
