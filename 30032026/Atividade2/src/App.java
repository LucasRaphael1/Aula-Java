import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        Contas soma = new Contas();

        soma.Soma(n1, n2);
        

        System.out.println(soma.toString());
    }
}
