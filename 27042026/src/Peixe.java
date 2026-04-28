public class Peixe extends Animal{
    private int agua;
    
    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua){
        super(nome, patas, velocidade, localizacao);
        this.agua = agua;
    }

    public int getAgua(){return this.agua;}
    public void setAgua(int agua){this.agua = agua;}

    public void mover(){
        System.out.println("Peixe: "+getNome()+" movendo ~ ~ ~ ~ ~ ~>"+getNome());
        setLocalizacao(getLocalizacao()+2);
    }

    @Override
    public String toString() {
        return "Peixe [agua=" + agua +", Nome: "+getNome() + "\n"+ ", Patas: "+getPatas() + "\n"+", Velocidade: "+getVelocidade()+"\n"+", Localização: "+getLocalizacao()+"]";
    }
}
