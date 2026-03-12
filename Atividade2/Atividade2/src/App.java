import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] = {"Janeiro", 
                          "Fevereiro",
                          "Março",
                          "Abril",
                          "Maio",
                          "Junho",
                          "Julho",
                          "Agosto",
                          "Setembro",
                          "Outubro",
                          "Novembro",
                          "Dezembro"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 12: ");
        int digitado = sc.nextInt();
        if(digitado < 1 || digitado > 12){
            System.out.println("Digite um número certo, seu animal!");
        }else{
        System.out.println("O mês de "+ meses[digitado-1] +" esta na posição " + digitado);
        }
        sc.close();
    }
}