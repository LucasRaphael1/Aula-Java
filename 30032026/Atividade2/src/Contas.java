public class Contas{
    private double n1;
    private double n2;
    private double res;

    public Double Soma(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;

        res = n1 + n2;
        return res;
    }

        public Double Sub(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;

        res = n1 - n2;
        return res;
    }

    public Double getN1(){return this.n1;}
    public void setN1(Double n1){this.n1 = n1;}

    public Double getN2(){return this.n2;}
    public void setN2(Double n2){this.n2 = n2;}

    public Double getRes(){return this.res;}
    public void setRes(Double res){this.res = res;}

    public String toString(){
        return "Número 1: " + this.n1 + "\tNúmero 2: " + this.n2 + "\tResultado: " + this.res;
    }
}