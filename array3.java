/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author acr
 */
public class array3 {
    public static void main(String[] args) {
        int matrika[][]= {{7,9,5},
                          {1,5,0},
                          {4,1,2}};
        int matrikb[][]= {{5,7,3},
                          {0,4,6},
                          {3,4,5}};
        System.out.println("Matrik A");
        for (int i=0;i<matrika.length;i++)
            {
                for (int j=0;j<matrika[i].length;j++)
            {
                System.out.print(matrika[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matrik B");
        for (int k=0;k<matrikb.length;k++)
        {
            for (int l=0;l<matrikb[k].length;l++)
            {
                System.out.print(matrikb[k][l]+" ");
            }
            System.out.println();
        }
        
        int matrikc [][] = new int [matrika.length][matrika[0].length];
        System.out.println();
        System.out.println("HASIL PENGURANGAN");
        System.out.println();
        for (int m= 0;m<matrikc.length; m++){
              for (int n=0;n<matrikc[0].length;n++){
                  matrikc[m][n] = matrika[m][n]- matrikb[m][n];
                  System.out.print(matrikc[m][n] + "\t");
              }
              System.out.println();
        }
        
        System.out.println();
        System.out.println("HASIL PENJUMLAHAN");
        System.out.println();
        for (int m= 0;m<matrikc.length; m++){
              for (int n=0;n<matrikc[0].length;n++){
                  matrikc[m][n] = matrika[m][n]+ matrikb[m][n];
                  System.out.print(matrikc[m][n] + "\t");
              }
              System.out.println();
        }
        System.out.println();
        System.out.println("HASIL PERKALIAN");
        System.out.println();
        for (int m= 0;m<matrikc.length; m++){
              for (int n=0;n<matrikc[0].length;n++){
                  matrikc[m][n] = matrika[m][n]* matrikb[m][n];
                  System.out.print(matrikc[m][n] + "\t");
              }
              System.out.println();
        }
    }
}