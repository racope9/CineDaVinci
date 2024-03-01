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
    private Sala salaasignada;

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
    public Sala getSala(){
        return salaasignada;
    }
    public void asignaSala(Sala sala){
        this.salaasignada = sala;
    }

    @Override
    public String toString() {
        return  "Sala "+this.salaasignada.getNumsala() 
                +"\n"+"Película: "+this.nombre 
                +"\nGénero: "+this.genero
                +"\n Año: "+this.Año
                +"\nDirigida por "+this.Director
                +"\nInterpretada por "+this.actores
                +"\nDuración: "+this.duración+"min";
    }
    
    
    
}
