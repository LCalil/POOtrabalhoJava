package model;

public class Organizador extends PessoaResponsavel {
    private String funcaoAdministrativa;


    public Organizador(String nome, String email, String funcaoAdministrativa) {
        super(nome, email);
        
        this.funcaoAdministrativa = funcaoAdministrativa;
    }


    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }
    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
    
    
}
