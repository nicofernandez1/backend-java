package ar.com.codo24100.web.controller;


import java.io.IOException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codo24100.web.dto.MovieDTO;
import ar.com.codo24100.web.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CrearMovieController")
public class CrearMovieController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        ObjectMapper obj = new ObjectMapper();

        MovieDTO movie = obj.readValue(json, MovieDTO.class);

        MovieService service = new MovieService();
        service.crearMovie(movie);
        
        resp.setStatus(HttpServletResponse.SC_CREATED);
        
    }
}
