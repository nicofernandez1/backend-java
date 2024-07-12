package ar.com.codo24100.api;

import ar.com.codo24100.api.service.LogService;

public class MainLog {
    public static void main(String[] args) {
        String msj = "error en archivo";
        int log = 1;

        LogService service = new LogService(log);

        service.enviarMensaje(msj);
    }
}
