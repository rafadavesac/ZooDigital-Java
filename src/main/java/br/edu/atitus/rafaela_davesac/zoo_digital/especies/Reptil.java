package br.edu.atitus.rafaela_davesac.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean peconhento;

    public Reptil(String nome, Integer idade, Boolean peconhento) {
        super(nome, "Reptil", idade);
        this.peconhento = peconhento;
    }

    public Boolean peconhento() {
        return peconhento;
    }

    public Boolean getPeconhento() {
        return peconhento;
    }

    public void setPeconhento(Boolean peconhento) {
        this.peconhento = peconhento;
    }


}
