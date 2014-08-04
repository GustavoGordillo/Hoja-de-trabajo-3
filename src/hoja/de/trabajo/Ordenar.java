package hoja.de.trabajo;

import java.util.Arrays;

public class Ordenar {
    
    public int data[];
    public int temp[];
    public int low=0;
    public int middle=1;
    public int high=2;
   
    
    public int[] getLista(){
		return data;    
    }
    
    public void setLista(int[] data){
		this.data=data;
    }
    
    public String toString(){
		return "Los valores son "+Arrays.toString(data);
    }
}
