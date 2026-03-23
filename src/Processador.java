public class Processador {
    private String marca;
    private String modelo;
    private float frequencia;

    private Processador(){}

    public Processador(String marca, String modelo, float frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nProcessador{" +
                "\nmarca='" + marca + '\'' +
                "\nmodelo='" + modelo + '\'' +
                "\nfrequencia=" + frequencia +
                '}';
    }
}
