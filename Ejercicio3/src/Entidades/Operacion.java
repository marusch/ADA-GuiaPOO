package Entidades;
import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        this.setNumero1(scan.nextInt());
        System.out.println("Ingrese el segundo numero");
        this.setNumero2(scan.nextInt());

    }

    public int sumar() {

        int suma;
        suma = this.numero1 + this.numero2;
        System.out.println("El resultado de la suma es " + suma);
        return suma;
    }

    public int restar() {

        int resta;
        resta = this.numero1 - this.numero2;
        System.out.println("El resultado de la resta es " + resta);
        return resta;
    }

    public int multiplicar() {

        int mult;
        if (this.numero2 == 0 && this.numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por 0");
            return 0;
        } else {
            mult = this.numero1 * this.numero2;
            System.out.println("El resultado de la multiplicacion es " + mult);
            return mult;
        }

    }

    public int dividir() {

        int div;
        if (this.numero2 == 0 && this.numero2 == 0) {
            System.out.println("Error: no se puede dividir por 0");
            return 0;
        } else {
            div = this.numero1 / this.numero2;
            System.out.println("El resultado de la division es " + div);
            return div;
        }

    }
}
