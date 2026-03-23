package exercicio4;

public class VerProgramadores {
    public static void main(String[] args){
        Programador P1 = new Programador(123, "Java", "Beatriz");
        Programador P2 = new Programador(456, "C", "Flávia");
        Programador P3 = new Programador(789, "C#", "Bruno");

        Projeto PJ1 = new Projeto(111, "FACEF: TROTE SOLIDÁRIO");

        PJ1.TodosProgramadores(P1);
        PJ1.TodosProgramadores(P2);
        PJ1.TodosProgramadores(P3);

        System.out.println("\nProgramadores presente nos projeto: ");
        PJ1.listarProgramadores();
    }
}