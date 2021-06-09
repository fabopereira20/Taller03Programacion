public class MemoriaRAM {
    private String marca;
    private int capacidadGB;
    private int frecuenciaMHZ;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadGB() {
        return this.capacidadGB;
    }

    public void setCapacidadGB(int capacidadGB) {
        this.capacidadGB = capacidadGB;
    }

    public int getFrecuenciaMHZ() {
        return this.frecuenciaMHZ;
    }

    public void setFrecuenciaMHZ(int frecuenciaMHZ) {
        this.frecuenciaMHZ = frecuenciaMHZ;
    }

    public MemoriaRAM(String marca, int capacidadGB, int frecuenciaMHZ) {
        this.marca = marca;
        this.capacidadGB = capacidadGB;
        this.frecuenciaMHZ = frecuenciaMHZ;
    }
}
