/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adocaoanimais.exceptions;

/**
 *
 * @author berna
 */
public class NomeInvalidoException extends Exception {

    // Construtor padrão
    public NomeInvalidoException() {
        super("O nome não pode conter números!");
    }

    // Construtor que permite personalizar a mensagem de erro
    public NomeInvalidoException(String message) {
        super(message);
    }
    
    public boolean validarNome(String nome) throws NomeInvalidoException {
    if (nome.matches(".*\\d.*")) {  // Verifica se o nome contém números
        throw new NomeInvalidoException("Nome não pode conter números.");
    }
    return true;
}
}
