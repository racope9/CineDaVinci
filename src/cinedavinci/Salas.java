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
public class Salas implements Serializable{
    private ArrayList<Sala> lista;
    
    public Salas(){
        this.lista = new ArrayList<Sala>();
    }
    
    public void agregaSala(Sala sala){
        this.lista.add(sala);
    }
 
    public String toString(){
        String texto= "";
        for(Sala sala:this.lista){
            texto = texto + sala.toString();
        }
        return texto;
    }
}

