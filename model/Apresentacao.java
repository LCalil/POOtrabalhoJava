package model;

public class Apresentacao {
    private String tema;
    private String nomeAluno;
    private String nomeOrientador;


    public Apresentacao(String tema, String nomeAluno, String nomeOrientador) {
        this.tema = tema;
        this.nomeAluno = nomeAluno;
        this.nomeOrientador = nomeOrientador;
    }


    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeOrientador() {
        return nomeOrientador;
    }
    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    
    
}
