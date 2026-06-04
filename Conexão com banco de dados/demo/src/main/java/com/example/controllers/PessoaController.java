package com.example.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.model.Pessoa;
import com.example.model.dao.PessoaDAO;

public class PessoaController {
    PessoaDAO pessoaDao;

    public PessoaController(PessoaDAO pessoaDao){
        this.pessoaDao = pessoaDao;
    }

    public void editarPessoa(Scanner sc){
        ArrayList<Pessoa> pessoas = pessoaDao.listar(); 
        for (Pessoa pItem : pessoas) {
            System.out.println(pItem.toString());
        }
        System.out.println("Digite o ID da pessoa que você quer editar");
        int id = sc.nextInt();
        sc.nextLine();
        Pessoa p = pessoaDao.getByID(id);
        if(p != null){
        System.out.println("Digite o novo nome da pessoa ou 0 para manter o nome: " + p.getNome());
        String n = sc.nextLine();
        if(n != "0"){
            p.setNome(n);
        }
        System.out.println("Digite o novo email da pessoa ou 0 para manter o email: ");
        String e = sc.nextLine();
        if(n != "0"){
            p.setEmail(e);
        }
        pessoaDao.update(p);
        }else{
            System.out.println("ID" + id + "não encontrado");
        }
    }
    public void deletar(Scanner sc){
        System.out.println("Digite o id da pessoa que será excluída do banco");
        int id = sc.nextInt();
        Pessoa p = pessoaDao.getByID(id);
        if (p != null){
            pessoaDao.delete(id);
        }else{
            System.out.println("Pessoa com ID "+id+" não encontrada no banco de dados.");
        }
    }

    public void inserir(Scanner sc){
            System.out.println("Digite o nome da pessoa");
            String nome = sc.nextLine();
            System.out.println("Digite o e-mail da pessoa");
            String email = sc.nextLine();
            Pessoa pessoa = new Pessoa(nome, email);
            pessoaDao.inserir(pessoa);
    }

    public void listar(){
        ArrayList<Pessoa> pessoas = pessoaDao.listar(); 
        for (Pessoa pItem : pessoas) {
            System.out.println(pItem.toString());
        }
    }
}
