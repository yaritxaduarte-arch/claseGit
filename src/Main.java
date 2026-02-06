public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("15", 10000);
        cuenta1.consignar(150);
        cuenta1.retirar(100);
        System.out.println("El saldo de la cuenta es :" + cuenta1.getSaldo());
        Notificacion[] notificaciones = new Notificacion[4];
        notificaciones[0] = new NotificacionCorreo("anacelita");
        notificaciones[1] = new NotificacionSMS("yayariya");
        notificaciones[2] = new NotificacionSeguidor("juan.juan");

        notificaciones[3] = new NotificacionWhatsapp("maria");


        notificaciones[0].enviarMensaje("no entiendo que estoy haciendo");
        notificaciones[1].enviarMensaje("no entiendo que estoy haciendo");
        notificaciones[2].enviarMensaje("seguidor");
        notificaciones[3].enviarMensaje("Whatsapp");



    }
}