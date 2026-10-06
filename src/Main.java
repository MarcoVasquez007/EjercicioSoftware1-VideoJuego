public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "The Witcher 3";
        juego1.genero = "RPG";
        juego1.version = "1.32";
        juego1.activo = false;

        Videojuego juego2 = new Videojuego();
        juego2.nombre = "Minecraft";
        juego2.genero = "Sandbox";
        juego2.version = "1.20";
        juego2.activo = false;

        Videojuego juego3 = new Videojuego();
        juego3.nombre = "Valorant";
        juego3.genero = "FPS";
        juego3.version = "7.08";
        juego3.activo = false;

        juego1.iniciar();

        juego1.mostrarInformacion();
        System.out.println();
        juego2.mostrarInformacion();
        System.out.println();
        juego3.mostrarInformacion();
    }
}