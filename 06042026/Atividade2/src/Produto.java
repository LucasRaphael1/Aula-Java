public class Produto {
    private String nome;
    private Double preco;
    private String codBarras;

    public Produto(String nome, double preco, String codBarras){
        this.nome = nome;
        this.preco = preco;
        this.codBarras = codBarras;
    }

    public Produto(){}   
    
    
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public Double getPreco(){return this.preco;}
    public void setPreco(Double preco){this.preco = preco;}


    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produto outro = (Produto) obj;
        return this.codBarras.equals(outro.codBarras);
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"\tPreço: "+preco;
    }
}
