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
public class KiemTraSoFibonacci {
    public static void main(String[] args) {
        long a[]=new long[93];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<93;i++){
            a[i]=a[i-1]+a[i-2];
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long n=sc.nextLong();
            for(int i=0;i<93;i++){
                if(a[i]==n){
                    System.out.println("YES");
                    break;
                }
                else if(a[i]>n){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
