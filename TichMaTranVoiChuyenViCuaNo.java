/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
/**
 *
 * @author khanh
 */
public class TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int p=1;p<=t;p++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            int[][] b=new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            int[][] c=new int[n][n];
            System.out.println("Test "+p+":");
            for(int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    for (int l=0;l<m;l++){
                        c[i][j]+=a[i][l]*b[l][j];
                    }
                }
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
