/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
import java.math.*;
/**
 *
 * @author khanh
 */
public class TH1NhoNhatVaLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            BigInteger max=new BigInteger("0");
            BigInteger min=new BigInteger("0");
            for(int i=0;i<n;i++){
                BigInteger x=sc.nextBigInteger();
                if (i==0){
                    max=x;
                    min=x;
                }
                else{
                    if(max.compareTo(x)==-1){
                        max=x;
                    }
                    if(min.compareTo(x)==1){
                        min=x;
                    }
                }
            }
            if(max.equals(min)){
                System.out.println("BANG NHAU");
            }
            else{
                System.out.print(min+" "+max);
                System.out.println();
            }
        }
    }
}
