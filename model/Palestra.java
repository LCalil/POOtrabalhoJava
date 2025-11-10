package model;

public class Palestra extends Evento {
    private PalestranteConvidado palestrante;


    public Palestra(String titulo, String data, String tempo, double orcamento, Local local,
            PalestranteConvidado palestrante) {
        super(titulo, data, tempo, orcamento, local);

        this.palestrante = palestrante;
    }


    public PalestranteConvidado getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(PalestranteConvidado palestrante) {
        this.palestrante = palestrante;
    }
    
    
}
