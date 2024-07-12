package ar.com.codo24100.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ar.com.codo24100.web.dto.MovieDTO;
import ar.com.codo24100.web.entity.Movie;

public class MySQLCrudImpl implements ICrud {
    
    public Movie getById(int id) {
        
        String sql = "select * from movies where id_movie = " + id;

        Movie movie = null;
        Connection conn = null;
        try {
            conn = ConnManager.conectar();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id_movie = resultSet.getInt(1);
                String titulo = resultSet.getString(2);
                int anio = resultSet.getInt(3);
                String director = resultSet.getString(4);

                movie = new Movie(id_movie, titulo, anio, director);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            ConnManager.desconectar(conn);
        }

        return movie;
    }

    public void crear(MovieDTO movie) {
        String sql = "insert into movies (titulo,anio,director) values (?,?,?)";
        Connection conn = ConnManager.conectar();

        try {
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, movie.getTitulo());
            statement.setInt(2, movie.getAnio());
            statement.setString(3, movie.getDirector());

            statement.executeUpdate();
            System.out.println("Pelicula insertada correctamente!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnManager.desconectar(conn);
        }
    }

    
    public void borrar(int id) {
        String sql = "delete from movies where id_movie = ?";
        Connection conn = null;

        try {
            conn = ConnManager.conectar();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            if (statement.executeUpdate() > 0) {
                System.out.println("La pelicula con id_movie=" + id + " ha sido eliminada.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnManager.desconectar(conn);
        }
        
    }

    public ArrayList<Movie> listarMovies() {
        String sql = "select * from movies";
        Connection conn = null;
        ArrayList<Movie> movies = new ArrayList<>();

        try {
            conn = ConnManager.conectar();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            

            while (resultSet.next()) {
                int id_movie = resultSet.getInt(1);
                String titulo = resultSet.getString(2);
                int anio = resultSet.getInt(3);
                String director = resultSet.getString(4);

                Movie movie = new Movie(id_movie, titulo, anio, director);

                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnManager.desconectar(conn);
        }

        return movies;
    }

    public void actualizar(MovieDTO movie) {
        String sql = "UPDATE movies SET titulo = ?, anio = ?, director = ? WHERE id_movie = ?";
        Connection conn = null;

        try {
            conn = ConnManager.conectar();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, movie.getTitulo());
            statement.setInt(2, movie.getAnio());
            statement.setString(3, movie.getDirector());
            statement.setInt(4, movie.getId_movie());
            if (statement.executeUpdate() > 0) {
                System.out.println("La pelicula con id_movie=" + movie.getId_movie() + " ha sido ACTUALIZADO.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnManager.desconectar(conn);
        }
    }
}
