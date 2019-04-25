package ec.edu.ups.clases;
/**
 * 
 * Esta clase instancia los atributos, getters y setters, contructores y metodos de la clase padre
 * 
 * @author FranklinOrellan
 * 
 */
public abstract class JuegosDigital extends Juego {

     /**
     * atributos de la clase JuegosDigitales
     */
    
    private boolean modoOnline;
    private boolean digital;
    private String plataforma;
    private String graficos;

    /**
     * constructor vacio
     */
    
    public JuegosDigital() {
    }

    /**
     * constructor con atributos plataforma y digital
     */
    
    public JuegosDigital(boolean digital, String plataforma) {
        this.digital = digital;
        this.plataforma = plataforma;
    }
    
    /**
     * constructor con todos los atributos de la clase JuegosDeAzar y con los atributos de la clase abuelo
     */

    public JuegosDigital(boolean modoOnline, boolean digital, String plataforma, String graficos, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(codigo, nombre, categorias, numeroJugadores);
        this.modoOnline = modoOnline;
        this.digital = digital;
        this.plataforma = plataforma;
        this.graficos = graficos;
    }
    
    /**
     * generacion de setters y getters
     */

    public boolean isOnline() {
        return modoOnline;
    }

    public void setmodoOnline(boolean online) {
        this.modoOnline = online;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGraficos() {
        return graficos;
    }

    public void setGraficos(String graficos) {
        this.graficos = graficos;
    }

    /**
     * metodos de la clase padre 
     */
    
    
    public void cambioPlataforma() {

    }

    public void cambiomodoOnline() {
        
    }
    
    /**
     * metodo abstracto de la clase padre
     */

    public abstract void Multijugador();

    /**
     * generacion de toString de la clase JuegosDigitales
     */
    
    @Override
    public String toString() {
        return super.toString() + "\n\t\tJuegos Digitales" + "\nOnline: " + modoOnline + "\nDigital: " + digital + "\nPlataforma: " + plataforma + "\nGraficos: " + graficos + '"';
    }

}
