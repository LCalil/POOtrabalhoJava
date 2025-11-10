package model;

public class Evento {
    private String titulo;
    private String data;
    private String tempo;
    private double orcamento;
    private Local local;
    
    
    
    public Evento(String titulo, String data, String tempo, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.tempo = tempo;
        this.orcamento = orcamento;
        this.local = local;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    public double getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
    
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

}
