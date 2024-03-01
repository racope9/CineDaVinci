package cinedavinci;

import cinedavinci.Peliculas;
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

public class ArchivoPelis {

    private String archivo;

    public ArchivoPelis(String archivo) {
        this.archivo = archivo;
    }

    public void crearArchivoPeli(Peliculas lista) {
        File fich = new File(this.archivo);
        try {
            FileOutputStream fos = new FileOutputStream(fich);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);

            System.out.println("Se ha creado el archivo");

            //cerramos los flujos de datos
            oos.close();
            fos.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Error al crear el archivo, fichero no encontrado.");
        } catch (IOException e2) {
            System.out.println("Error de entrada/salida: " + e2.getMessage());
            e2.printStackTrace();
        }
    }

    public void visualizarArchivoPelis(){
        File fich = new File(this.archivo);
        try {
            FileInputStream fis = new FileInputStream(fich);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Peliculas peliculas = (Peliculas) ois.readObject();
            System.out.println("Peliculas:");
            System.out.println(peliculas.toString());

            fis.close();
            ois.close();
        } catch (FileNotFoundException e1) {
            System.out.println("El archivo no existe");
        } catch (IOException e2) {
            System.out.println("Error entrada/salida");
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase Peliculas aún no existe");
        }

    }
}