package entidades;

public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    // constructores
    public Cafetera() {
        capacidadMaxima=300;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    // gets and sets
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;

    }

    public void servirTaza(int tamañoTaza) {

        if (tamañoTaza > capacidadActual) {
            System.out.println("No se a llenado la taza, su capacidad maxima es: " + capacidadActual);
        } else {
            System.out.println("Se ha llenado la taza");
        }
    }

    public void vaciarTaza() {
        capacidadActual = 0;
        System.out.println("Se ha vaciado la taza");

    }
    // el metodo agrega cafe a la cafetera
    public void agregarCafe(int cantidadCafe) {

        capacidadActual += cantidadCafe;
        System.out.println("La cafetera tiene la capacidad actual de :" + capacidadActual);

    }
}
