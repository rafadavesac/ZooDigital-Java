package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Mamifero;

public class Lobo extends Mamifero implements Corrida, Predacao {

    public Lobo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está uivando para a lua");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo com sua matilha");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando em grupo com sua matilha");
    }
}
