package exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, Livro livro, Leitor leitor, LocalDateTime dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.leitor = leitor;
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatobr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm");
        return "Emprestimo{" +
                "Data de saída do livro: " + dataEmprestimo.format(formatobr) +
                ", Data de devolução do livro: " + dataDevolucao.format(formatobr) +
                ", leitor: " + leitor +
                ", livro: " + livro +
                '}';
    }
}