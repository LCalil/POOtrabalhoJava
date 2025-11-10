package control;

import model.*;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Prof. Dr. Ana Silva", "ana.silva@ibmec.br", "Doutorado em IA", "Inteligência Artificial");
        Instrutor instrutor2 = new Instrutor("Prof. Msc. Bruno Costa", "bruno.costa@ibmec.br", "Mestrado em Redes", "Cibersegurança");
    


        Organizador organizador1 = new Organizador("Carlos Mendes", "carlos.mendes@ibmec.br", "Coordenador de Eventos");
        Organizador organizador2 = new Organizador("Sofia Almeida", "sofia.almeida@ibmec.br", "Assistente Administrativa");



        PalestranteConvidado palestrante1 = new PalestranteConvidado("Dra. Eva Mendes", "eva@google.com", "Google");
        PalestranteConvidado palestrante2 = new PalestranteConvidado("Sr. Luis Felipe", "luis@microsoft.com", "Microsoft");



        Sala salaA101 = new Sala("Sala A101", 50, "Bloco A", 101, true);
        Sala salaA102 = new Sala("Sala A102", 40, "Bloco A", 102, false);



        Auditorio audBlocoB = new Auditorio("Auditório Bloco B", 150, "Bloco B", true, false);
        Auditorio audPrincipal = new Auditorio("Auditório Principal", 500, "Bloco A", true, true);



        Laboratorio labInformatica = new Laboratorio("Lab de Info 01", 30, "Bloco C", 30, "informática");
        Laboratorio labQuimica = new Laboratorio("Lab de Química 03", 20, "Bloco C", 0, "química");



        Palestra palestraIA = new Palestra(
            "O Futuro da IA", "20/11/2025", "2 horas", 1500.0,
            audPrincipal,
            palestrante1
        );


        Palestra palestraCloud = new Palestra(
            "Computação em Nuvem", "21/11/2025", "2 horas", 1200.0,
            audBlocoB,
            palestrante2
        );

        
        MiniCurso minicursoJava = new MiniCurso(
            "Java para Web", "22/11/2025", "8 horas", 2500.0,
            labInformatica,
            8, new ArrayList<>(), new ArrayList<>()
        );
        minicursoJava.adicionarInstrutor(instrutor1);
        minicursoJava.adicionarMaterial("Slides da Aula");
        minicursoJava.adicionarMaterial("Projeto GitHub");

        MiniCurso minicursoSeguranca = new MiniCurso(
            "Introdução à Cibersegurança", "23/11/2025", "4 horas", 2000.0,
            labInformatica,
            4, new ArrayList<>(), new ArrayList<>()
        );
        minicursoSeguranca.adicionarInstrutor(instrutor2);
        minicursoSeguranca.adicionarMaterial("Guia de Boas Práticas");

        Seminario seminarioTCC = new Seminario(
            "Apresentação TCCs Eng. Software", "25/11/2025", "4 horas", 300.0,
            salaA101, new ArrayList<>()
        );
        seminarioTCC.adicionarApresentacao(new Apresentacao("App de Saúde", "Aluno A", "Prof. Ana"));
        seminarioTCC.adicionarApresentacao(new Apresentacao("Sistema de Vagas", "Aluno B", "Prof. Bruno"));

        Seminario seminarioPesquisa = new Seminario(
            "Seminário de Iniciação Científica", "26/11/2025", "3 horas", 200.0,
            salaA102, new ArrayList<>()
        );
        seminarioPesquisa.adicionarApresentacao(new Apresentacao("Redes Neurais", "Aluno C", "Prof. Ana"));

        Participante p1 = new Participante("João Vitor", "111.222.333-44", "joao@aluno.ibmec.br", "Engenharia de Software");
        Participante p2 = new Participante("Mariana Costa", "555.666.777-88", "mariana@aluno.ibmec.br", "Ciência de Dados e IA");

        System.out.println("\n--- Exemplos de Objetos Criados ---");
        System.out.println("\nEvento: " + palestraIA.getTitulo());
        System.out.println("Local: " + palestraIA.getLocal().getNome());
        System.out.println("Palestrante: " + palestraIA.getPalestrante().getNome() + " (" + palestraIA.getPalestrante().getInstituicao() + ")");
        
        System.out.println("\nEvento: " + minicursoJava.getTitulo());
        System.out.println("Local: " + minicursoJava.getLocal().getNome());
        System.out.println("Instrutor: " + minicursoJava.getInstrutores().get(0).getNome());
        System.out.println("Material: " + minicursoJava.getMateriaisDeApoio().get(0));

        System.out.println("\nEvento: " + seminarioTCC.getTitulo());
        System.out.println("Local: " + seminarioTCC.getLocal().getNome());
        System.out.println("Nº de Apresentações: " + seminarioTCC.getApresentacoes().size());
        
        System.out.println("\nParticipante: " + p1.getNome() + " (" + p1.getCurso() + ")");
        System.out.println("Participante: " + p2.getNome() + " (" + p2.getCurso() + ")");
        
        System.out.println("\nOrganizador: " + organizador1.getNome() + " (" + organizador1.getFuncaoAdministrativa() + ")");
    }
}