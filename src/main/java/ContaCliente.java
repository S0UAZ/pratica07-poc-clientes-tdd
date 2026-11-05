import java.util.Locale;

public class ContaCliente {

    private final int id;
    private Cliente cliente;
    private double saldo = 0.0;

    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public ContaCliente(int id) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return identificarCliente() + " saldo=" + formatarMoeda(saldo);
    }

    public double addDeposito(double valor) {
        saldo += valor;
        System.out.println("Novo saldo: " + formatarMoeda(saldo));
        return saldo;
    }

    public double subSaldo(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de " + formatarMoeda(valor));
            return saldo;
        }
        saldo -= valor;
        return saldo;
    }

    private String identificarCliente() {
        return cliente.getNome() + "(" + cliente.getId() + ")";
    }

    private static String formatarMoeda(double valor) {
        return "R$" + String.format(Locale.US, "%.2f", valor);
    }
}
