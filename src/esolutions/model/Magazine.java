package esolutions.model;

import java.util.Date;

public class Magazine extends Publication {

    private int id;

    public Magazine(String title, Date editionDate, String editorial, String[] authors, int id) {
        super(title, editionDate, editorial, authors);
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n Titulo: " + getTitle() +
                "\n Fecha de edicion: " + getEditionDate() +
                "\n Editorial: " + getEditorial();
    }

}
