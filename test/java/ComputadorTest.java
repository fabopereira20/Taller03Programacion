import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    static private Computador miComputador;
    static private MemoriaRAM miMemoria;

    @BeforeAll
    static void beforeAll() {
        miMemoria = new MemoriaRAM("DDR2", 0, 0);
        miComputador = new Computador("", "", miMemoria);
    }

    @Test
    @DisplayName("Cambiar y mostrar marca")
    void manejarMarca(){
        String esperado = "Linux";
        miComputador.setMarca(esperado);
        assertEquals(esperado, miComputador.getMarca());
    }

    @Test
    @DisplayName("Cambiar y mostrar modelo")
    void manejarModelo(){
        String esperado = "Acer";
        miComputador.setModelo(esperado);
        assertEquals(esperado, miComputador.getModelo());
    }

    @Test
    @DisplayName("Imprimir datos de computador")
    void toStringTest(){
        String esperado = "*Datos del computador:\n" +
                "Marca: " + miComputador.getMarca() +
                "\nModelo: " + miComputador.getModelo() +
                "\nMemoria: " + miMemoria.toString();
        assertEquals(esperado, miComputador.toString());
    }

}