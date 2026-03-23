import java.time.LocalDateTime;
import java.util.ArrayList;

//Todo principal
public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; //agregação
    private ArrayList<Ingresso> ingressos; //composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.filme = filme;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f){ //agregação
        this.filme = f;
    }

    //composição
    public void venderIngresso(int id, String assento, String tipo, float preco){
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        return "\nSessao{" +
                "\nid=" + id +
                "\nhorario=" + horario +
                "\nsala=" + sala +
                "\nfilme=" + filme +
                "\ningressos=" + ingressos +
                '}';
    }
}
