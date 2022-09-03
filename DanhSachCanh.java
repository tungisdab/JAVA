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
public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] a=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x==1){
                    a[i][j]=true;
                }
                else{
                    a[i][j]=false;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i][j]==true){
                    System.out.println("("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }
}
