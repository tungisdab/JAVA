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
public class MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int[] b=new int[n*n];
        for(int i=0;i<n*n;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        int k=0;
        for(int i=0;i<=(n/2);i++){
            for(int j=i;j<n-i-1;j++){
                a[i][j]=b[k++];
            }
            for(int j=i;j<n-i-1;j++){
                a[j][n-i-1]=b[k++];
            }
            for(int j=i;j<n-i-1;j++){
                a[n-1-i][n-1-j]=b[k++];
            }
            for(int j=i;j<n-i-1;j++){
                a[n-1-j][i]=b[k++];
            }
        }
        if(n%2==1){
            a[n/2][n/2]=b[n*n-1];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
