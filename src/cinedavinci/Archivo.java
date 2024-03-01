/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Racope
 */
public class Archivo { 
    private String archivo;
    
    public Archivo(String arhivo){
        this.archivo = archivo;
    }
    
    public void crearArchivoCine(Cine cine){
        File fich = new File(this.archivo);
        
        try {
            FileOutputStream fos = new FileOutputStream(fich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cine);
            
            System.out.println("Se ha creado el archivo");
            
            fos.close();
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error entrada/salida");
        }
    }
    
    public void crearArchivoPeli(Peliculas lista){
        File fich = new File(this.archivo);
        
        try {
            FileOutputStream fos = new FileOutputStream(fich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            
            System.out.println("Se ha creado el archivo");
            
            fos.close();
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error entrada/salida");
        }
    }
    
    public void visualizarArchivoPelis(){
        File fich = new File(this.archivo);
        boolean end = false;
        try{
        FileInputStream fis = new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println(this.archivo+":\n");
        while(end==false){
            try{
                Pelicula aux = (Pelicula) ois.readObject();
                System.out.println(aux.toString());
            } catch(EOFException eofe){
                end = true;
            }
        }
        fis.close();
        ois.close();
        }
        catch(FileNotFoundException e1){
            System.out.println("El archivo no existe");
        }
        catch(IOException e2){
            System.out.println("Error entrada/salida");
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase Cine aún no existe");
        }
        
        
       
    }
    
     
    
    public void visualizarArchivoCine(){
        File fich = new File(this.archivo);
        try{
        FileInputStream fis = new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println(this.archivo+":");
        Cine aux = (Cine) ois.readObject();
        System.out.println(aux.toString());
        
        fis.close();
        ois.close();
        }
        catch(FileNotFoundException e1){
            System.out.println("El archivo no existe");
        }
        catch(IOException e2){
            System.out.println("Error entrada/salida");
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase Cine aún no existe");
        }
        
        
       
    }
        
        

}
