package ec.edu.ups.controladores;

import ec.edu.ups.clases.Bingo;
import java.util.Map;
import java.util.TreeMap;

public class ControladorBingo {

    private Map <Integer, Bingo> lista;
    private int codigo;

    public ControladorBingo() {
    
        lista = new TreeMap<>();
        codigo = 0;      
        
    }
    
    public void create(Bingo objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
    
    public Bingo read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
    
    public void update(Bingo objeto){
        lista.put(objeto.getCodigo(), objeto);
        
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    public void imprimir(){
        System.out.println(lista.entrySet());
    }
    
    
    
}
