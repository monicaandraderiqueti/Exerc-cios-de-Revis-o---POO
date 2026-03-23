package exercicio8;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String [] args){
        Filme f01 = new Filme(1, "Batman", "ação", 110);
        Filme f02 = new Filme(2, "Titanic", "drama", 120);

        LocalDateTime horario = LocalDateTime.of(2026, 3, 22, 22, 23);
        Sessao s01 = new Sessao(1, horario, 1);

        //agregação vinculando o filme á sessão
        s01.vincularFilme(f01);

        //composição simulando venda ingressos
        s01.venderIngresso(1, "A1", "meia", 20);
        s01.venderIngresso(2, "A2", "inteira", 40);
        s01.venderIngresso(3, "A3", "meia", 20);
        //imprimindo a sessão
        System.out.println(s01);

    }
}
