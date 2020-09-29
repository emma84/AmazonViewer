package esolutions.amazonViewer;

import esolutions.model.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu() {
        int salir = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("BIENVENIDOS A AMAZONVIEWER");
            System.out.println("==============================================");
            System.out.println("");
            System.out.println("Selecciona la opcion que deseada");
            System.out.println("");
            System.out.println("1- Movies");
            System.out.println("2- Series");
            System.out.println("3- Books");
            System.out.println("4- Magazines");
            System.out.println("5- Report");
            System.out.println("6- Report Today");
            System.out.println("0- Salir");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                    salir = 0;
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
            }
        } while (salir != 0);
        System.out.println("HASTA LUEGO");
    }

    public static void showMovies() {
        int salir = 1;
        ArrayList<Movie> movies = Movie.makeMoviesList();
        do {
            System.out.println("::: MOVIES :::");
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i + 1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
            }
            System.out.println("0. Regresar al menu");
            System.out.println("");
            //Respuesta usuario
            Scanner teclado = new Scanner(System.in);
            int respuesta = teclado.nextInt();

            if (respuesta == 0) {
                showMenu();
            }

            Movie movieSelected = movies.get(respuesta - 1);
            movieSelected.setViewed(true);
            Date dateI = movieSelected.startToSee(new Date());

            for (int i = 0; i < 100000; i++) {
                System.out.println("..................");
            }

            //Termine de verla
            movieSelected.stopToSee(dateI, new Date());
            System.out.println();
            System.out.println("Viste: " + movieSelected);
            System.out.println("Durante: " + movieSelected.getTimeViewed() + " milisegundos");


        } while (salir != 0);
        Main.showMenu();
    }

    public static void showSeries() {
        int salir = 0;
        do {
            System.out.println("::: SERIES :::");

        } while (salir != 0);
    }

    public static void showChapter() {
        int salir = 0;
        do {
            System.out.println("::: BOOKS :::");

        } while (salir != 0);
    }

    public static void showBooks() {
        int salir = 0;
        do {
            System.out.println("::: MAGAZINES :::");

        } while (salir != 0);
    }

    public static void showMagazines() {
        int salir = 0;
        do {
            System.out.println("::: MOVIES :::");

        } while (salir != 0);
    }

    public static void makeReport() {

    }

    public static void makeReport(Date date) {

    }
}
