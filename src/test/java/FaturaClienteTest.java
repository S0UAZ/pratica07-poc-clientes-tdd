import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaturaClienteTest {

    @Test
    public void deveRetornarId() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals(1, f.getId());
    }

    @Test
    public void deveRetornarCliente() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals(c, f.getCliente());
    }

    @Test
    public void deveRetornarValor() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals(100.0, f.getValor());
    }

    @Test
    public void deveCriarFaturaSoComId() {
        FaturaCliente f = new FaturaCliente(2);
        assertEquals(2, f.getId());
    }

    @Test
    public void deveAlterarCliente() {
        Cliente c = new Cliente(1, "Maria", 10);
        Cliente c2 = new Cliente(2, "Joao", 5);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        f.setCliente(c2);
        assertEquals(c2, f.getCliente());
    }

    @Test
    public void deveAlterarValor() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        f.setValor(200.0);
        assertEquals(200.0, f.getValor());
    }

    @Test
    public void deveCalcularValorComDesconto() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals(90.0, f.getValorComDesconto());
    }

    @Test
    public void deveCalcularValorComDescontoZero() {
        Cliente c = new Cliente(2, "Joao", 0);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals(100.0, f.getValorComDesconto());
    }

    @Test
    public void deveRetornarToString() {
        Cliente c = new Cliente(1, "Maria", 10);
        FaturaCliente f = new FaturaCliente(1, c, 100.0);
        assertEquals("Fatura [id=1, cliente=Maria(1)(10%), valor=100.0 ]", f.toString());
    }
}
