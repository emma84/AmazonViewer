package esolutions.model;

public class Chapter extends Movie {

    private int id;
    private int sessionNumber; //numero de temporada a la cual pertenece el capitulo


    public Chapter(String title, String genre, String creator, int duration, int year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public String toString() {
        return "\n Titulo: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Creador: " + getCreator() +
                "\n Duracion: " + getDuration() +
                "\n Año: " + getYear() +
                "\n Numero de temporada: " + getSessionNumber();
    }
}
