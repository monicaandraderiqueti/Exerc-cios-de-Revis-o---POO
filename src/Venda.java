import java.util.ArrayList;
//Todo-Parte

public class Venda {
    private int id;
    private Cliente cliente; //agrega um cliente
    private ArrayList<ItemVenda> itemdevenda; //composição

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itemdevenda = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItemdevenda() {
        return itemdevenda;
    }

    //composição
    public void adicionarItem(int IdItem, int quant, Produto produto){
        ItemVenda item = new ItemVenda(IdItem, quant, produto);
        itemdevenda.add(item);
    }

    public float calcularTotal(){
        float total = 0;
        for(ItemVenda item : itemdevenda){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarVenda() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens:");

        for (ItemVenda item : itemdevenda) {
            System.out.println(item);
        }
        System.out.println("Total: " + calcularTotal());
    }
}
