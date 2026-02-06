public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("15", 10000);
        cuenta1.consignar(150);
        cuenta1.retirar(100);
        System.out.println("El saldo de la cuenta es :" + cuenta1.getSaldo());
        Notificacion[] notificaciones = new Notificacion[3];
        notificaciones[0] = new NotificacionCorreo("ana");
        notificaciones[1] = new NotificacionSMS("yaritxa");
        notificaciones[2] = new NotificacionWhatsapp("maria");


        notificaciones[0].enviarMensaje("correo ");
        notificaciones[1].enviarMensaje("sms");
        notificaciones[2].enviarMensaje("Whatsapp");



    }
}