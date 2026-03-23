package exercicio1;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
public class TestaConsulta {
    public static void main(String[] args){
        Medico Med1 = new Medico(123, "urologista", "Fábio");
        System.out.println("\n" + Med1.toString());

        Paciente Pac1 = new Paciente(321, "678","Fernando");
        System.out.println("\n" + Pac1.toString());

        LocalDateTime data = java.time.LocalDateTime.of(2026, 5, 20, 11, 20);

        Consulta C1 = new Consulta(data, Med1, 305, Pac1);
        System.out.println("\n" + C1.toString());
    }
}