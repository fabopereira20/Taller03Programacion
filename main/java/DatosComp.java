import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosComp {
    private Computador miComputador;

    public DatosComp() {
        this.miComputador = new Computador("Windows", "Lenovo",
                new MemoriaRAM("DDR4", 32, 1600));
    }

    public Computador getMiComputador() {
        return miComputador;
    }

    public void setMiComputador(Computador miComputador) {
        this.miComputador = miComputador;
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                ¡Bienvenido al taller de computadores! Elija su opción:
                [1] Mostrar datos de su computador
                [2] Editar datos de su computador
                [3] Salir""");
        try{
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> mostrarDatos(miComputador);
                case 2 -> editarDatos(miComputador, leer);
                case 3 -> salir();
                default -> System.err.println("Opción inválida. Intente de nuevo.");
            }
            menu();
        }catch (IllegalArgumentException | InputMismatchException e){
            System.err.println("Opción inválida. Intente de nuevo.");
            menu();
        }
    }

    public void mostrarDatos(Computador miComputador) {
        System.out.println(miComputador);
    }

    public void editarDatos(Computador miComputador, Scanner leer) {
        System.out.println("Ingrese la nueva marca (actual: " + miComputador.getMarca() + ")");
        miComputador.setMarca(leer.next());
        System.out.println("Ingrese el nuevo modelo (actual: " + miComputador.getModelo() + ")");
        miComputador.setModelo(leer.next());
        editarDatosMemoria(miComputador, leer);
    }

    private void editarDatosMemoria(Computador miComputador, Scanner leer) {
        System.out.println("Ingrese la nueva marca de la memoria (actual: " + miComputador.getMemoria().getMarca() + ")");
        miComputador.getMemoria().setMarca(leer.next());
        try{
            System.out.println("Ingrese la nueva capacidad (en GB) de la memoria (actual: " + miComputador.getMemoria().getCapacidadGB() + ")");
            miComputador.getMemoria().setCapacidadGB(leer.nextInt());
            System.out.println("Ingrese la nueva frecuencia (en MHz) de la memoria (actual: " + miComputador.getMemoria().getFrecuenciaMHZ() + ")");
            miComputador.getMemoria().setFrecuenciaMHZ(leer.nextInt());
        }catch (IllegalArgumentException | InputMismatchException e){
            System.err.println("Opción inválida. Volviendo al menú principal...");
        }
    }

    public void salir(){
        System.out.println("¡Hasta luego!");
        System.exit(0);
    }
}