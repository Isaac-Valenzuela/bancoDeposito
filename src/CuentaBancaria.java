public class CuentaBancaria {
    public int numeroCuenta;
    public double saldo;
    public double monto;

    public CuentaBancaria(){}

    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo = getSaldo() + monto;
        setSaldo(saldo);
    }
    public void retirar(double monto){
        saldo = getSaldo() - monto;
        setSaldo(saldo);
    }
}

class CuentaCorriente extends CuentaBancaria{
    public double limiteDescubierto;
    public CuentaCorriente(int numeroCuenta, double limiteDescubierto){
        super(numeroCuenta);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double monto){
        if (monto > limiteDescubierto){
            System.out.println("--------------------------------");
            System.out.println("No se puede retirar esa cantidad");
            System.out.println("--------------------------------");
        }
        else{
            limiteDescubierto = getLimiteDescubierto() - monto;
            setLimiteDescubierto(limiteDescubierto);
            System.out.println("--------------------------------");
            System.out.println("Le queda " + limiteDescubierto + " disponible");
            System.out.println("--------------------------------");
        }
    }

}

class CuentaAhorros extends CuentaBancaria{
    public double tasaInteres;
    public CuentaAhorros(int numeroCuenta, double tasaInteres){
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }


    public void calcularInteres( double saldo){
        double saldoAct;
        double saldoplus;
        saldoAct =  saldo * getTasaInteres();
        saldoplus = getSaldo() + saldoAct;
        setSaldo(saldoplus);
        System.out.println("--------------------------------");
        System.out.println("Saldo actualizado: " + getSaldo());
        System.out.println("--------------------------------");
    }

}