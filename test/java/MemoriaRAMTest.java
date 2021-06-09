import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static private MemoriaRAM miMemoria;

    @BeforeAll
    static void beforeAll() {
        miMemoria = new MemoriaRAM("", 0, 0);
    }

    @Test
    @DisplayName("Cambiar y mostrar marca")
    void manejarMarca(){
        String esperado = "DDR4";
        miMemoria.setMarca(esperado);
        assertEquals(esperado,miMemoria.getMarca());
    }

    @Test
    @DisplayName("Cambiar y mostrar capacidad")
    void manejarCapacidadGB(){
        int esperado = 16;
        miMemoria.setCapacidadGB(esperado);
        assertEquals(esperado,miMemoria.getCapacidadGB());
    }

    @Test
    @DisplayName("Cambiar y mostrar frecuencia")
    void manejarFrecuenciaMHZ(){
        int esperado = 2000;
        miMemoria.setFrecuenciaMHZ(esperado);
        assertEquals(esperado,miMemoria.getFrecuenciaMHZ());
    }

    @Test
    @DisplayName("Imprimir datos de memoria RAM")
    void toStringTest(){
        String esperado = "Marca: "+miMemoria.getMarca()+", Capacidad: "+miMemoria.getCapacidadGB()+
                " GB, Frecuencia: "+miMemoria.getFrecuenciaMHZ()+" MHz\n";
        assertEquals(esperado,miMemoria.toString());
    }
}