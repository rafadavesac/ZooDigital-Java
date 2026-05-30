package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Mamifero;

public final class Coelho extends Mamifero implements Corrida, Nado {
    public Coelho(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("cenouras");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está fazendo barulhos baixinhos");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando apavorado");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo gramado!");
    }
}
