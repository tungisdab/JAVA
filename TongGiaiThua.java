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
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=1;
        long a=1;
        if (n==1){
            System.out.println(sum);
        }
        else{
            for (int i=2;i<=n;i++){
                a*=i;
                sum+=a;
            }   
        }
        System.out.println(sum);
    }
}
