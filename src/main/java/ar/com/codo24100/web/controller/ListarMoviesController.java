package ar.com.codo24100.web.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codo24100.web.entity.Movie;
import ar.com.codo24100.web.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListarMoviesController")
public class ListarMoviesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MovieService service = new MovieService();
        ArrayList<Movie> movies = service.listarMovies();
        ObjectMapper mapper = new ObjectMapper();
        String moviesJSON = mapper.writeValueAsString(movies);
        resp.getWriter().println(moviesJSON);
    }
}
