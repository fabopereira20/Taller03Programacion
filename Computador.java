public class Computador {
    private String marca;
    private String modelo;
    private MemoriaRAM memoria;

    public Computador(String marca, String modelo, MemoriaRAM memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MemoriaRAM getMemoria() {
        return memoria;
    }

    public void setMemoria(MemoriaRAM memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "*Datos del computador:\n" +
                "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nMemoria: " + memoria.toString();
    }
}
