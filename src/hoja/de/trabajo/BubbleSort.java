/*
 Universidad del Valle de Guatemala
 Gustavo Gordillo Giron				 	-Carne 13
 Mario Francisco Barrientos Alejos		-Carne 13039
 Jose Eduardo Cruz						-Carne 13
 Angel Morales Rodas					-Carne 13332
 Guatemala 03 de Agosto de 2014
 Descripción: Programa que realiza el Bubble Sort.
 */

package hoja.de.trabajo;

public class BubbleSort extends Ordenar{
 
    public int[] Sort(int data[], int n){
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] in ascending order
        int numSorted = 0; // number of values in order
        int index; // general index
        while (numSorted < n){   // bubble a large element to higher array index
            for (index = 1; index < n-numSorted; index++){
                if (data[index-1] > data[index])
                    swap(data,index-1,index);
            }        // at least one more value in place
        numSorted++;
        }
        return data;
    }
    public static void swap(int data[], int i, int j){
        // pre: 0 <= i,j < data.length
        // post: data[i] and data[j] are exchanged
        int temp;    
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}