package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Reptil;

public class Naja extends Reptil implements Nado, Predacao{


    public Naja(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer(){
        this.comer("carne");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " desliza pela água");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando um rato");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está sibilando: ssss");
    }
}
