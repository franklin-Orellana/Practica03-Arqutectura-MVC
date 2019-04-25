package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;
/**
 * 
 * Esta clase instancia los atributos, getters y setters, contructores y metodos de la clase hija
 * 
 * @author FranklinOrellan
 * 
 */
public final class Deporte extends JuegosDigital implements Interfaz {
    
    /**
     * atributos de la clase Deporte
     */
    
    private String nombreEquipo;
    private String tiempo;
    private boolean cambioJugador;
    private boolean cambioTactica;

    /**
     * constructor vacio
     */
    
    public Deporte() {
    }
    
    /**
     * constructor con atributos nombreEquipo y tiempo
     */

    public Deporte(String nombreEquipo, String tiempo) {
        this.nombreEquipo = nombreEquipo;
        this.tiempo = tiempo;
    }

    /**
     * constructor con todos los atributos de la clase deporte y con los atributos de la clase padre
     */
    
    public Deporte(String nombreEquipo, String tiempo, boolean cambioJugador, boolean cambioTactica, boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(modoOnline, digital, plataforma, graficos, codigo, nombre, categorias, numeroJugadores);
        this.nombreEquipo = nombreEquipo;
        this.tiempo = tiempo;
        this.cambioJugador = cambioJugador;
        this.cambioTactica = cambioTactica;
    }

   /**
     * generacion de setters y getters
     */
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isCambioJugador() {
        return cambioJugador;
    }

    public void setCambioJugador(boolean cambioJugador) {
        this.cambioJugador = cambioJugador;
    }

    public boolean isCambioTactica() {
        return cambioTactica;
    }

    public void setCambioTactica(boolean cambioTactica) {
        this.cambioTactica = cambioTactica;
    }

    /**
     * metodos de la clase aventura 
     */
    
    public void cambiarnombreEquipo(){
        
    }
    
    public void modificarTiempo(){
        
    }
    
    public void modificarTactica(){
        
    }
    
    /**
     * metodos abstracto implementadoaa la clase Deporte
     */
    
    @Override
    public void Multijugador() {
        System.out.println("El juego es multijugador y pueden jugar hasta "+this.getNumeroJugadores()+" jugadores");    
    }

    @Override
    public void partidaInicio() {
        System.out.println("La Partida a dado inicio " +this.getNombre());    
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado "+ this.getNombre());    
    }
    
    /**
     * generacion de toString de la clase Deporte
     */
    
    @Override
    public String toString() {
        return super.toString() + "\n\t\tDeporte\n" + "\nNombre De Equipo: " + nombreEquipo + "\nTiempo De Juego: " + tiempo + "\nCambio De Jugador: " + cambioJugador + "\nCambio De Tactica: " + cambioTactica + '"';
    }

    
    
    
    
}
