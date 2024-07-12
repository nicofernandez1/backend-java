package ar.com.codo24100.oop;

import java.util.ArrayList;

public class Buscador {
    private String claveDeBusqueda;
    private ArrayList<Articulo> resultados;

    public Buscador() {
        this.resultados = new ArrayList<Articulo>();
    }

    public void buscar() {
        Libro l = new Libro(claveDeBusqueda, "SIN AUTOR", 6600f, "https://sitio.com.ar/img/imagen.jpg", "12345679");
        Pelicula p = new Pelicula("EL INVENCIBLE IRON MAN", "", 2433.6f, "http://bla.com/img/bla.jpg", "ACCION");
    }

    public void mostrarResultados() {
        System.out.println("Hemos encontrado " + getCantidad() + " Resultados Para '"+claveDeBusqueda+"'");

        for(Articulo art : resultados) {
            System.out.println(art.toString());
        }
    }

    public Integer getCantidad() {
        return resultados.size();
    }

    public void setClaveDeBusqueda(String clave) {
        if(clave == null) {
            this.claveDeBusqueda = "";
        } else {
            this.claveDeBusqueda = clave;
        }
    }
}