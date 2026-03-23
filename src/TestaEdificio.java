public class TestaEdificio {
    public static void main(String[]args){
        Edificio edificio = new Edificio("Franca Garden", "Rua tal");

        edificio.construirApartamento(201, 1);
        edificio.construirApartamento(202, 2);
        edificio.construirApartamento(203, 3);

        System.out.println(edificio);
    }
}
