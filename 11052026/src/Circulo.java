public class Circulo extends Forma2D {

    public Circulo(){}
    
    public Circulo(double altura, String nome){
        super(altura, nome);
    }

    @Override
    public double area(){
        double pi = 3.14;
        double raio = getAltura()/2;
        return(raio * raio) * pi;
    }

    @Override
    public String toString(){return "Circulo [raio=" + (getAltura()/2) + "]";}
}

