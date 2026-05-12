public class Triangulo extends Forma2D{
    private String style;

    Triangulo(){
        super();
        style = "nada";
    }

    Triangulo(String s, double w, double h){
        super(w, h, "triangulo");
        style = s;
    }

    Triangulo(double x, String nome, String style){
        super(x,nome);
        this.style = style;
    }
    public String getStyle(){return style;}
    public void setStyle(String style){this.style = style;}

    @Override
    public String toString() {
        return "Triangulo [style="+style+", Largura ="+getLargura()+", Altura ="+getAltura()+", Nome ="+getNome()+"]";
    }
    public double area(){
        return (getAltura()*getLargura()) /2;
    }
    
}
