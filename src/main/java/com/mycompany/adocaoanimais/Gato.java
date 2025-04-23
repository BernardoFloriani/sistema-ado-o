package com.mycompany.adocaoanimais;

//classe gato extendendo a classe abstrata animal
public class Gato extends Animal {
    public Gato(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    //metodo override de emitir som (método abstrato na classe animal)
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

