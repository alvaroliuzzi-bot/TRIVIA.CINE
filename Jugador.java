//package trivia;

/**
 * Clase encapsulada para representar a un jugador en la trivia por turnos.
 */
public class Jugador {
    private String nombre;
    private int puntaje;
    private int aciertos;
    private int errores;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
        this.aciertos = 0;
        this.errores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getErrores() {
        return errores;
    }

    public void sumarPuntos(int puntos) {
        this.puntaje += puntos;
        this.aciertos++;
    }

    public void registrarError() {
        this.errores++;
    }
}
