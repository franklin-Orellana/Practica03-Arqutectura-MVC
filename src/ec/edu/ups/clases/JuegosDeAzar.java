package ec.edu.ups.clases;

/**
 *
 * Esta clase instancia los atributos, getters y setters, contructores y metodos
 * de la clase abuelo
 *
 * @author FranklinOrellan
 *
 */

public abstract class JuegosDeAzar extends Juego {

    /**
     * atributos de la clase JuegosDeAzar
     */
    private int numeroMesa;
    private boolean fisico;
    private String nombreDealer;
    private String nombreJuego;

    /**
     * constructor vacio
     */
    public JuegosDeAzar() {
    }

    /**
     * constructor con atributos numeroMesa y fisico
     */
    public JuegosDeAzar(int numeroMesa, boolean fisico) {
        this.numeroMesa = numeroMesa;
        this.fisico = fisico;
    }

    /**
     * constructor con todos los atributos de la clase JuegosDeAzar y con los
     * atributos de la clase padre
     */
    public JuegosDeAzar(int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(codigo, nombre, categorias, numeroJugadores);
        this.numeroMesa = numeroMesa;
        this.fisico = fisico;
        this.nombreDealer = nombreDealer;
        this.nombreJuego = nombreJuego;
    }

    /**
     * generacion de setters y getters
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isFisico() {
        return fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }

    public String getNombreDealer() {
        return nombreDealer;
    }

    public void setNombreDealer(String nombreDealer) {
        this.nombreDealer = nombreDealer;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    /**
     * metodos de la clase padre
     */
    public void cambioMesa() {

    }

    public void cambiomodoJuego() {

    }

    public void cambionombreDealer() {

    }

    /**
     * metodo abstracto de la clase padre
     */
    public abstract void Reglas();

    /**
     * generacion de toString de la clase JuegosDeAzar
     */
    @Override
    public String toString() {
        return super.toString() + "\n\t\tJuegos De Azar" + "\nNumero de Mesa: " + numeroMesa + "\nFisico: " + fisico + "\nNombre del Dealer: " + nombreDealer + "\nNombre de Juego: " + nombreJuego + '"';
    }

}
