/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinedavinci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Racope
 */
public class ArchivoSalas {
    
    private String archivo;
    
    public ArchivoSalas(String archivo){
        this.archivo = archivo;
    }
    
    public void crearArchivoCine(Sala Sala){
        File fich = new File(this.archivo);
        
        try {
            FileOutputStream fos = new FileOutputStream(fich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Sala);
            
            System.out.println("Se ha creado el archivo");
            
            fos.close();
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error entrada/salida: " + ex.getMessage());
        }
    }
    
    public void visualizarArchivoCine(){
        File fich = new File(this.archivo);
        try{
        FileInputStream fis = new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println(this.archivo+":");
        Sala aux = (Sala) ois.readObject();
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
