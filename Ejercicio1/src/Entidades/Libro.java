package Entidades;

public class Libro {
    private String titulo;
    private String autor;
    private String nroPaginas;

    public Libro(){

    }

    public Libro(String titulo, String autor, String nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
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

    public String getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(String nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public void mostrarLibro() {
        System.out.println("El titulo del libro es : " + titulo);
        System.out.println("El autor es :" + autor);
        System.out.println("Contiene un total de paginas : " + nroPaginas);

    }
}