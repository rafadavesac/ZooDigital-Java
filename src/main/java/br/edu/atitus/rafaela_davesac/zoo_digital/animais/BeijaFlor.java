package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Ave;
import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.Voo;

public class BeijaFlor extends Ave implements Voo {
    public BeijaFlor(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("néctar das flores");
    }


    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo um zumbido contínuo");
    }


    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando ao bater suas asas rapidamente");
    }
}
