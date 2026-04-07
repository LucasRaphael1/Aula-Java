public class App {
    public static void main(String[] args) throws Exception {

    Produto produtos [] = new Produto[5];
        produtos[0] = new Livros("Dagrão", 25.99, "111", "montero lobato");
        produtos[1] = new Livros("POO Avançado", 70.0, "222", "Maria Souza");
        produtos[2] = new CDs("Musgas bouas", 30.0, "333", 12);
        produtos[3] = new DVDs("Ta choveno aborgue", 40.0, "444", 120);
        produtos[4] = new CDs("Rock Classics", 35.0, "555", 15);
    }
}
