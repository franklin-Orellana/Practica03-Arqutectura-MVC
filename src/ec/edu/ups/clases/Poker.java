package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;
/**
 * 
 * Esta clase instancia los atributos, getters y setters, contructores y metodos de la clase hija
 * 
 * @author FranklinOrellan
 * 
 */
public final class Poker extends JuegosDeAzar implements Interfaz{
    
    /**
     * atributos de la clase Poker
     */

    private int tipoFicha;
    private int numeroPuesto;
    private double apuesta;
    private String mostrarJuegos;

    /**
     * constructor vacio
     */
    
    public Poker() {
    }
    
    /**
     * constructor con atributos numeroPuesto y apuesta
     */

    public Poker(int numeroPuesto, double apuesta) {
        this.numeroPuesto = numeroPuesto;
        this.apuesta = apuesta;
    }
    
    /**
     * constructor con todos los atributos de la clase poker y con los atributos de la clase padre
     */

    public Poker(int tipoFicha, int numeroPuesto, double apuesta, String mostrarJuegos, int numeroMesa, boolean fisico, String nombreDealer, String nombreJuego, int codigo, String nombre, String categorias, int numeroJugadores) {
        super(numeroMesa, fisico, nombreDealer, nombreJuego, codigo, nombre, categorias, numeroJugadores);
        this.tipoFicha = tipoFicha;
        this.numeroPuesto = numeroPuesto;
        this.apuesta = apuesta;
        this.mostrarJuegos = mostrarJuegos;
    }

    /**
     * generacion de setters y getters
     */
    
    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public double getApuesta() {
        return apuesta;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }

    public String getMostrarJuegos() {
        return mostrarJuegos;
    }

    public void setMostrarJuegos(String mostrarJuegos) {
        this.mostrarJuegos = mostrarJuegos;
    }

    /**
     * metodos de la clase poker 
     */
    
    public void cambiartipoFicha(){
        
    }
    
    public void modificarApuesta(){
        
    }
    
    public void cambiarnumeroPuesto(){
        
    }
    
    /**
     * metodos abstracto implementadoaa la clase Poker
     */
    
    @Override
    public void Reglas() {
        System.out.println("En el "+this.getNombre()+" no es permitido mostrar las cartas a otro oponente");
    }

    @Override
    public void partidaInicio() {
        System.out.println("Partida a dado inicio "+this.getNombre());    
    }

    @Override
    public void partidaTerminada() {
        System.out.println("La Partida a terminado "+this.getNombre());
    }
    
    /**
     * generacion de toString de la clase poker
     */
    
    @Override
    public String toString() {
        return super.toString() + "\n\t\tPoker" + "\nTipo de Ficha: " + tipoFicha + "\nNumero de Puesto: " + numeroPuesto + "\nApuesta: " + apuesta + "\nMostrar Juegos: " + mostrarJuegos + '"';
    }

    
    
}
