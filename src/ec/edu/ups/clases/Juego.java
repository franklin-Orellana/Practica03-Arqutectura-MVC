package ec.edu.ups.clases;

//import ec.edu.ups.prueba.Prueba;

/**
 *
 * Esta clase instancia los atributos, getters y setters, contructores y metodos
 * de la clase abuelo
 *
 * @author FranklinOrellan
 *
 */

public class Juego implements Comparable<Aventura>{

    /**
     * atributos de la clase Juegos
     */
    private int codigo;
    private String nombre;
    private String categorias;
    private int numeroJugadores;

    /**
     * constructor vacio
     */
    public Juego() {
    }

    /**
     * constructor con atributos nombre y codigo
     */
    public Juego(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * constructor con todos los atributos de la clase Juegos
     */
    public Juego(int codigo, String nombre, String categorias, int numeroJugadores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categorias = categorias;
        this.numeroJugadores = numeroJugadores;
    }

    /**
     * generacion de setters y getters
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    // metodos clase abuelo

    public void partidaInicio() {
        System.out.println("" + this.nombre);
    }

    public void partidaTerminada() {
        System.out.println("" + this.nombre);
    }

    /**
     * generacion de toString de la clase Juegos
     */
    @Override
    public String toString() {
        return "n\t\tJuego" + "\nCodigo: " + codigo + "\nNombre: " + nombre + "\nCategorias: " + categorias + "\nNumero De Jugadores: " + numeroJugadores + '"';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Aventura o) {//comparar 
        if(nombre.compareTo(o.getNombre()) >= 1){
            return 1;
            
        }else if(nombre.compareTo(o.getNombre()) <= -1){
            return -1;
            
        }else{
            
            return 0;
        }
    }    
}
