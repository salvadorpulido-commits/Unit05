package ejercicio02;

public class Directivo extends Empleado {

    // Constructor
    public Directivo(String nombre) {
        super(nombre); // Llama al constructor de Empleado
    }

    @Override
    public String toString() {
        // Aprovecha el toString de Empleado y le concatena su parte
        return super.toString() + " -> Directivo";
    }
}