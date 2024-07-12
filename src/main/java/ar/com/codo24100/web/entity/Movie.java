package ar.com.codo24100.web.entity;

public class Movie {
    private int id_movie;
    private String titulo;
    private int anio;
    private String director;

    public Movie(String titulo, int anio, String director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }

    public Movie(int id_movie, String titulo, int anio, String director) {
        this.id_movie = id_movie;
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie [id_movie=" + id_movie + ", titulo=" + titulo + ", anio=" + anio + ", director=" + director + "]";
    }

    
    
}
