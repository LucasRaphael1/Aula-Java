package com.example.model.dao;

import com.example.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
    private Connection con;

    public PessoaDAO(Connection con){
        this.con = con;
    }

    public void inserir(Pessoa p){
        String sql = "INSERT INTO pessoa(nome, email) VALUES (?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.execute();
            System.out.println("Pessoa: "+ p.getNome() + " adicionada no banco de dados");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //Listar
    public ArrayList<Pessoa> listar(){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Pessoa p = new Pessoa();
                p.setId(resultSet.getInt("id"));
                p.setNome(resultSet.getString("nome"));
                p.setEmail(resultSet.getString("email"));
                pessoas.add(p);
            }
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas. "+ e.getMessage());
        }
        return pessoas;
    }
    //BUSCA 1 OBJ PESSOA PELO ID
    public Pessoa getByID(int id){
        Pessoa p = null;
        String sql = "SELECT * FROM pessoa WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                p = new Pessoa();
                p.setId(resultSet.getInt("id"));
                p.setNome(resultSet.getString("nome"));
                p.setEmail(resultSet.getString("email"));
            }
            resultSet.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro a encontrar a pessoa com ID "+id+"\n"+ e.getMessage());
        }
        return p;
    }
    //UPDATE
    public void update(Pessoa p){
        String sql = "UPDATE pessoa SET nome = ?, email = ? WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getId());
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Pessoa editada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar pessoa " + p.getNome());
        }
    }

    //DELETE
    public void delete(int id){
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Pessoa com ID "+ id + " removida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar pessoa com id: "+ id + "\n Erro: " + e.getMessage());    
        }
    }
}
