package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Reptil;

public class Lagarto extends Reptil implements Corrida, Predacao{


    public Lagarto(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer(){
        this.comer("insetos");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está sibilando");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " corre rapidamente pelo chão");
    }
}
