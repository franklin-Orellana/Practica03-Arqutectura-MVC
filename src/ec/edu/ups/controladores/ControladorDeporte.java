package ec.edu.ups.controladores;

import ec.edu.ups.clases.Deporte;
import ec.edu.ups.clases.Poker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControladorDeporte {

    private Set<Deporte> lista;
    private int codigo;

    public ControladorDeporte() {
        lista = new HashSet<>();
        codigo = 0;

    }

    public void create(Deporte objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);

    }

    public Deporte read(int codigo) {
        for (Deporte deporte : lista) {
            if (deporte.getCodigo() == codigo) {
                return deporte;
            }

        }
        return null;
    }

    public void update(Deporte objeto) {
        if (lista.contains(objeto)) {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (Deporte deporte : lista) {
            if (deporte.getCodigo() == codigo) {
                lista.remove(deporte);
            }

        }
    }

    public void imprimir() {
        System.out.println("Lista Ordenada por Nombre");
        for (Deporte deporte : lista) {
            System.out.println(deporte.getNombre());

        }

    }
}
