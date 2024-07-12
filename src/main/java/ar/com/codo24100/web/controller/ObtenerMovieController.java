package ar.com.codo24100.web.controller;

import ar.com.codo24100.web.entity.Movie;
import ar.com.codo24100.web.service.MovieService;

public class ObtenerMovieController {
    public static void main(String[] args) {
        int id = 1;
        MovieService service = new MovieService();
        Movie movie = service.obtenerMoviePorID(id);

        System.out.println(movie);
    }
}
