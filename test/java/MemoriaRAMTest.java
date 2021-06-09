import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static private MemoriaRAM miMemoria;

    @BeforeAll
    static void beforeAll() {
        miMemoria = new MemoriaRAM("DDR2", 8, 800);
    }

    @Test
    void getMarca(){
        String esperado = "DDR2";
        assertEquals(esperado,miMemoria.getMarca());
    }

    @Test
    void getCapacidadGB(){
        int esperado = 8;
        assertEquals(esperado,miMemoria.getCapacidadGB());
    }

    @Test
    void getFrecuenciaMHZ(){
        int esperado = 800;
        assertEquals(esperado,miMemoria.getFrecuenciaMHZ());
    }
}