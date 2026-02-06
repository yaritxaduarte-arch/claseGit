public class NotificacionCorreo extends Notificacion{
    protected NotificacionCorreo (String receptorNotificaciones){
        super(receptorNotificaciones);
    }
    public void enviarMensaje(String mensaje){
        System.out.println("Se envio el mensaje \"" + mensaje +"\" por correo" + "a: " + receptorNotificacion);

    }
}
