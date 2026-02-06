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
    public void consignar(int valorAConsignar){
        if ( valorAConsignar <= 0)throw new IllegalArgumentException("El valor no es valido");
        this.saldo+=valorAConsignar;
    }
    public void retirar (int valorARetirar){
        if (valorARetirar <= 0)throw new IllegalArgumentException("no se puede numero negativo");

        else if (valorARetirar > saldo )throw new IllegalArgumentException("te falta dinero");
        this.saldo-=valorARetirar;
    }



    }
