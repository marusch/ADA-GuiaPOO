import Entidad.Persona;

public class Main {
    public static void main(String[] args) {

        Persona person1 = new Persona();

        person1.crearPersona();
        person1.calcularImc();
        person1.esMayorDeEdad();

        System.out.println(person1.calcularImc());
        System.out.println("¿La persona es mayor de edad? (SI = TRUE  - NO = FALSE) -> "
                + person1.esMayorDeEdad());
    }
}