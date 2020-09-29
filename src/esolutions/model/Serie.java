package esolutions.model;

import java.util.ArrayList;

public class Serie extends Film {

    private int id;
    private int sessionQuantity; //cantidad de temporadas
    private ArrayList<Chapter> chapters;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter>chapters) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
        this.chapters = chapters;
    }

    @Override
    public int getId() {
        return id;
    }


    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "\n Titulo: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Creador: " + getCreator() +
                "\n Duracion: " + getDuration() +
                "\n Cantidad de Temporadas: " + getSessionQuantity();
    }
}
