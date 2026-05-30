package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Ave;
import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.Voo;

public class Papagaio extends Ave implements Voo {
    public Papagaio(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("frutas");
    }


    @Override
    public void emitirSom() {
        IO.println(getNome() + " está imitando vozes");
    }


    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando pelo céu");
    }
}

