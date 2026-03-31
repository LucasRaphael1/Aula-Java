public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro("Gol","preto","AAA3A34", 2); // Utilizando construtor cheio
        System.out.println(car.toString());
        Carro car2 = new Carro(); //Utilizando construtor vazio
    }
}
