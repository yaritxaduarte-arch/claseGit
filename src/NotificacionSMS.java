public class NotificacionSMS extends Notificacion{
    protected NotificacionSMS(String receptorNotificaciones){
        super(receptorNotificaciones);
    }
    public void enviarMensaje(String mensaje){
        System.out.println("Se envio el mensaje \"" + mensaje +"\" por Mensaje" + " a: " + receptorNotificacion);

    }
}
