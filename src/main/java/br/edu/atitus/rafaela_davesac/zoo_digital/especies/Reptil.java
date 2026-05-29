package br.edu.atitus.rafaela_davesac.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private String tipoHabitat;

    public Reptil(String nome, Integer idade, String tipoHabitat) {
        super(nome, "Reptil", idade);
        this.tipoHabitat = tipoHabitat;
    }

    public String tipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }


}
