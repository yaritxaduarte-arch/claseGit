public class NotificacionSeguidor extends Notificacion {
    protected NotificacionSeguidor (String receptorNotificaciones){
        super(receptorNotificaciones);
    }
    public void enviarMensaje(String mensaje){
        System.out.println( "comenzo a seguirte \" " +mensaje + " a :" + receptorNotificacion );
    }
}
