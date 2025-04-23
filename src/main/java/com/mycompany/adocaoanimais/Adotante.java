package com.mycompany.adocaoanimais;

public class Adotante implements Pessoa {
    private String nome;
    private String cpf;

    public Adotante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }
}
