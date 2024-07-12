package ar.com.codo24100.web.controller;

import java.io.IOException;

import ar.com.codo24100.web.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BorrarMovieController")
public class BorrarMovieController extends HttpServlet {
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idString = req.getParameter("id");
        MovieService service = new MovieService();
        int id = Integer.parseInt(idString);
        service.borrarMovie(id);

        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
