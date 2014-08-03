/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo;

import java.io.*;

/**
 *
 * @author Temp
 */
public class ArchivoDeTexto {
    FileWriter fichero = null;
    PrintWriter pw = null;
        
    public ArchivoDeTexto(){
        lectura();
    }
    
    
    public void lectura(){
         try
        {
            fichero = new FileWriter("C:\\Users\\Temp\\Desktop\\Cuarto Semestre\\Algoritmos y estructura de datos\\Hoja de trabajo/archivo.txt");
            pw = new PrintWriter(fichero);
                        
            for (int i = 0; i < 2000; i++){
                int valorEntero = (int) Math.floor(Math.random()*(2000-10+1)+10);
                pw.println(valorEntero);
            }
                
                
//
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
  
        }
    }
       
}
