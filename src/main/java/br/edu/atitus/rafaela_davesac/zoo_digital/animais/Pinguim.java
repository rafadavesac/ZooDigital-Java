package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Ave;

public class Pinguim extends Ave implements Nado {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando atrás de peixes");
    }

}
