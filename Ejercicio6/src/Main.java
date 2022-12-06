import entidades.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la cantidad de cafe al cafetero");
        cafetera.agregarCafe(scan.nextInt());
        cafetera.llenarCafetera();

        System.out.println("Ingrese tamaño de taza");
        cafetera.servirTaza(scan.nextInt());
        cafetera.vaciarTaza();
    }
}