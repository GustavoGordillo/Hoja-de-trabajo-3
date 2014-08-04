package hoja.de.trabajo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {

    private static int low=0;
    private static int middle=1;
    private static int high=2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArchivoDeTexto nuevo = new ArchivoDeTexto();
        int[] lista = new int[2000];
        lista = nuevo.lectura(); 
              
        String menu = "1. Mostrar arreglo inicial\n2. Ordenar por BubbleSort\n3. Ordenar por InsertionSort\n4. Ordenar por MergeSort\n5. Ordenar por QuickSort\n6. Salir";
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        Random rnd = new Random();
        int originaldata[] = new int[2000], temp[] = new int[2000], bsortdata[] = new int[2000], isortdata[] = new int[2000], qsortdata[] = new int[2000], msortdata[] = new int[2000];
        for(int i=0;i<2000;i++){
            
            originaldata[i] = lista[i];
            bsortdata[i] = lista[i];
            isortdata[i] = lista[i];
            qsortdata[i] = lista[i];
            msortdata[i] = lista[i];
            
        }
        while (opc != 6){
            System.out.println(menu + "\nOpción: ");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.print("Arreglo inicial: " + Arrays.toString(originaldata));
                    break;
                case 2: //BubbleSort
                    BubbleSort orden = new BubbleSort();
                    System.out.print(Arrays.toString(orden.Sort(bsortdata,2000)) + "\n");
                    System.out.println("Se ha ordenado por medio del BubbleSort");
                    break;
                case 3:
                    InsertionSort orden1 = new InsertionSort();
                    System.out.print(Arrays.toString(orden1.Sort(isortdata,2000)) + "\n");
                    System.out.println("Se ha ordenado por medio del InsertionSort");
                    break;
                case 4:
                    MergeSort orden2 =new MergeSort();
                    System.out.print(Arrays.toString(orden2.Sort(msortdata,2000)) + "\n");
                    System.out.println("Se ha ordenado por medio del MergeSort");
                    break;
                case 5:
                    QuickSort orden3 =new QuickSort();
                    System.out.print(Arrays.toString(orden3.Sort(msortdata, 2000)) + "\n");
                    System.out.println("Se ha ordenado por medio del QuickSort");
                    break;
            }
        }	
        System.out.println("Ha salido del programa correctamente");
    }
    
}
