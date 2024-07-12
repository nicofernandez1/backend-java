package ar.com.codo24100.oop;

public class Libro extends Articulo {

    /*atributos */
    private String isbn;


    /*contructor */
    public Libro(String titulo, String autor, Float precio, String imagen, String isbn) {
        super(titulo, autor, precio, imagen);

        this.isbn = isbn;
    }

    /*metodos: get/sets */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() + ", {Libro {isbn=" + isbn + "}}";
    }

}