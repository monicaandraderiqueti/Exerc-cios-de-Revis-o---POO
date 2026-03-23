import java.time.LocalDateTime;
//Objeto Parte
public class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private float preco;

    public Ingresso(){
    }

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nIngresso{" +
                "\nid=" + id +
                "\nassento='" + assento + '\'' +
                "\ntipo='" + tipo + '\'' +
                "\npreco=" + preco +
                '}';
    }
}
