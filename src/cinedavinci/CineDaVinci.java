/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinedavinci;

import java.util.Scanner;

/**
 *
 * @author Racope
 */
public class CineDaVinci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SalaSinPasesException {
        
        Cine DaVinci = new Cine("Da Vinci", "Albacete", "2024", 3);
        Sala sala1 = new Sala(1,40, 1);
        Sala sala2 = new Sala(2,40, 1);
        Sala sala3 = new Sala(3,40, 1);
        Sala sala4 = new Sala(4,40, 1);
        Sala sala5 = new Sala(5,40, 1);
        DaVinci.añadesala(sala1);
        DaVinci.añadesala(sala2);
        DaVinci.añadesala(sala3);
        DaVinci.añadesala(sala4);
        DaVinci.añadesala(sala5);
        
        Pelicula BulletTrain = new Pelicula("Bullet Train", "Acción", "2022", "Maquenrou", "Bad Bunny", 90);
        Pelicula LVPM = new Pelicula("La Venganza de la Pera mecánica", "Drama", "2016", "Alfred Hitchcock", "Williem Dafoe", 102);
        Pelicula viento = new Pelicula("Lo que el viento se llevó","Romance","1939","Pedro","Dwayne Johnson",69);
        Pelicula Pepinillo = new Pelicula("Como Entrenar a tu Pepinillo","Comedia", "2016", "Justin Royland", "Pickle Rick", 101);
        Pelicula JJK = new Pelicula("La Guerra de los Hechiceros", "Acción", "2023", "Satán(Gege)", "Go/jo", 90);  
        
        sala1.añadePeli(viento);
        sala2.añadePeli(JJK);
        sala3.añadePeli(BulletTrain);
        sala4.añadePeli(Pepinillo);
        sala5.añadePeli(LVPM);
        
        Peliculas listaPelis = new Peliculas();
        listaPelis.agregaPeli(JJK);
        listaPelis.agregaPeli(LVPM);
        listaPelis.agregaPeli(BulletTrain);
        listaPelis.agregaPeli(Pepinillo);
        listaPelis.agregaPeli(viento);
        
        
        
        Pase pase1 = new Pase("16:00", 40);
        
        sala1.añadePase(pase1);
        sala2.añadePase(pase1);
        sala3.añadePase(pase1);
        sala4.añadePase(pase1);
        sala5.añadePase(pase1);
        
        sala1.toString();
        
        Archivo CineDaVinci = new Archivo("/Archivos_Java/Archivo_Cine.dat");
        ArchivoPelis listadePelisAr = new ArchivoPelis("/Archivos_Java/Archivo_Lista.txt");
        
        CineDaVinci.crearArchivoCine(DaVinci);
        CineDaVinci.visualizarArchivoCine();
        
        listadePelisAr.crearArchivoPeli(listaPelis);
        listadePelisAr.visualizarArchivoPelis();
       
        
    }
    
}
