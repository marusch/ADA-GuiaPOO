import Entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Ingrese el titulo del libro");
        String titulo = scan.next();

        System.out.println("Ingrese el nombre del autor");
        String autor = scan.next();

        System.out.println("Ingrese el total de paginas");
        String nroPaginas = scan.next();

        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNroPaginas(nroPaginas);

        libro.mostrarLibro();
    }
}