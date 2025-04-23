package com.mycompany.adocaoanimais;

//classe cachorro extendendo a classe abstrata animal
public class Cachorro extends Animal {
    public Cachorro(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    //metodo override de emitir som (método abstrato na classe animal)
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}

