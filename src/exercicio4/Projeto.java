package exercicio4;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void TodosProgramadores(Programador A){
        programadores.add(A);
    }

    public void listarProgramadores() {
        for (Programador A : programadores) {
            System.out.println(A);
        }
    }
}