package ar.com.codo24100.oop;

public class MainBuscador {

    public static void main(String[] args) {
        String claveQueEnviaElUsuarioPorForm = "iron man";

        Buscador buscador = new Buscador();

        buscador.setClaveDeBusqueda(claveQueEnviaElUsuarioPorForm);
        buscador.buscar();
        buscador.mostrarResultados();
    }

    
}
