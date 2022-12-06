package entidades;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    //Constructor con parametros
    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //Constructor vacío, pero inicializando saldo actual con un valor inicial
    public Cuenta() {
        saldoActual = 5000;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //Metodo para crear cuenta
    public void crearCuenta() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese numero de cuenta");
        this.setNumeroCuenta(scan.nextInt());
        System.out.println("Ingrese su DNI");
        this.setDni(scan.nextLong());
    }

    //Metodo para ingresar dinero
    public void ingresarDinero() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese dinero a la cuenta:");
        saldoActual += scan.nextDouble();
    }

    //Metodo para retirar dinero
        public void retirarDinero() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese la cantidad de dinero a retirar:");
        double retiro = scan.nextDouble();
        if (retiro > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
    }

    //Metodo para extraccion rapida con la condicion de que sea solo menos del 20%
        public void extraccionRapida() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese dinero a retirar ");
        double extraer = scan.nextDouble();
        while (extraer > saldoActual * 0.2) {
            System.out.printf("ERROR saque menos del 20 %% que es %.2f \n", saldoActual * 0.2);
            extraer = scan.nextDouble();
        }
        saldoActual -= extraer;
    }

    //Metodo para consultar el saldo
        public void consultarSaldo() {
        System.out.printf("El saldo actual es %.2f \n", saldoActual);
    }

    //Metodo para consultar datos
        public void consultarDatos() {
        System.out.printf("El numero de cuenta es %d \n", numeroCuenta);
        System.out.printf("El DNI es %d \n", dni);

    }

}
