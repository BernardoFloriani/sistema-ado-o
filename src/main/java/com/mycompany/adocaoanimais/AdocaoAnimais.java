package com.mycompany.adocaoanimais;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class AdocaoAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Abrigo abrigo = new Abrigo();

        try {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite seu CPF: ");
            String cpf = sc.nextLine();

            abrigo.cadastrarAdotante(nome, cpf);
            Adotante adotante = new Adotante(nome, cpf);

            System.out.print("Você deseja adotar um cachorro ou gato? ");
            String tipo = sc.nextLine();

            abrigo.listarAnimaisPorTipo(tipo);

            System.out.print("Digite o ID do animal que deseja adotar: ");
            int id = sc.nextInt();

            Animal animal = abrigo.buscarAnimalPorId(id);

            if (animal == null) {
                System.out.println("Animal não encontrado.");
                return;
            }

            System.out.println("Você escolheu: " + animal.getNome() + " (ID: " + animal.getId() + ")");
            System.out.print("Deseja confirmar a adoção? (s/n): ");
            sc.nextLine(); // limpar buffer
            String confirmacao = sc.nextLine();

            if (confirmacao.equalsIgnoreCase("s")) {
                abrigo.confirmarAdocao(adotante, animal);
                System.out.println("Adoção confirmada com sucesso!");
            } else {
                System.out.println("Adoção cancelada.");
            }

        } catch (CPFJaCadastradoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


