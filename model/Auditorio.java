package model;

public class Auditorio extends Local {
    private boolean temSom;
    private boolean temTraducao;

    
    public Auditorio(String nome, int capacidade, String bloco, boolean temSom, boolean temTraducao) {
        super(nome, capacidade, bloco);

        this.temSom = temSom;
        this.temTraducao = temTraducao;
    }


    public boolean isTemSom() {
        return temSom;
    }
    public void setTemSom(boolean temSom) {
        this.temSom = temSom;
    }

    public boolean isTemTraducao() {
        return temTraducao;
    }
    public void setTemTraducao(boolean temTraducao) {
        this.temTraducao = temTraducao;
    }

    
}
