package br.edu.atitus.rafaela_davesac.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.animais.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.*;

public class Main {

    List<Animal> animais = new ArrayList<>();

    void main() {

        String menu = """
            ===== Zoo Digital =====
            1- Cadastrar animal
            2- Listar todos os animais
            3- Listar Animais Corredores
            4- Listar Animais Nadadores
            5- Listar Animais Voadores
            6- Listar Animais Predadores
            7- Exibir Total de Animais
            0- Sair
            """;

        int opcao;
        do {
            IO.println(menu);
            opcao = Input.scanInt("Selecione uma opção: ");
            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotalAnimais();
                case 0 -> IO.println("Até breve!");
                default -> IO.println("Opção inválida");
            }
        } while (opcao != 0);
    }


    void cadastrarAnimal(){
        String opcoesDeAnimais = """
                               === ANIMAIS ===:
                               --- Mamíferos ---
                               1- Cachorro
                               2- Gato
                               3- Golfinho
                               4- 
                               --- Aves ---
                               5- Pinguim
                               6- Pato
                               7-
                               8-
                               --- Peixes ---
                               9- Peixe Morcego
                               10- Traíra
                               11-
                               12-
                               --- Reptéis ---
                               13- Jacaré
                               14- Naja
                               15-
                               16-
                                """;
        IO.println(opcoesDeAnimais);
        int opcaoEspecie = Input.scanInt("Informe o tipo do animal: ");

        String nome = Input.scanString("Nome do animal: ").trim();

        int idade = Input.scanInt("Idade do animal: ");

        Animal novoAnimal;

        // ---- MAMÍFEROS ----
        switch (opcaoEspecie){
        case 1 -> novoAnimal = new Cachorro(nome, idade);
        case 2 -> novoAnimal = new Gato(nome, idade);
        case 3 -> novoAnimal = new Golfinho(nome, idade);
        case 4 -> novoAnimal = new Coelho(nome, idade);

        // ---- AVES ----
        case 5 -> {
            String corPenas = Input.scanString("Cor das penas: ").trim();
            novoAnimal = new Pato(nome, idade, corPenas);
        }
        case 6 -> {
            String corPenas = Input.scanString("Cor das penas: ").trim();
            novoAnimal = new Pinguim(nome, idade, corPenas);
        }
        case 7 -> {
            String corPenas = Input.scanString("Cor das penas: ").trim();
            novoAnimal = new BeijaFlor(nome, idade, corPenas);
        }
        case 8 -> {
            String corPenas = Input.scanString("Cor das penas: ").trim();
            novoAnimal = new Papagaio(nome, idade, corPenas);
        }


        // ---- PEIXES ----
        case 9 -> novoAnimal = new PeixeMorcego(nome, idade);
        case 10 -> novoAnimal = new Traira(nome, idade);
        case 11 -> novoAnimal = new CavaloMarinho(nome, idade);
        case 12 -> novoAnimal = new Tubarao(nome, idade);


        // ---- RÉPTEIS ----
        case 13 -> novoAnimal = new Jacare(nome, idade);
        case 14 -> novoAnimal = new Naja(nome, idade);
        case 15 -> novoAnimal = new Camaleao(nome, idade);
        case 16 -> novoAnimal = new Lagarto(nome, idade);


        default -> {
            System.out.println("Tipo inválido! Animal não cadastrado.");
            return;
        }
    }
        animais.add(novoAnimal);
        System.out.println("\nAnimal \"" + novoAnimal.getNome() + "\" cadastrado com sucesso!");
    }

    void listarTodos() {
        IO.println("\n--- TODOS OS ANIMAIS ---");

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado ainda.");
            return;
        }

        for (Animal animal : animais) {
            IO.println("\n-----------------------------");
            IO.println("Nome: " + animal.getNome());
            IO.println("Idade: " + animal.getIdade() + " anos");
            IO.println("Espécie: " + animal.getEspecie());
            if (animal instanceof Mamifero){
                Mamifero mamifero = (Mamifero) animal;
                IO.println("Tem pelos: " + (mamifero.getTemPelos() ? "Sim" : "Não"));
            }
            if(animal instanceof Ave){
                Ave ave = (Ave) animal;
                IO.println("Cor das penas: " + ave.getCorPenas());
            }
            if (animal instanceof Peixe){
                Peixe peixe = (Peixe) animal;
                IO.println("Tipo de água: " + peixe.getTipoAgua());
            }
            if (animal instanceof Reptil) {
                Reptil reptil = (Reptil) animal;
                IO.println("Peçonhento: " + (reptil.getPeconhento() ? "Sim" : "Não"));
            }
            animal.emitirSom();
            animal.comer();
        }

        IO.println("\n-----------------------------");
    }

    void listarCorredores(){

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado ainda.");
            return;
        }

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Corrida){
                Corrida corredor = (Corrida) animal;
                IO.println("\n-----------------------------");
                IO.println("Nome:    " + animal.getNome());
                IO.println("Idade:   " + animal.getIdade() + " anos");
                IO.println("Espécie: " + animal.getEspecie());
                corredor.correr();
                encontrou = true;
            }
        }

        if (!encontrou)
            IO.println("Nenhum animal corredor cadastrado.");
    }

    void listarNadadores(){

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado ainda.");
            return;
        }

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Nado){
                Nado nadador = (Nado) animal;
                IO.println("\n-----------------------------");
                IO.println("Nome:    " + animal.getNome());
                IO.println("Idade:   " + animal.getIdade() + " anos");
                IO.println("Espécie: " + animal.getEspecie());
                nadador.nadar();
                encontrou = true;
            }
        }

        if (!encontrou)
            IO.println("Nenhum animal nadador cadastrado.");
    }

    void listarVoadores(){

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado ainda.");
            return;
        }

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Voo){
                Voo voador = (Voo) animal;
                IO.println("\n-----------------------------");
                IO.println("Nome:    " + animal.getNome());
                IO.println("Idade:   " + animal.getIdade() + " anos");
                IO.println("Espécie: " + animal.getEspecie());
                voador.voar();
                encontrou = true;
            }
        }

        if (!encontrou)
            IO.println("Nenhum animal voador cadastrado.");
    }

    void listarPredadores(){

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado ainda.");
            return;
        }

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Predacao){
                Predacao predador = (Predacao) animal;
                IO.println("\n-----------------------------");
                IO.println("Nome:    " + animal.getNome());
                IO.println("Idade:   " + animal.getIdade() + " anos");
                IO.println("Espécie: " + animal.getEspecie());
                predador.cacar();
                encontrou = true;
            }
        }

        if (!encontrou)
            IO.println("Nenhum animal predador cadastrado.");

    }

    void exibirTotalAnimais(){
        IO.println("Número total de animais cadastrados: " + Animal.getContador());
    }
}
