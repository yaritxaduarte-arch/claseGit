public class CuentaBancaria {
    private final String id;
    private int saldo;

    //constructor
    public CuentaBancaria ( String id, int saldo){
        this.id= id;
        this.saldo=saldo;
    }

    public String getId() {
        return id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
