package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import com.example.controllers.PessoaController;
import com.example.model.dao.ConnectionFactory;
import com.example.model.dao.PessoaDAO;

public class Main {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionFactory.getConnection();
            Scanner sc = new Scanner(System.in);
            PessoaDAO pessoaDao = new PessoaDAO(con);
            PessoaController pessoaController = new PessoaController(pessoaDao);
            String menu = "--- Sistema --- \n"+
                        "1 - Inserir pessoa \n"+
                        "2 - Editar pessoa \n"+
                        "3 - Listar pessoas \n"+
                        "4 - Deletar Pessoa \n"+
                        "0 - Sair \n"+
                        "--> Digite o número referente a opção desejada \n";
                        
            int opc = 0;
            do{
                System.out.println(menu);
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        pessoaController.inserir(sc);
                        break;
                    case 2:
                        pessoaController.editarPessoa(sc);
                        break;
                    case 3:
                        pessoaController.listar();
                        break;
                    case 4:
                        pessoaController.deletar(sc);
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema");
                    default:
                        break;
                }
            }while(opc != 0);

            sc.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}