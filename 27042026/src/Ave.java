public class Ave extends Animal{
    public void mover(){
        setLocalizacao(getLocalizacao() + 1);
        System.out.println("Passaro: "+getNome()+" movendo-se ^^ v ^^ v ^^ -->");
        super.setLocalizacao(1);
    }
    public Ave(){}

    public Ave(String nome, int patas, double velocidade, int localizacao){
        super(nome, patas, velocidade, localizacao);
    }
    @Override
    public String toString() {
        return "Ave [Nome: "+getNome() + "\n"+ ", Patas: "+getPatas() + "\n"+", Velocidade: "+getVelocidade()+"\n"+", Localização: "+getLocalizacao()+"]";
    }
}
