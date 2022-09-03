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
public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] a=new boolean[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x==1){
                    a[i][j]=true;
                }
                else{
                    a[i][j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("List"+"("+(i+1)+") = ");
            for(int j=0;j<n;j++){
                if(a[i][j]==true){
                    System.out.print(j+1+" ");
                }
            }
            System.out.println();
        }
    }
}
