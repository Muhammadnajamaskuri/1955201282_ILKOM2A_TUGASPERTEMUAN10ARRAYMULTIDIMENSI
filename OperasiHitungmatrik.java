/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymultidimensi;

/**
 *
 * @author HP
 */
public class OperasiHitungmatrik {

    
    public static void main(String[] args) {
       int matrikA[][]={{7,9,5},
                        {1,5,0},
                        {4,1,2}};
        int matrikB[][]={{5,7,3},
                        {0,4,6},
                        {3,4,5}};
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("penjumlahan dan pengurangan Matrik A dengan Matrik B");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Matrik A");
        for (int[] matrikA1 : matrikA) {
            for (int j = 0; j < matrikA1.length; j++) {
                System.out.print(matrikA1[j] + " ");
            }
            System.out.println();
        } 
        System.out.println("");
        System.out.println("Matrik B");
        for (int[] matrikB1 : matrikB) {
            for (int l = 0; l < matrikB[0].length; l++) {
                System.out.print(matrikB1[l] + " ");
            }
            System.out.println();
        }
              int matrikC[][]= new int [matrikA.length][matrikA[0].length];
              System.out.println();
              System.out.println("---------------------------------------------------------------------------");
              System.out.println("Hasil pengurangan");
              System.out.println("---------------------------------------------------------------------------");
              System.out.println();
                for (int m= 0; m < matrikC.length ; m++){
                     for (int n= 0; n < matrikC[0].length ; n++){
                         matrikC[m][n]=matrikA[m][n]-matrikB[m][n];
                         System.out.print(matrikC[m][n]+ "\t");
                     }
                    System.out.println();
                }
                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Hasil Penjumlahan");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println();
                for (int m=0;m<matrikC.length;m++){
                    for (int n=0;n<matrikC[0].length;n++){
                        matrikC[m][n]=matrikA[m][n]+matrikB[m][n];
                        System.out.print(matrikC[m][n]+"\t");
                    }
                    System.out.println();
                }                
          int [][]matrikD= 
              {{3,2},
              {4,5}};
          int[][] matrikE=
              {{5,4},
              {6,8}};
          System.out.println("---------------------------------------------------------------------------");
          System.out.println("Perkalian matrik D dengan Matrik E");
          System.out.println("---------------------------------------------------------------------------");
           System.out.println("Matrik D");
        for (int[] matrikD1 : matrikD) {
            for (int y = 0; y < matrikD1.length; y++) {
                System.out.print(matrikD1[y] + " ");
            }
            System.out.println();
        } 
            System.out.println("Matrik E");
        for (int[] matrikE1 : matrikE) {
            for (int f = 0; f < matrikE1.length; f++) {
                System.out.print(matrikE1[f] + " ");
            }
            System.out.println();
        }   

                System.out.println();
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Hasil Perkalian");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println();
                 int matrix3[][] = new int[2][2];

        for (int v = 0; v < matrikD.length; v++){
            for (int d = 0; d < matrikD[0].length; d++){
                int total = 0; 
                for (int w = 0; w < matrikD.length; w++){
                    total = total +  (matrikD[v][w] * matrikE[w][d]);
                }
                matrix3[v][d] = total;
            }       
        }

        for (int v = 0; v < matrix3.length; v++){
            for (int d = 0; d < matrix3[0].length; d++){
                System.out.print( matrix3[v][d] + " ");
            }       
            System.out.println();
        }
    }
}
                
   
       
        
    
   
