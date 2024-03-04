/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

/**
 *
 * @author Racope
 */

//Sala adaptada para personas con discapacidad móvil
public class SalaAdaptada extends Sala {

    public SalaAdaptada(int numsala, int numbutacas, int planta) {
        super(numsala, numbutacas, planta);
    }
    
    
    public void sacarEntrada(Pase pase, int num){
        if(this.pases.contains(pase)){
           pase.quitarButaca(num);
        } else {
            System.out.println("No hay ninguna película proyectada a esa hora");
        }
    }
}
