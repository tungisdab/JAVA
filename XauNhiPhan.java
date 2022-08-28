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
public class XauNhiPhan {
    private static long[] a= new long[100];
    public static void fibo(){
        a[1]=1;
        a[2]=1;
        for(int i=3;i<93;i++){
            a[i]=a[i-1]+a[i-2];
        }
    }
    public static int check(int n, long k){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(k<=a[n-2]){
            return check(n-2,k);
        }
        return check(n-1,k-a[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            fibo();
            System.out.println(check(n,k));
        }
    }
}
