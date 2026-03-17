import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        int num = 0;
        
        //Vetor 1
        for(int i=0; i<10; i++){
            System.out.println((i+1) + " Digite o número do primeiro Vetor: ");
            vet1[i] = sc.nextInt();
        }
        //Vetor 2
        for(int j=0; j<10; j++){
            System.out.println((j+1) + " Digite o número do segundo Vetor: ");
            vet2[j] = sc.nextInt();
        }

        //Vetor 3 
        for(int x=0; x<10; x++){
            for(int y=0; y<10; y++){
                if(vet1[x] == vet2[y]){
                    vet3[num] = vet1[x];
                    num++;
                }
            }     
        }
            for(int y=0; y<10; y++){
                System.out.println(" - " + vet3[y]);
        }
        sc.close();
    }
}
