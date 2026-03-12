public class App {
    public static void main(String[] args) throws Exception {
        double alturaJ = 1.5;
        double alturaZ = 1.1;
        int Contador = 0;

        while(alturaZ <= alturaJ){
            alturaJ += 0.02;
            alturaZ += 0.03;
            System.out.println("Altura João: " + alturaJ);
            System.out.println("Altura Zé: " + alturaZ);
            Contador++;
            System.out.println("Contador: " + Contador);
        }
            System.out.println("Zé demorou " + Contador + " Anos para chegar na altura de João!!");
    }
}
