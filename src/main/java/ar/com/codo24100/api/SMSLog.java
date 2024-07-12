package ar.com.codo24100.api;

public class SMSLog implements ILog {
    
    public void log(String msj) {
        System.out.println("Enviando sms a Jose: ");
        System.out.println(msj);
    }
}
