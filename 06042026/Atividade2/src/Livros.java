public class Livros extends Produto{
    private String autor;
    
    public Livros(String nome, double preco, String codBarras, String autor){
        super(nome, preco, codBarras);
        this.autor = autor;
    }
    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    public String toString(){
        return super.toString()+"\tAutor: "+autor;

        //return "Livro\tNome: "+getNome()+"Preço: "+getPreco()+"Autor: "+this.autor;
    }
}
