/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

/**
 *
 * @author Racope
 */
public class Pase {
    private String fecha;
    private int numbutacas;

    public Pase(String fecha, int numbutacas) {
        this.fecha = fecha;
        this.numbutacas = numbutacas;
    }

    public String getFecha() {
        return fecha;
    }
    public int getNumbutacas() {
        return numbutacas;
    }
    
    public void quitarButaca(int num){
        if(this.numbutacas > num){
            this.numbutacas--;
            System.out.println("Sus entradas han sido tramitadas");
        } 
        else{
            System.out.println("No hay asientos suficientes para este pase");
        }
    }
   
}
