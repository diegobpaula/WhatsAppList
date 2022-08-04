package com.example.whatsapplist.Model;

public class Usuario {

    private int foto;
    private String nome;
    private String msg;

    public Usuario(int foto, String nome, String msg) {
        this.foto = foto;
        this.nome = nome;
        this.msg = msg;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
