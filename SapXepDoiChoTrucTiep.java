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
public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=1;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int h=0;
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    h=1;
                }
            }
            if(h==1){
                System.out.print("Buoc "+k+": ");
                for (int j=0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                k++;
                System.out.println();
            }
        }
    }
}
