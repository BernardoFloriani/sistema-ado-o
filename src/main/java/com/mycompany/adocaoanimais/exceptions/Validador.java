package com.mycompany.adocaoanimais.exceptions;

public class Validador {
    public static void validarNome(String nome) throws NomeInvalidoException {
        if (!nome.matches("[a-zA-Z\\s]+")) {
            throw new NomeInvalidoException("O nome deve conter apenas letras.");
        }
    }

    public static void validarCPF(String cpf) throws CPFInvalidoException {
        if (!cpf.matches("\\d{11}")) {
            throw new CPFInvalidoException("O CPF deve conter exatamente 11 dígitos numéricos.");
        }
    }
}
