package exercicio4;

public class Programador {
    private int id;
    private String nome, LinguagemPrincipal;

    public Programador() {
    }

    public Programador(int id, String linguagemPrincipal, String nome) {
        this.id = id;
        LinguagemPrincipal = linguagemPrincipal;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinguagemPrincipal() {
        return LinguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        LinguagemPrincipal = linguagemPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", LinguagemPrincipal: '" + LinguagemPrincipal + '\'' +
                '}';
    }
}