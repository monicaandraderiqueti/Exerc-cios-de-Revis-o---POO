package exercicio2;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class PegarLivro {
    public static void main(String[] args){
        Livro L1 = new Livro("Harry Potter", "JK Rowling", 934);
        System.out.println("\n" + L1.toString());

        Leitor Lt1 = new Leitor(123, "Leonardo");
        System.out.println("\n" + Lt1.toString());

        LocalDateTime dataEmprestimo = java.time.LocalDateTime.of(2026, 3, 23, 19, 58);

        LocalDateTime dataDevolucao = java.time.LocalDateTime.of(2026, 3, 30, 19, 58);

        Emprestimo Emp1 = new Emprestimo(dataEmprestimo, L1, Lt1, dataDevolucao);
        System.out.println("\n" + Emp1.toString());
    }
}