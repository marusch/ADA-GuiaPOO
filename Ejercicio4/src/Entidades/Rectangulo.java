package Entidades;

import java.util.Scanner;

public class Rectangulo {
    private int Base;
    private int Altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        Base = base;
        Altura = altura;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int base) {
        Base = base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public void crearRectangulo(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese base del rectangulo");
        this.setBase(scan.nextInt());
        System.out.println("Ingrese altura del rectangulo");
        this.setAltura(scan.nextInt());
    }
    public void area (){
        double area= this.Base* this.Altura;
        System.out.println("El area del rectangulo es "+ area);
    }


}
