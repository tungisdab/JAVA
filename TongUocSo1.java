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
public class TongUocSo1 {
    public static long Tinh(int x){
        int s=0;
        while(x%2==0){
            s+=2;
            x/=2;
        }
        for(int i=3;i<=Math.sqrt(x);i+=2){
            while(x%i==0){
                s+=i;
                x/=i;
            }
        }
        if(x>1){
            s+=x;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x!=1){
                sum+=Tinh(x);
            }
        }
        System.out.println(sum);
    }
}
