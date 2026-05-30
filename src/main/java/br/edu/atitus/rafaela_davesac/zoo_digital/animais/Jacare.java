package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Reptil;

public class Jacare extends Reptil implements Nado, Corrida, Predacao{

    public Jacare(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer(){
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está roncando");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando rapidamente");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando uma capivara");
    }
}
