public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private String tipoCuenta;
    private double saldo;

    // Constructor vacío
    public CuentaBancaria() {
        this.saldo = 0;
    }

    // Constructor con parámetros
    public CuentaBancaria(String numeroCuenta, String nombreTitular, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    // Métodos setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // Operaciones
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso: $" + cantidad);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para retiro.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes para retirar $" + cantidad);
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso: $" + cantidad);
        }
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
