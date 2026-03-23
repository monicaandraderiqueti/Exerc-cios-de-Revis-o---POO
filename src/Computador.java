public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(){}

    public Computador(int id, String marca, String marcaP, String modeloP, float freqP) {
        this.id = id;
        this.marca = marca;

        //composição
        this.processador = new Processador(marcaP, modeloP, freqP);
    }
    @Override
    public String toString() {
        return "\nComputador{" +
                "\nid=" + id +
                "\nmarca='" + marca + '\'' +
                "\nprocessador=" + processador +
                '}';
    }
}
