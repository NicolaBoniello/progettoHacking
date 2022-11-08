import java.util.ArrayList;

/**
 * Classe Singleton
 */
public class UtenteBiblioteca {

    /**
     * 1) per creare una singleton class bisogna come prima cosa creare un istanza privata statica
     * 2) come seconda cosa bisogna creare un costruttore vuoto privato
     * 3) creare un metodo public static come nome utilizzare il nome della classe e il nome del metodo (getIstance)
     */
    private static UtenteBiblioteca utenteBiblioteca = new UtenteBiblioteca();

    private UtenteBiblioteca() {
    }

    ;

    public static UtenteBiblioteca getInstance() {
        return utenteBiblioteca;
    }

    /**
     * creazione della lista private di tipo stringa
     */
    private ArrayList<String> listaLibri = new ArrayList<>();

    /**
     * creazione metodo per aggiungere elementi alla lista.
     *
     * @param libro
     */
    public void aggiungiLibro(String libro) {
        listaLibri.add(libro);
    }


    public ArrayList<String> getListaLibri() {
        return listaLibri;
    }

    public void setListaLibri(ArrayList<String> listaLibri) {
        this.listaLibri = listaLibri;
    }

}
