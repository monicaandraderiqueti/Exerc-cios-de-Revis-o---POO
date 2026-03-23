package exercicio3;

public class TestaContrato {
    public static void main(String[] args){
        Atleta A1 = new Atleta(123, "Ponta Esquerda", "Lucas");
        Atleta A2 = new Atleta(456, "Goleiro", "Pedro");

        Time T1 = new Time(111, "FACEF basketball", "Luiz");
        System.out.println("\nDados do time: " + T1.toString());

        T1.contratarAtleta(A1);
        T1.contratarAtleta(A2);

        System.out.println("\nAtletas que estão no time: " + A1.toString() + "," + A2.toString());

        //Anulando time
        T1 = null;

        System.out.println("\nTime removido!");

        System.out.println("\nAtletas ainda existem:");
        System.out.println(A1);
        System.out.println(A2);

    }
}