package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.Nado;
import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " é um animal silencioso");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando rapidamente");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando peixes");
    }
}
