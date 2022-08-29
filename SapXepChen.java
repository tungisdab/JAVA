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
public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Buoc 0: "+a[0]);
        for (int i=1;i<n;i++){
            int h=a[i];
            int j=i-1;
            while(j>=0&&h<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=h;
            System.out.print("Buoc "+i+": ");
            for(int k=0;k<=i;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
                
    }
}
