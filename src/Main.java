import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UtenteBiblioteca utenteBiblioteca = UtenteBiblioteca.getInstance();

        Libro libro = new Libro("La scelta", "Nicholas Sparks");
        Libro libro2 = new Libro("Remember me", "Nicholas Sparks");
        Libro libro3 = new Libro("Last Song", "Nicholas Sparks");
        Libro libro4 = new Libro("After", "Nicholas Sparks");


        utenteBiblioteca.aggiungiLibro("Nome libro: " + libro.getNomeLibro() + "|| Nome autore: " + libro.getDescrizioneLibro());
        utenteBiblioteca.aggiungiLibro("Nome libro: " + libro2.getNomeLibro() + "|| Nome autore: " + libro2.getDescrizioneLibro());
        utenteBiblioteca.aggiungiLibro("Nome libro: " + libro3.getNomeLibro() + "|| Nome autore: " + libro3.getDescrizioneLibro());
        utenteBiblioteca.aggiungiLibro("Nome libro: " + libro4.getNomeLibro() + "|| Nome autore: " + libro4.getDescrizioneLibro());

        for (String nomeLibro : utenteBiblioteca.getListaLibri()) {
            System.out.println(nomeLibro);


        }
    }

}