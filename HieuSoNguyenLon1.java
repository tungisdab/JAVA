/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;
import java.math.*;
/**
 *
 * @author khanh
 */
public class HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            String aa=a.toString();
            int la=aa.length();
            BigInteger b=sc.nextBigInteger();
            String bb=b.toString();
            int lb=bb.length();
            BigInteger c=a.subtract(b).abs();
            String cc=c.toString();
            int lc=cc.length();
            int ll=Math.max(la, lb);
            if(ll>lc){
                for(int i=0;i<ll-lc;i++){
                    System.out.print("0");
                }
            }
            System.out.println(c);
        }
    }
}
