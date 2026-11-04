import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    public void deveRetornarId() {
        Cliente c = new Cliente(1, "Maria", 10);
        assertEquals(1, c.getId());
    }

    @Test
    public void deveRetornarNome() {
        Cliente c = new Cliente(1, "Maria", 10);
        assertEquals("Maria", c.getNome());
    }

    @Test
    public void deveRetornarDesconto() {
        Cliente c = new Cliente(1, "Maria", 10);
        assertEquals(10, c.getDesconto());
    }

    @Test
    public void deveAlterarDesconto() {
        Cliente c = new Cliente(1, "Maria", 10);
        c.setDesconto(20);
        assertEquals(20, c.getDesconto());
    }

    @Test
    public void deveRetornarGeneroNd() {
        Cliente c = new Cliente(1, "Maria", 10);
        assertEquals("nd", c.getGenero());
    }

    @Test
    public void deveRetornarToString() {
        Cliente c = new Cliente(1, "Maria", 10);
        assertEquals("Maria(1)(10%)", c.toString());
    }

    @Test
    public void deveRetornarToStringComDescontoZero() {
        Cliente c = new Cliente(2, "Joao", 0);
        assertEquals("Joao(2)(0%)", c.toString());
    }
}
