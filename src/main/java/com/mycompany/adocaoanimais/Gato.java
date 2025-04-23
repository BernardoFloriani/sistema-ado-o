package com.mycompany.adocaoanimais;

public class Gato extends Animal {
    public Gato(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

