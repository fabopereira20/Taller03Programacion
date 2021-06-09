import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    static private Computador miComputador;
    static private MemoriaRAM miMemoria;

    @BeforeAll
    static void beforeAll() {
        miComputador = new Computador("Apple", "HP", miMemoria);
    }

    @Test
    void getMarca(){
        String esperado = "Apple";
        assertEquals(esperado, miComputador.getMarca());
    }

    @Test
    void getModelo(){
        String esperado = "HP";
        assertEquals(esperado, miComputador.getModelo());
    }

}