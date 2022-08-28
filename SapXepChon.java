/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;
/**
 *
 * @author khanh
 */
public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=1;
        for(int i=0;i<n-1;i++){
            int m=i;
            int cc=0;
            for (int j=i+1;j<n;j++){
                if(a[j]<a[m]){
                    m=j;
                    cc=1;
                }
            }
            if(cc==1){
                int temp=a[m];
                a[m]=a[i];
                a[i]=temp;
            }
            System.out.print("Buoc "+b+": ");
            for (int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            b++;
            System.out.println();
        }
    }
}
