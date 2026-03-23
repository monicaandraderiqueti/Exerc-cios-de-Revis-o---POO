package exercicio1;
public class Paciente {
    private int id;
    private String nome, cpf;

    public Paciente() {
    }

    public Paciente(int id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{" +
                "id =" + id +
                ", nome ='" + nome + '\'' +
                ", cpf ='" + cpf + '\'' +
                '}';
    }
}