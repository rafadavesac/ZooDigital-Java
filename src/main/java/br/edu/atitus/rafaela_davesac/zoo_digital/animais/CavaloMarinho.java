package br.edu.atitus.rafaela_davesac.zoo_digital.animais;

import br.edu.atitus.rafaela_davesac.zoo_digital.comportamentos.Nado;
import br.edu.atitus.rafaela_davesac.zoo_digital.especies.Peixe;

public class CavaloMarinho extends Peixe implements Nado {

    public CavaloMarinho(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("crustáceos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no mar");
    }
}
