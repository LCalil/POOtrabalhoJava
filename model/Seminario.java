package model;


import java.util.List;

public class Seminario extends Evento {
    private List<Apresentacao> apresentacoes;

    public Seminario(String titulo, String data, String tempo, double orcamento, Local local,
                     List<Apresentacao> apresentacoes) {
        
        super(titulo, data, tempo, orcamento, local);
        
       
        this.apresentacoes = apresentacoes;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        this.apresentacoes.add(apresentacao);
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }

    
}
