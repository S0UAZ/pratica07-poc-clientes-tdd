import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaClienteTest {

    @Test
    public void deveRetornarId() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(1, conta.getId());
    }

    @Test
    public void deveRetornarCliente() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(c, conta.getCliente());
    }

    @Test
    public void deveRetornarSaldo() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    public void deveCriarContaSemSaldo() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(2, c);
        assertEquals(c, conta.getCliente());
    }

    @Test
    public void deveCriarContaSoComId() {
        ContaCliente conta = new ContaCliente(3);
        assertEquals(3, conta.getId());
    }

    @Test
    public void deveAlterarCliente() {
        Cliente c = new Cliente(1, "Maria", 10);
        Cliente c2 = new Cliente(2, "Joao", 5);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        conta.setCliente(c2);
        assertEquals(c2, conta.getCliente());
    }

    @Test
    public void deveAlterarSaldo() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        conta.setSaldo(50.0);
        assertEquals(50.0, conta.getSaldo());
    }

    @Test
    public void deveRetornarToString() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals("Maria(1) saldo=R$100.00", conta.toString());
    }

    @Test
    public void deveDepositar() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(150.0, conta.addDeposito(50.0));
    }

    @Test
    public void deveSacar() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(70.0, conta.subSaldo(30.0));
    }

    @Test
    public void deveSacarTodoOSaldo() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        conta.subSaldo(100.0);
        assertEquals("Maria(1) saldo=R$0.00", conta.toString());
    }

    @Test
    public void naoDeveSacarMaisQueOSaldo() {
        Cliente c = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(1, c, 100.0);
        assertEquals(100.0, conta.subSaldo(150.0));
    }
}
