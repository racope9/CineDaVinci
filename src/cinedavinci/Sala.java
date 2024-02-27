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
class Sala {
    private int numsala;
    private int planta;
    private String horario;
    private Pelicula peli;
    private ArrayList<Pase> pases;

    public Sala(int numsala, int numbutacas, int planta) {
        this.numsala = numsala;
        this.planta = planta;
        this.horario = "HORARIO";
        this.pases = new ArrayList<Pase>();
    }
    
    public void añadePeli(Pelicula peli){
        this.peli=peli;
    }
    public void añadePase(Pase pase){      //Al añadir un pase se añadirá una hora a la película que se transmite en la propia sala
       this.pases.add(pase);              
       this.horario = this.horario + "\n"+pase.getFecha();
    }
    
    public void vaciaSala(){
        this.peli=null;
        this.pases.clear();
        this.horario = "HORARIO";
    }
    
    public void verSala(){
        System.out.println("\nSALA "+this.numsala + "\nPELÍCULA: " +this.peli.getNombre()
                            +"\n"+this.horario);
        
    }
    
    public void sacarEntrada(Pase pase, int num){
        if(this.pases.contains(pase)){
           pase.quitarButaca(num);
        } else {
            System.out.println("No hay ninguna película proyectada a esa hora");
        }
    }
    
}
 