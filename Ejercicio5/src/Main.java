import entidades.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta= new Cuenta();
        cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.consultarSaldo();
        cuenta.ingresarDinero();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
    }
}