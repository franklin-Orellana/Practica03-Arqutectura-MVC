package ec.edu.ups.controladores;

import ec.edu.ups.clases.Poker;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ControladorPoker {

    private SortedSet<Poker> listaOrdenada;
    private int codigo;

    public ControladorPoker() {
    
        listaOrdenada = new TreeSet<>();
        codigo = 1;
    
    }

    public void create(Poker objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        listaOrdenada.add(objeto);
    }
    
    public Poker read(int codigo){
        for (Poker poker : listaOrdenada) {
            if(poker.getCodigo() == codigo){
                return poker;
            }
        }
        return null;
    }
    
    public void update(Poker objeto){
        if(listaOrdenada.contains(objeto)){
            listaOrdenada.remove(objeto);
            listaOrdenada.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Poker poker : listaOrdenada) {
            if(poker.getCodigo() == codigo){
                listaOrdenada.remove(poker);
            break;
            }
            
        }
    }

    public void imprimir(){
        System.out.println("Lista Ordenada por Nombre");
        for (Poker poker : listaOrdenada) {
            System.out.println(poker.getNombre());
            
        }
    }
    
}


