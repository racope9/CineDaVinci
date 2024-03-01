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
    private int numbutacas;
    private int planta;
    private String horario;
    private Pelicula peli;
    private ArrayList<Pase> pases;

    public Sala(int numsala,int numbutacas, int planta) {
        this.numsala = numsala;
        this.numbutacas=numbutacas;
        this.planta = planta;
        this.horario = "HORARIO";
        this.pases = new ArrayList<Pase>();
    }

    public int getNumsala() {
        return numsala;
    }
    
    
    public void añadePeli(Pelicula peli){
        if(this.peli.getSala()!=null){
            System.out.println("Esta película ya ha sido asignada a otra sala");
        } else{
            this.peli=peli;
            this.peli.asignaSala(this);
        }
    }
    public void añadePase(Pase pase){      //Al añadir un pase se añadirá una hora a la película que se transmite en la propia sala
        if(pase.getNumbutacas() <this.numbutacas){
            System.out.println("La sala no es lo suficientemente grande");
        }
        this.pases.add(pase);
        this.horario = this.horario + "\n"+pase.getFecha();
    }
    
    public void vaciaSala(){
        this.peli=null;
        this.pases.clear();
        this.horario = "HORARIO";
    }
    
    public String verSala() throws SalaSinPasesException{
        if(this.pases!=null){
            return this.peli.toString();
        } else {
            throw new SalaSinPasesException("La sala no tiene pases");
        }
        
    }
    
    public void sacarEntrada(Pase pase, int num){
        if(this.pases.contains(pase)){
           pase.quitarButaca(num);
        } else {
            System.out.println("No hay ninguna película proyectada a esa hora");
        }
    }
    
}
 