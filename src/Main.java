import Servicios.PeliculaServicio;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PeliculaServicio peliculaServicio = new PeliculaServicio();
        peliculaServicio.AgregarPelicula();
        peliculaServicio.MostrarPeliculas();
        System.out.println("Mostrando Peliculas de duracion Mayor a 1 hora");
        peliculaServicio.DuracionMayorA(1);
        System.out.println("Mostrando peliculas en orden ascendente de duracion\n");
        peliculaServicio.OrdenarAscendenteDuracion();
        System.out.println("Mostrando peliculas en orden descendente de duracion\n");
        peliculaServicio.OrdenarDescendenteDuracion();
        System.out.println("Mostrando peliculas en orden por titulo ascendente\n");
        peliculaServicio.OrdenarPorTitulo();
        System.out.println("Mostrando peliculas en orden por nombre de director ascendente\n");
        peliculaServicio.OrdenarPorDirector();
     /* peliculaServicio.EliminarPelicula("Chucky");
        peliculaServicio.MostrarPeliculas();*/
        }
    }