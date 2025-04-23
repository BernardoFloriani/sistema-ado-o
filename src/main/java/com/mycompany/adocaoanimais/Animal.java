package com.mycompany.adocaoanimais;

//classe abstrata para instâncias animalescas
public abstract class Animal {
    protected int id;
    protected String nome;
    protected int idade;

    public Animal(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void emitirSom();
}

