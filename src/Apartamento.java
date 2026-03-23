public class Apartamento {
    private int numero;
    private int andar;

    public Apartamento(){
    }

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "\nApartamento{" +
                "\nnumero=" + numero +
                "\nandar=" + andar +
                '}';
    }
}
