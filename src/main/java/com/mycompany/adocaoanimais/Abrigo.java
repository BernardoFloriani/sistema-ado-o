/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adocaoanimais;

/**
 *
 * @author berna
 */
import java.util.*;

public class Abrigo {
    private ArrayList<Animal> animaisDisponiveis;
    private ArrayList<Adotante> adotantes;
    private ArrayList<Adocao> adocoes;
    private int contadorId = 1;

    public Abrigo() {
        animaisDisponiveis = new ArrayList<>();
        adotantes = new ArrayList<>();
        adocoes = new ArrayList<>();

        // Animais iniciais
        animaisDisponiveis.add(new Cachorro(contadorId++, "Tobby", 3));
        animaisDisponiveis.add(new Gato(contadorId++, "Luna", 2));
        animaisDisponiveis.add(new Cachorro(contadorId++, "Rex", 5));
        animaisDisponiveis.add(new Gato(contadorId++, "Mimi", 4));
    }

    public void cadastrarAdotante(String nome, String cpf) throws CPFJaCadastradoException {
        if (cpfJaCadastrado(cpf)) {
            throw new CPFJaCadastradoException("CPF já cadastrado.");
        }
        adotantes.add(new Adotante(nome, cpf));
    }

    private boolean cpfJaCadastrado(String cpf) {
        return adotantes.stream().anyMatch(a -> a.getCpf().equals(cpf));
    }

    public void listarAnimaisPorTipo(String tipo) {
        for (Animal a : animaisDisponiveis) {
            if ((tipo.equalsIgnoreCase("cachorro") && a instanceof Cachorro) ||
                (tipo.equalsIgnoreCase("gato") && a instanceof Gato)) {
                System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome() + " | Idade: " + a.getIdade());
                a.emitirSom();
            }
        }
    }

    public Animal buscarAnimalPorId(int id) {
        for (Animal a : animaisDisponiveis) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public void confirmarAdocao(Adotante adotante, Animal animal) {
        animaisDisponiveis.remove(animal);
        adocoes.add(new Adocao(adotante, animal, java.time.LocalDate.now()));
    }
}
