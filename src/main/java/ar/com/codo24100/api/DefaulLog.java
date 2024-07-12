package ar.com.codo24100.api;

public class DefaulLog implements ILog{
        
        public void log(String msj) {
            System.out.println("Log en file system por defecto: " + msj);
            
        }
}
