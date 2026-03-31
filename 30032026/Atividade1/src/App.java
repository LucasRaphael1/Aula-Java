import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.next();
        //sc.next();
        System.out.println("Digite o CPF: ");
        String cpf = sc.next();
        
        Pessoa p1 = new Pessoa(nome, cpf);

        Calendar nasc = Calendar.getInstance();
        nasc.set(2000, 2, 7);
        
        p1.setNascimento(nasc);

        System.out.println(p1.toString());       


        sc.close();
    }
}
