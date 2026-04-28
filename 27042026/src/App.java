import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Animal animais[] = new Animal[10];
        ArrayList<Animal> animaisList = new ArrayList<>();
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        String menu = "\n---------- Escolha o que deseja fazer ----------\n1 - Cadastrar animais.\n2 - Listar animais\n3 - Mover Animal\n4 - Editar Animal.\n0 - Sair.";

        do{
            if(opcao < 4){
            switch (opcao) {
                case 1:
                    int opcAnim = 0;
                    System.out.println("----- Cadastrar Animais -----");
                    System.out.println("O que você deseja cadastrar?\n1 - Animal Genérico.\n2 - Peixe.\n3 - Ave.");
                    opcAnim = sc.nextInt();
                    System.out.println("Digite o nome do Animal: ");
                    String nome = sc.next();
                    System.out.println("Digite a quantidade de patas do animal");
                    int patas = sc.nextInt();
                    System.out.println("Digite a velocidade do animal: ");
                    double velocidade = sc.nextDouble();
                    System.out.println("Digite um valor inteiro de localização: ");
                    int localizacao = sc.nextInt();
                    //Especificidades
                    if(opcAnim < 4 || opcAnim > 0){
                        switch(opcAnim){
                        case 1:
                            Animal a = new Animal(nome, patas, velocidade, localizacao);
                            animaisList.add(a);
                        break;
                        case 2:
                            System.out.println("Qual o tipo de água que esse peixe vive?\n0 - Doce\n1 - Salgada");
                            int agua = sc.nextInt();
                            Peixe p = new Peixe(nome, patas, velocidade, localizacao, agua);
                            animaisList.add(p);
                        break;
                        case 3:
                            Ave ave = new Ave(nome, patas, velocidade, localizacao);
                            animaisList.add(ave);
                        break;
                        }
                    }else{
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                    System.out.println("Temos "+animaisList.size() + " animais cadastrados");
                break;
                case 2:
                System.out.println("----- Listar Animais -----");    
                for(Animal animalItem : animaisList){
                    System.out.println(animalItem.toString());
                }
                break;
                case 3:
                System.out.println("----- Mover Animal -----");  
                for(Animal a : animaisList){
                    a.mover();
                }  
                break;
                case 4:
                System.out.println("----- Editar Animal -----");    
                break;
            }
        }else{
            System.out.println("Opção inválida, tente novamente.");
        }
            System.out.println(menu);
            opcao = sc.nextInt();
        }while(opcao != 0);
        
        
        
    
        sc.close();
    }
}
