/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adocaoanimais;

/**
 *
 * @author berna
 */
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

