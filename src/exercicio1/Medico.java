package exercicio1;

public class Medico {
    private int id;
    private String nome, especialidade;

    public Medico() {
    }

    public Medico(int id, String especialidade, String nome) {
        this.id = id;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "id =" + id +
                ", nome ='" + nome + '\'' +
                ", especialidade ='" + especialidade + '\'' +
                '}';
    }
}