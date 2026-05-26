
    /*Pessoa p1 = new Pessoa("Maria das Neves", "00000000000", "06/07/1967");
    Pessoa p2 = new Pessoa("Sergio Caiquicando", "12312312", "10/11/1987");
    Pessoa p3 = new Pessoa("Paula tejano", "42367433", "04/02/2006");
    Pessoa p4 = new Pessoa("Ana conda", "45675456", "06/07/1967");

    pessoas.add(p1);
    pessoas.add(p2);
    pessoas.add(p3);
    pessoas.add(p4);

    System.out.println("Array sem ordenação: \n"+ pessoas);
    Collections.sort(pessoas);

    System.out.println("\n\nArray após ordenação: \n"+pessoas);
        
    //Bisca binária
    Pessoa p5 = new Pessoa("André da Silva", "90909090", "30/03/2012");
    System.out.println("Buscar nome"+p5.getNome()+": " +Collections.binarySearch(pessoas, p5));

    Pessoa p6 = new Pessoa("João Ribeiro", "6767676767", "17/11/2005");
    Pessoa p7 = new Pessoa("Katia Santana", "6767674324", "19/03/2007");
    Pessoa p8 = new Pessoa("Elisangela Silva", "12342325345", "15/05/1993");

    ArrayList<Pessoa> pessoas2 = new ArrayList<>();
    pessoas2.add(p6);
    pessoas2.add(p7);
    pessoas2.add(p8);

    Collections.sort(pessoas2);
    
    System.out.println("Conjuntos disjuntos?"+ Collections.disjoint(pessoas, pessoas2));
    pessoas2.add(p1);
    System.out.println("Depois de add p1 - Conjunto Disjuntos?"+ Collections.disjoint(pessoas, pessoas2));
    System.out.println("Frequência de nome: "+ p1.getNome() + Collections.frequency(pessoas, p1));
    Collections.reverse(pessoas2);
    System.out.println("Array após Collections.reverse"+pessoas2);*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    FileReader fl = new FileReader("src/cadastro_pessoas.csv");
    BufferedReader br = new BufferedReader(fl);
    String line = null;
    br.readLine();
    while((line = br.readLine()) != null){
        String dados[] = line.split(",");
        Pessoa p = new Pessoa(dados[0], dados[1], dados[2]);
        pessoas.add(p);
    }
    br.close();
    System.out.println(pessoas.size()+ " Pessoas cadastradas no sistema!");
    Pessoa p2 = new Pessoa ("Odete da Silva", "203.550.795-67", "23/01/1980");
    BufferedWriter bw = new BufferedWriter(new FileWriter("src/cadastro_pessoas.csv", true));
    bw.write(p2.escreveObjetoCsv());
    bw.close();
}
}
