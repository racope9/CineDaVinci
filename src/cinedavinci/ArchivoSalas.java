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

/**
 *
 * @author Racope
 */
public class ArchivoSalas {
    
    private String archivo;
    
    public ArchivoSalas(String archivo){
        this.archivo = archivo;
    }
    
    public void crearArchivoSala(Salas lista){
        File fich = new File(this.archivo);
        
        try {
            FileOutputStream fos = new FileOutputStream(fich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            
            System.out.println("Se ha creado el archivo");
            
            fos.close();
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error entrada/salida: " + ex.getMessage());
        }
    }
    
    public void visualizarArchivoSala() {
    File fich = new File(this.archivo);
    
    try {
        FileInputStream fis = new FileInputStream(fich);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println(this.archivo + ":");
        
        while (true) {
            try {
                Salas aux = (Salas) ois.readObject();
                System.out.println(aux.toString());
            } catch (EOFException eof) {
                break; // Se alcanzó el final del archivo
            }
        }
        
        fis.close();
        ois.close();
    } catch (FileNotFoundException e1) {
        System.out.println("El archivo no existe");
    } catch (IOException e2) {
        System.out.println("Error entrada/salida: " + e2.getMessage());
    } catch (ClassNotFoundException ex) {
        System.out.println("La clase Cine aún no existe");
    }
}

}
