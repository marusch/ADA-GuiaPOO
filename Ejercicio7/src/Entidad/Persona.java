package Entidad;
import java.util.Scanner;
public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double altura;
    private double peso;
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void crearPersona() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        nombre = scan.next();
        System.out.println("Ingrese su edad");
        edad = scan.nextInt();
        System.out.println("ingrese su sexo");
        do {
            sexo = scan.next().charAt(0);
            if (!(sexo == 'm' || sexo == 'f' || sexo == 'o')) {
                System.out.println("ingrese un caracter valido como ser m, f, o");
            }
        } while (!(sexo == 'm' || sexo == 'f' || sexo == 'o'));
        System.out.println("ingrese su altura");
        altura = scan.nextDouble();
        System.out.println("ingrese su peso");
        peso = scan.nextDouble();

    }

    public String calcularImc() {
        double calculoImc = peso / (Math.pow(altura, 2));
        if (calculoImc < 20) {
            return  "¡ADVERTENCIA! La persona está por debajo de su peso ideal";
        } else if (calculoImc >= 20 && calculoImc <= 25) {
            return "¡FELICITACIONES! La persona está en su peso ideal";
        } else {
            return "¡ADVERTENCIA! La persona tiene sobrepeso";
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }
}