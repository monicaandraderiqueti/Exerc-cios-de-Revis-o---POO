import java.lang.reflect.Array;
import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Edificio(){}

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void construirApartamento(int numero, int andar){
        Apartamento apartamento1 = new Apartamento(numero, andar);
        apartamentos.add(apartamento1);
    }

    @Override
    public String toString() {
        return "\nEdificio{" +
                "\nnome='" + nome + '\'' +
                "\nendereco='" + endereco + '\'' +
                "\napartamento=" + apartamentos +
                '}';
    }
}
