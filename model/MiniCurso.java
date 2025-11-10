package model;

import java.util.List;

public class MiniCurso extends Evento {
    private int cargaHoraria;
    private List<String> materiaisDeApoio;
    private List<Instrutor> instrutores;


    public MiniCurso(String titulo, String data, String tempo, double orcamento, Local local, int cargaHoraria,
                 List<String> materiaisDeApoio, List<Instrutor> instrutores) {
        
        super(titulo, data, tempo, orcamento, local);

        this.cargaHoraria = cargaHoraria;
        this.materiaisDeApoio = materiaisDeApoio;
        this.instrutores = instrutores;
    }


    public void adicionarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }
    public void adicionarMaterial(String material) {
        this.materiaisDeApoio.add(material);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getMateriaisDeApoio() {
        return materiaisDeApoio;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }
}