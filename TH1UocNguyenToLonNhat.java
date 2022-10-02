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
public class TH1UocNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            long n=sc.nextLong();
            long cc=0;
            while(n%2==0){
                cc=2;
                n/=2;
            }
            for(long i=3;i<=Math.sqrt(n);i+=2){
                while(n%i==0){
                    cc=i;
                    n/=i;
                }
            }
            if(n>1){
                cc=n;
            }
            System.out.println(cc);
        }
    }
}
