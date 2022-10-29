/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.TH2;
import java.util.*;
import java.io.*;
/**
 *
 * @author khanh
 */
public class SapXepMaTran {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        int d=0;
        while(t-->0){
            int n=Integer.parseInt(sc.next());
            int m=Integer.parseInt(sc.next());
            int k=Integer.parseInt(sc.next());
            k--;
            int[][] a=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=Integer.parseInt(sc.next());
                }
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i][k]>a[j][k]){
                        int tmp=a[i][k];
                        a[i][k]=a[j][k];
                        a[j][k]=tmp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
