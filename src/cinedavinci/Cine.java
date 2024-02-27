/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

import java.util.ArrayList;

/**
 *
 * @author Racope
 */
public class Cine {
    private String Nombre;
    private String Ciudad;
    private String Año;
    private int NumPlantas;
    private ArrayList<Sala> salas;

    public Cine(String Nombre, String Ciudad, String Año, int NumPlantas) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Año = Año;
        this.NumPlantas = NumPlantas;
        this.salas = new ArrayList<Sala>();
        
    } 
    public void añadesala(Sala sala){
        this.salas.add(sala);
    }
}
