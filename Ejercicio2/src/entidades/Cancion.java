package entidades;

import java.util.Scanner;
public class Cancion {

    private String titulo;
    private String autor;

    public Cancion(){
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void CrearCancion(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo de la cancion");
        titulo = input.nextLine();
        System.out.println("Ingrese su autor");
        autor = input.nextLine();
    }

    public void MostrarCancion(){
        System.out.println("El titulo de la cancion es: " + titulo);
        System.out.println("Su autor es: " + autor);
    }
}
