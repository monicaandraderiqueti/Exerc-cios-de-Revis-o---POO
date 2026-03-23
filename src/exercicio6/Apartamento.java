package exercicio6;

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
        return "\nexercicio6.Apartamento{" +
                "\nnumero=" + numero +
                "\nandar=" + andar +
                '}';
    }
}
