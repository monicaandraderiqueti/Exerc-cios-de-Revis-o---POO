package exercicio7;

public class TestaVenda {
    public static void main(String [] args){
        Produto produto01 = new Produto(1, "Arroz", 30f);
        Produto produto02 = new Produto(2, "Bolacha", 5f);
        Produto produto03 = new Produto(3, "Macarrão", 7f);

        Cliente cliente01 = new Cliente(1, "Roberta");

        Venda venda = new Venda(1, cliente01);

        venda.adicionarItem(1, 2, produto01);
        venda.adicionarItem(2, 3, produto02);
        venda.adicionarItem(3, 3, produto03);

        venda.mostrarVenda();
    }
}
