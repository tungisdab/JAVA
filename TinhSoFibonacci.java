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
public class TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a[]=new long[94];
        a[0]=0;
        a[1]=1;
        for (int i=2;i<94;i++){
            a[i]=a[i-1]+a[i-2];
        }
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
