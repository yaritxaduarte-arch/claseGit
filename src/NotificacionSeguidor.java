public class NotificacionSeguidor extends Notificacion {
    protected NotificacionSeguidor (String notificacionnn){
        super(notificacionnn);
    }
    public void enviarMensaje(String mensaje){
        System.out.println( mensaje + "comenzo a seguirte ");
    }
}
