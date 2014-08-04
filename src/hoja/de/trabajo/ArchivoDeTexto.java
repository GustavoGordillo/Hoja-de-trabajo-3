    
package hoja.de.trabajo;

import java.io.*;


public class ArchivoDeTexto {
    private FileWriter fichero = null;
    private PrintWriter pw = null;
    private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    
    private int[] numero;
        
    public ArchivoDeTexto(){
        escritura();
        numero = new int[2001];
    
    }
    
    //ESTE METODO GENERA LA LISTA DE 2000 NUMEROS ENTEROS ALEATORIOS
    public void escritura(){
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
    
    //ESTE METODO IMPRIME LA LISTA DE 2000 NUMEROS ENTEROS ALEATORIOS Y RETORNA UNA LISTA CON LOS 2000 NUMEROS ENTEROS
    public int[] lectura(){ 
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\Temp\\Desktop\\Cuarto Semestre\\Algoritmos y estructura de datos\\Hoja de trabajo/archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         int i= 0;
         while((linea=br.readLine())!=null){
             numero[i]=Integer.parseInt(linea);
             i++;
         }
         return numero;
            
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
       }
         return numero;
       
    }
   
}
