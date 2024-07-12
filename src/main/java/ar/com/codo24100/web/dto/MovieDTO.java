package ar.com.codo24100.web.dto;

public class MovieDTO {
    private int id_movie;
    private String titulo;
    private int anio;
    private String director;

    public MovieDTO() {
        
    }
    
    public MovieDTO(int id_movie, String titulo, int anio, String director) {
        this.id_movie = id_movie;
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }

    

    public MovieDTO(String titulo, int anio, String director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }



    public int getId_movie() {
        return id_movie;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "MovieDTO [id_movie=" + id_movie + ", titulo=" + titulo + ", anio=" + anio + ", director=" + director
                + "]";
    }

    
}
