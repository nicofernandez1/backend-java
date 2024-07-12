package ar.com.codo24100.web.dao;


import java.util.ArrayList;

import ar.com.codo24100.web.dto.MovieDTO;
import ar.com.codo24100.web.entity.Movie;

public interface ICrud {
    public Movie getById(int id);

    public void crear(MovieDTO movie);

    public void borrar(int id);

    public ArrayList<Movie> listarMovies();

    public void actualizar(MovieDTO movie);
}
