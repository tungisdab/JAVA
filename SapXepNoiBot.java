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
public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int h=1;
        for (int i=0;i<n-1;i++){
            int k=0;
            for (int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    k=1;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(k==1){
                System.out.print("Buoc "+h+": ");
                h++;
                for(int j=0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
