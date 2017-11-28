package com.example.stronda.wallets;

/**
 * Created by Stronda on 27/11/2017.
 */

public class Carteira {
    private String nome;
    private int imagem;
    private String saldo;

    public Carteira(String nome, int imagem, String saldo){
        this.nome = nome;
        this.imagem = imagem;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
