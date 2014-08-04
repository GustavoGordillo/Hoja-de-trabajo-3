/*
 Universidad del Valle de Guatemala
 Gustavo Gordillo Giron				 	-Carne 13254
 Mario Francisco Barrientos Alejos                      -Carne 13039
 Jose Eduardo Cruz					-Carne 13258
 Angel Morales Rodas					-Carne 13332
 Guatemala 03 de Agosto de 2014
 Descripción: Programa que realiza el Bubble Sort. Este programa se basa al codigo presente
 en el libro de Java Structures de Duane A. Bailey
 */

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
