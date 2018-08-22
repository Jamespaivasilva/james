/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Classes.Aluno;
import Classes.Media;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author logonlb
 */
public class AlunoDAO {

    public ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> lista = new ArrayList<Aluno>();

        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM alunos ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setRgm(rs.getString("rgm"));
                aluno.setLogin(rs.getString("login"));
                aluno.setSenha(rs.getString("senha"));

                lista.add(aluno);

            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public String login(String login, String senha) {
        String resp = "";
        
        Aluno aluno = new Aluno();
        try {
            Connection con = Conecta.getConexao();

            String sql1 = "SELECT * FROM alunos where login='" + login + "' and senha='" + senha + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql1);

            if (rs.next()) {
                aluno.setRgm_(rs.getString("rgm"));
                aluno.setLogin(rs.getString("login"));
                aluno.setSenha(rs.getString("senha"));
               
                rs.close();
                con.close();
                resp = "OK";

            } else {
               resp = "Login/senha não existe";
            }

        } catch (Exception e) {
            resp = "ERRO: " + e.toString();
        }
        return resp;
    }

}
