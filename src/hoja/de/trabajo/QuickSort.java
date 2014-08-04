package hoja.de.trabajo;
/*
 Universidad del Valle de Guatemala
 Gustavo Gordillo Giron				 	-Carne 13
 Mario Francisco Barrientos Alejos		-Carne 13039
 Jose Eduardo Cruz						-Carne 13
 Angel Morales Rodas					-Carne 13332
 Guatemala 03 de Agosto de 2014
 Descripción: Programa que realiza el Quick Sort.
 */
public class QuickSort extends Ordenar{
    public int[] Sort(int data[], int n){
        // post: the values in data[0..n-1] are in ascending order
        quickSortRecursive(data,0,n-1);
        return data;
    }

    private static void quickSortRecursive(int data[],int left,int right){
        // pre: left <= right
        // post: data[left..right] in ascending order
        int pivot; // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
        /* done! */
    }


    private static int partition(int data[], int left, int right){
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
        while (true){
            // move right "pointer" toward left
            while (left < right && data[left] < data[right]) right--;
            if (left < right) swap(data,left++,right);
            else return left;
            // move left pointer toward right
            while (left < right && data[left] < data[right]) left++;
            if (left < right) swap(data,left,right--);
            else return right;
        }
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