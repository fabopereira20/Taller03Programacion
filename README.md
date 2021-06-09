# Taller03Programacion

- Desarrollador: Fabián Pereira

Solución:
- El menú manejado por la clase DatosComp crea una instancia de la clase Computador, y entrega al usuario las tres opciones pedidas (mostrar datos del computador, editarlos, y salir, con las validaciones necesarias para el texto de entrada del usuario).
- El menú (DatosComp) es instanciado en la clase principal PrincipalTaller03.
- Para la opción de mostrar datos, se llama a un método que utiliza los métodos getter y toString de Computador para imprimir cada uno de sus atributos por pantalla
- Para la opción de editarlos, se llama a un método que utiliza los métodos setter para cambiar cada dato como lo desee el usuario (con las validaciones necesarias). Para ver los datos luego el usuario debe elegir nuevamente la primera opción.
- El proceso del menú se repite mientras se elijan las primeras dos opciones.
- Para la tercera opción, se termina el ciclo del menú y se imprime un mensaje antes de salir del programa.
