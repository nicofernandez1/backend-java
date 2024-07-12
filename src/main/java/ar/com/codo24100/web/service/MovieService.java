package ar.com.codo24100.web.service;

import java.util.ArrayList;

import ar.com.codo24100.web.dao.ICrud;
import ar.com.codo24100.web.dao.MySQLCrudImpl;
import ar.com.codo24100.web.dto.MovieDTO;
import ar.com.codo24100.web.entity.Movie;

public class MovieService {
    private ICrud crud;

    public MovieService() {
        crud = new MySQLCrudImpl();
    }

    public void crearMovie(MovieDTO movie) {
        crud.crear(movie);
    }

    public Movie obtenerMoviePorID(int id) {
        return crud.getById(id);
    }

    public void borrarMovie(int id) {
        crud.borrar(id);
    }

    public ArrayList<Movie> listarMovies() {
        return crud.listarMovies();
    }

    public void actualizarMovie(MovieDTO movie) {
        crud.actualizar(movie);
    }
}