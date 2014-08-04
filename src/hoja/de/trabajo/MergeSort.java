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

public class MergeSort extends Ordenar {  
    public int[] Sort(int data[], int n)    {
    // pre: 0 <= n <= data.length
    // post: values in data[0..n-1] are in ascending order
    mergeSortRecursive(data,new int[n],0,n-1);
    return data;// ...or some values left (in correct place) in data array
    }
    private static void merge(int data[], int temp[], int low, int middle, int high){
    // pre: data[middle..high] are ascending
    // temp[low..middle-1] are ascending
    // post: data[low..high] contains all values in ascending order
        int ri = low; // result index
        int ti = low; // temp index
        int di = middle; // destination index
        // while two lists are not empty merge smaller value
        while (ti < middle && di <= high){
            if (data[di] < temp[ti]){ data[ri++] = data[di++]; }// smaller is in high data
            else {  data[ri++] = temp[ti++]; }// smaller is in temp
        }
        // possibly some values left in temp array
        while (ti < middle){
            data[ri++] = temp[ti++];
        }
        // ...or some values left (in correct place) in data array
    }    
    private static void mergeSortRecursive(int data[], int temp[], int low, int high){
    // pre: 0 <= low <= high < data.length
    // post: values in data[low..high] are in ascending order
        int n = high-low+1;
        int middle = low + n/2;
        int i;
        if (n < 2) return;
        // move lower half of data into temporary storage
        for (i = low; i < middle; i++) {     temp[i] = data[i];  }
        // sort lower half of array
        mergeSortRecursive(temp,data,low,middle-1);
        // sort upper half of array
        mergeSortRecursive(data,temp,middle,high);
        // merge halves together
        merge(data,temp,low,middle,high);
    }
}