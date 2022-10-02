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
public class BoBaSoPytago {
    public static long[] a=new long[10000]; 
    public static int check(int l, int r, long value){
        while(l<=r){
            int m=(l+r)/2;
            if (a[m]==value){
                return 1;
            }
            else if(a[m]<value){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                long x=sc.nextLong();
                a[i]=x*x;
            }
            int cc=0;
            Arrays.sort(a,0,n);
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    cc=check(j+1,n-1,a[i]+a[j]);
                    if (cc==1)
                        break;    
                }
                if(cc==1){
                    break;
                }
            }
            System.out.println(cc==1 ? "YES":"NO");
        }
    }
}
