public class FaturaCliente {

    private static final double PERCENTUAL_TOTAL = 100.0;

    private final int id;
    private Cliente cliente;
    private double valor;

    public FaturaCliente(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public FaturaCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorComDesconto() {
        return valor - calcularDesconto();
    }

    private double calcularDesconto() {
        return valor * cliente.getDesconto() / PERCENTUAL_TOTAL;
    }

    @Override
    public String toString() {
        return "Fatura [id=" + id + ", cliente=" + cliente + ", valor=" + valor + " ]";
    }
}
