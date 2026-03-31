import java.util.Calendar;

public class Pessoa {
    private String nome;
    private Calendar nascimento;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public Calendar getNascimento(){return this.nascimento;}
    public void setNascimento(Calendar nascimento){this.nascimento = nascimento;}

    public String getCpf(){return this.cpf;}
    public void setCpf(String cpf){this.cpf = cpf;}

    public String getTelefone(){return this.telefone;}
    public void setTelefone(String telefone){this.telefone = telefone;}

    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}

    public String toString(){
        return "Pessoa - " + "\t Nome: " + this.nome + "\t Nascimento: " + this.nascimento + "\t CPF: " + this.cpf  ;
    }
}