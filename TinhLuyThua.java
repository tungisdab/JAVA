/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.Scanner;
/**
 *
 * @author khanh
 */
public class TinhLuyThua {
    private static long M=1000000007;
    public static long power(long a, long b){
//        if(b==1){
//            return a%M;
//        }
//        long res=power(a,b/2);
//        res=(res*res)%M;
//        if(b%2==1){
//            return res*a%M;
//        }
//        return res;
        long res=1;
        while(b>=1){
            if(b%2==1){
                res*=a;
                res%=M;
            }
            b/=2;
            a=(a*a)%M;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong()%M;
            long b=sc.nextLong();
            if(a==0 && b==0){
                break;
            }
            System.out.println(power(a,b));
        }
    }
}
