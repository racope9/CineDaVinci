/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

/**
 *
 * @author Racope
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private String Año;
    private String Director;
    private String actores;
    private int duración; //en minutos

    public Pelicula(String nombre, String genero, String Año, String Director, String actores, int duración) {
        this.nombre = nombre;
        this.genero = genero;
        this.Año = Año;
        this.Director = Director;
        this.actores = actores;
        this.duración = duración;
    }

    public String getNombre() {
        return nombre;
    }
}
