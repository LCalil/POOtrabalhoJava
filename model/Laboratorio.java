package model;

public class Laboratorio extends Local {
    private int computadoresDisponiveis;
    private String laboratorio;
    

    public Laboratorio(String nome, int capacidade, String bloco, int computadoresDisponiveis, String laboratorio) {
        super(nome, capacidade, bloco);
        
        this.computadoresDisponiveis = computadoresDisponiveis;
        this.laboratorio = laboratorio;
    }


    public int getComputadoresDisponiveis() {
        return computadoresDisponiveis;
    }
    public void setComputadoresDisponiveis(int computadoresDisponiveis) {
        this.computadoresDisponiveis = computadoresDisponiveis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
}
