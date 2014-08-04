/*
 Universidad del Valle de Guatemala
 Gustavo Gordillo Giron				 	-Carne 13
 Mario Francisco Barrientos Alejos		-Carne 13039
 Jose Eduardo Cruz						-Carne 13
 Angel Morales Rodas					-Carne 13332
 Guatemala 03 de Agosto de 2014
 Descripción: Programa que realiza el Insertion Sort.
 */
package hoja.de.trabajo;
public class InsertionSort extends Ordenar{
    public int[] Sort(int data[], int n){
        // pre: 0 <= n <= data.length
        // post: values in data[0..n-1] are in ascending order
        int numSorted = 1; // number of values in place
        int index; // general index
        while (numSorted < n)	{
            // take the first unsorted value
            int temp = data[numSorted];
            // ...and insert it among the sorted:
            for (index = numSorted; index > 0; index--){
                if (temp < data[index-1]){
                    data[index] = data[index-1];
                } else {
                    break;
                }
            }
            // reinsert value
            data[index] = temp;
            numSorted++;
        }
        return data;
    }
}