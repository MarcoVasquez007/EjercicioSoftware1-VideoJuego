public class Videojuego {
    public String nombre;
    public String genero;

    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("--- INFORMACIÓN DEL VIDEOJUEGO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El juego " + nombre + " se ha iniciado.");
    }

    void cerrar() {
        activo = false;
        System.out.println("El juego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("La versión de " + nombre + " es: " + version);
    }
}
