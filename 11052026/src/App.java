import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option = 0;
        MenuFormas menuFormas = new MenuFormas();
        do{
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
               listaFormas.add(menuFormas.cadastroForma2D());
                break;
                case 2:
                   for(Forma2D forma2d : listaFormas){
                    System.out.println(forma2d.toString());
                   }
                break;
                case 3:
                    for(Forma2D forma2d : listaFormas){
                    System.out.println("Forma: " + forma2d.getNome()+"\n: " + forma2d.area());
                   }
                break;
               
                default:
                break;
            }
        }while(option != 0);
        menuFormas.encerraSistema();
    }
}