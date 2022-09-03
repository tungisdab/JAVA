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
public class BoiSoNhoNhatCuaNsoNguyenDuongDauTien {
    public static long gcd(long a, long b){
        long tmp;
        while(b!=0){
            tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            long n=sc.nextLong();
            long temp=1;
            for (int i=1;i<=n;i++){
                temp=lcm(temp,i);
            }
            System.out.println(temp);
        }
    }
}
