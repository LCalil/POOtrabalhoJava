package model;

public class Sala extends Local {
    private int numeroDaSala;
    private boolean temMultimidia;


    public Sala(String nome, int capacidade, String bloco, int numeroDaSala, boolean temMultimidia) {
        super(nome, capacidade, bloco);

        this.numeroDaSala = numeroDaSala;
        this.temMultimidia = temMultimidia;
    }


    public int getNumeroDaSala() {
        return numeroDaSala;
    }
    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }


    public boolean isTemMultimidia() {
        return temMultimidia;
    }
    public void setTemMultimidia(boolean temMultimidia) {
        this.temMultimidia = temMultimidia;
    }
    
}
