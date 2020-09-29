package esolutions.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable {

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear((short) year);
    }

    @Override
    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public void showData() {

    }

    @Override
    public String toString() {
        return "\n Titulo: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Creador: " + getCreator() +
                "\n Duracion: " + getDuration() +
                "\n Año: " + getYear();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getTime() > dateI.getTime()) {
            setTimeViewed((int) (dateF.getTime() - dateI.getTime()));
        } else {
            setTimeViewed(0);
        }
    }

    public static ArrayList<Movie> makeMoviesList(){
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 1; i <= 6 ; i++) {
            movies.add(new Movie("Movie " + i,"Genero " + i,"Creador " + i,120 + i, 2017 + i ));
        }
        return movies;
    }
}
