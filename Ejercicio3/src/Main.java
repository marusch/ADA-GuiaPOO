import Entidades.Operacion;

public class Main {
    public static void main(String[] args) {

        Operacion operacion = new Operacion();

        operacion.crearOperacion();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicar();
        operacion.dividir();
    }
}