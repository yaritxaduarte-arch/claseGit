public class NotificacionWhatsapp extends Notificacion{
    protected NotificacionWhatsapp(String receptorNotificaciones){
        super(receptorNotificaciones);
    }
    public void enviarMensaje(String mensaje){
        System.out.println("Se envio el mensaje \"" + mensaje +"\" por Whatsapp" + "a: " + receptorNotificacion);

    }
}
