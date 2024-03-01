/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Racope
 */
public class Peliculas implements Serializable {
    private ArrayList<Pelicula> lista;
    
    public Peliculas(){
        this.lista = new ArrayList<Pelicula>();
    }
    
    public void agregaPeli(Pelicula peli){
        this.lista.add(peli);
    }
 
    public String toString(){
        String texto= "";
        for(Pelicula peli:this.lista){
            texto = texto + peli.toString();
        }
        return texto;
    }
}
