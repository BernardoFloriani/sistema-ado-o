package com.mycompany.adocaoanimais.exceptions;

public class CPFInvalidoException extends Exception {

    // Construtor padrão com mensagem
    public CPFInvalidoException() {
        super("O CPF deve conter exatamente 11 dígitos numéricos.");
    }

    // Construtor com mensagem customizada (opcional)
    public CPFInvalidoException(String message) {
        super(message);
    }
    public void validarCPF(String cpf) throws CPFInvalidoException {
    if (!cpf.matches("\\d{11}")) {  // Verifica se tem exatamente 11 dígitos numéricos
        throw new CPFInvalidoException();
    }
}

}
