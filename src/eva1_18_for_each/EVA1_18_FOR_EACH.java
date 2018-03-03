/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_for_each;

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_18_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] aiDatos = new int[10];
        //Arreglo con 10 elementos, llenarlo con valores
        //foreach solo usar cuando queremos saber los datos solamente 
        int aiDatos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int iVal : aiDatos) {
            System.out.println("Valor = " + iVal);
        }
        String asCadenas[] = {"RUBEN", "ALONSO", "HERNANDEZ", "CHAVEZ", "!!!!!"};
        for (String aCade : asCadenas) {
            System.out.println("Cadena = " + aCade);
        }
        //Arrgelo de enteros de dos dimensiones 
        int aiMatriz[][] = new int[3][3];
        aiMatriz[0][0]=10;
        aiMatriz[0][1]=20;
        aiMatriz[0][2]=30;
        aiMatriz[1][0]=40;
        aiMatriz[1][1]=50;
        aiMatriz[1][2]=60;
        aiMatriz[2][0]=70;
        aiMatriz[2][1]=80;
        aiMatriz[2][2]=90;
        for (int[] is : aiMatriz) {//lee solo la primera matriz 
            for (int i : is) {//lee la segunda matriz, 
                System.out.println("Valor = " + i);
            }
        }
        int aiTres[][][] = new int[2][2][2];
         aiTres[0][0][0]=1;
         aiTres[0][0][1]=2;
         aiTres[0][1][0]=3;
         aiTres[0][1][1]=4;
         aiTres[1][0][0]=5;
         aiTres[1][0][1]=6;
         aiTres[1][1][0]=7;
         aiTres[1][1][1]=8;
        for (int[][] aiTre : aiTres) {
            for (int[] is : aiTre) {
                for (int i : is) {
                    System.out.println("Valor = " + i);
                }
            }            
        }
    }
}
