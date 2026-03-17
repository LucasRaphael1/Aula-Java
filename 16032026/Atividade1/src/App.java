import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[10];
        int min;
        int max;
       for(int i=0; i<10; i++){
            System.out.println((i+1) + " Digite um número: ");
            num[i] = sc.nextInt();
        }
            for(int j=0; j<10; j++){
                System.out.println(" - " + num[j]);
        }
        System.out.println("Digite o valor minimo: ");
        min = sc.nextInt();
        System.out.println("Digite o valor máximo: ");
        max = sc.nextInt();
        System.out.println("Valores dentro do intervalo");
        for(int x=0; x<10; x++){
            if(num[x] >= min && num[x] <= max){
                System.out.println(" - " + num[x]);
            }
        }
        sc.close();
    }
}
