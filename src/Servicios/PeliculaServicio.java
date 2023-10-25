package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void AgregarPelicula()

    {
        String cont;
        do {
        System.out.println("Ingrese titulo de pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese director de pelicula");
        String director = leer.next();
        System.out.println("Ingrese duracion de pelicula");
        double duracion = leer.nextDouble();
        peliculas.add(new Pelicula(titulo, director, duracion));
        System.out.println("Desea ingresar otra pelicula");
        cont = leer.next();
            System.out.println(cont.toLowerCase());
            System.out.println(cont.equalsIgnoreCase("si"));
    }while (cont.equalsIgnoreCase("si"));
    }

    public void MostrarPeliculas()
    {
        for(Pelicula p:peliculas)
        { System.out.println(p);}
    }

    public void DuracionMayorA(double d)
    {
        for(Pelicula p:peliculas)
        { if (p.getDuracion()>d)
        { System.out.println(p);}}
    }
    public void DuracionMenorA(double d)
    {
        for(Pelicula p:peliculas)
        { if (p.getDuracion()<d)
        { System.out.println(p);}}
    }
    public void OrdenarAscendenteDuracion()
    {
        Collections.sort(peliculas, Comparadores.ordenarDuracionAscendente);
        for(Pelicula p:peliculas)
        {  System.out.println(p);}
    }
    public void OrdenarDescendenteDuracion()
    {
        Collections.sort(peliculas, Comparadores.ordenarDuracionDescendente);
        for(Pelicula p:peliculas)
        {  System.out.println(p);}
    }
    public void OrdenarPorDirector()
    {
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        for(Pelicula p:peliculas)
        {  System.out.println(p);}
    }
    public void OrdenarPorTitulo()
    {
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        for(Pelicula p:peliculas)
        {  System.out.println(p);}
    }


}
