package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.*;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Reptil;

public class Camaleao extends Reptil implements Predacao{


    public Camaleao(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer(){
        this.comer("insetos");
    }


    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando insetos com sua língua");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " não faz nenhum som");
    }
}