package com.mycompany.adocaoanimais;

public class Cachorro extends Animal {
    public Cachorro(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}

