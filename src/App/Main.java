package App;

import Model.*;
import Util.RutInvalidoException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA LLANQUIHUE TOUR ===\n");

        // 1. Crear Direcciones (Composición)
        Direccion dir1 = new Direccion("Av. Los Volcanes", 452, "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Falsa", 123, "Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Pasaje El Lago", 789, "Frutillar", "Los Lagos");

        // 2. Crear RUTs
        Rut rut1 = new Rut("12345678-9");
        Rut rut2 = new Rut("98765432-1");
        Rut rut3 = new Rut("11111111-K");

        // 3. Crear instancias de las clases (Herencia y Composición)
        Empleado empleado = new Empleado("Juan", "Pérez", rut1, dir1, "Guía Turístico", 850000);
        Cliente cliente = new Cliente("María", "González", rut2, dir2, "Nacional");
        Proveedor proveedor = new Proveedor("Transportes del Sur SpA", "Rojas", rut3, dir3, "Transporte Lacustre");

        // 4. Mostrar resultados por consola usando toString()
        System.out.println("--- DATOS REGISTRADOS ---");
        System.out.println(empleado.toString());
        System.out.println(cliente.toString());
        System.out.println(proveedor.toString());

        // 5. Demostrar validación de RUT (Excepción)
        System.out.println("\n--- PRUEBA DE VALIDACIÓN DE RUT ---");
        try {
            Rut rutInvalido = new Rut("1234567"); // Formato incorrecto
            System.out.println(rutInvalido.toString());
        } catch (RutInvalidoException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
    }
}
