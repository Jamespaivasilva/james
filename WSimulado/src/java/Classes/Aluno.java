/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class Aluno {

    private String rgm;
    private String nome;
    private String login;
    private String senha;
    private static String rgm_;
    
    public String getRgm() {
        return rgm;
    }


    public void setRgm(String rgm) {
        this.rgm = rgm;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    
    public static String getRgm_() {
        return rgm_;
    }

    public static void setRgm_(String aRgm_) {
        rgm_ = aRgm_;
    }

    
    
}
