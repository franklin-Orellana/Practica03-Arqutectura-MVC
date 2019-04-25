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
public final class Aventura extends JuegosDigital implements Interfaz {

    /**
     * atributos de la clase Aventura
     */
    private String misiones;
    private String objetivos;
    private String logro;
    private String mapa;

    /**
     * constructor vacio
     */
    public Aventura() {
    }

    /**
     * constructor con atributos misiones y objetivos
     */
    public Aventura(String misiones, String objetivos) {
        this.misiones = misiones;
        this.objetivos = objetivos;
    }

    /**
     * constructor con todos los atributos de la clase aventura y con los
     * atributos de la clase padre
     */
    public Aventura(String misiones, String objetivos, String logro, String mapa, boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(modoOnline, digital, plataforma, graficos, codigo, nombre, categorias, numeroJugadores);
        this.misiones = misiones;
        this.objetivos = objetivos;
        this.logro = logro;
        this.mapa = mapa;
    }

    /**
     * generacion de setters y getters
     */
    public String getMisiones() {
        return misiones;
    }

    public void setMisiones(String misiones) {
        this.misiones = misiones;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getLogro() {
        return logro;
    }

    public void setLogro(String logro) {
        this.logro = logro;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    /**
     * metodos de la clase aventura
     */
    public void guardarMisiones() {

    }

    public void guardarMapa() {

    }

    public void guardarLogros() {

    }

    /**
     * metodos abstracto implementadoaa la clase Aventura
     */
    @Override
    public void Multijugador() {
        System.out.println("El juego es multijugador y pueden jugar hasta " + this.getNumeroJugadores() + " jugadores");
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
     * generacion de toString de la clase Aventura
     */
    @Override
    public String toString() {
        return super.toString() + "\nAventura" + "\nmisiones: " + misiones + "\nobjetivos: " + objetivos + "\nlogro: " + logro + "\nmapa: " + mapa + '"';
    }

}
