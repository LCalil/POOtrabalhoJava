package model;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private String especializacao;


    public Instrutor(String nome, String email, String formacao, String especializacao) {
        super(nome, email);

        this.formacao = formacao;
        this.especializacao = especializacao;
    }


    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
