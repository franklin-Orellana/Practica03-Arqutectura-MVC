package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

/**
 *
 * Esta clase instancia los atributos, getters y setters, contructores y metodos
 * de la clase hija
 *
 * @author FranklinOrellan
 *
 */
public final class Bingo extends JuegosDeAzar implements Interfaz {

    /**
     * atributos de la clase Bingo
     */
    private int numeroTabla;
    private int numeroBolas;
    private String tipoPremio;
    private boolean comprobarTabla;

    /**
     * constructor vacio
     */
    public Bingo() {
    }

    /**
     * constructor con atributos numeroBolas y numeroTabla
     */
    public Bingo(int numeroTabla, int numeroBolas) {
        this.numeroTabla = numeroTabla;
        this.numeroBolas = numeroBolas;
    }

    /**
     * constructor con todos los atributos de la clase bingo y con los atributos
     * de la clase padre
     */
    public Bingo(int numeroTabla, int numeroBolas, String tipoPremio, boolean comprobarTabla, int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(numeroMesa, fisico, nombreDealer, nombreJuego, codigo, nombre, categorias, numeroJugadores);
        this.numeroTabla = numeroTabla;
        this.numeroBolas = numeroBolas;
        this.tipoPremio = tipoPremio;
        this.comprobarTabla = comprobarTabla;
    }

    /**
     * generacion de setters y getters
     */
    public int getNumeroTabla() {
        return numeroTabla;
    }

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public int getNumeroBolas() {
        return numeroBolas;
    }

    public void setNumeroBolas(int numeroBolas) {
        this.numeroBolas = numeroBolas;
    }

    public String getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    public boolean isComprobarTabla() {
        return comprobarTabla;
    }

    public void setComprobarTabla(boolean comprobarTabla) {
        this.comprobarTabla = comprobarTabla;
    }

    /**
     * metodos de la clase bingo
     */
    public void cambiarTabla() {

    }

    public void cambiartipoPremio() {

    }

    public void modificarnumeroBolas() {

    }

    /**
     * metodos abstracto implementadoaa la clase Bingo
     */
    @Override
    public void Reglas() {
        System.out.println("En el " + this.getNombre() + " no puede haber mas de dos fichas en el mismo casillero ");
    }

    @Override
    public void partidaInicio() {
        System.out.println("Partida a dado inicio " + this.getNombre());
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado " + this.getNombre());
    }

    /**
     * generacion de toString de la clase Bigo
     */
    @Override
    public String toString() {
        return super.toString() + "\n\t\tBingo" + "\nnumeroTabla: " + numeroTabla + "\nnumeroBolas: " + numeroBolas + "\ntipoPremio: " + tipoPremio + "\ncomprobarTabla: " + comprobarTabla + '"';
    }

}
