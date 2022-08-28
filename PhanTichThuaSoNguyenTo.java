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
public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(int z=1;z<=t;z++){
            long n=sc.nextLong();
            System.out.print("Test "+z+": ");
            if(n==1){
                System.out.println(1+"("+1+")");
            }
            else{
                for (int i=2;i<=Math.sqrt(n);i++){                   
                    int cnt=0;
                    while(n%i==0){
                        cnt++;
                        n/=i;
                    }
                    if(cnt>0){
                        System.out.print(i+"("+cnt+")");
                    }
                    if(n>1&& cnt>0){
                        System.out.print(" ");
                    }
                }
                if(n>1){
                        System.out.println(n+"("+1+")");
                }
                else{
                    System.out.println();
                }
            }
        }
    }
}