package com.mycompany.adocaoanimais;

import java.time.LocalDate;

public class Adocao {
    private Adotante adotante;
    private Animal animal;
    private LocalDate dataAdocao;

    public Adocao(Adotante adotante, Animal animal, LocalDate dataAdocao) {
        this.adotante = adotante;
        this.animal = animal;
        this.dataAdocao = dataAdocao;
    }

    public String getResumo() {
        return "Adotante: " + adotante.getNome() + " | Animal: " + animal.getNome() +
               " | Data: " + dataAdocao;
    }
}

