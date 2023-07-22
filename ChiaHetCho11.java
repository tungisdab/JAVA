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
public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=new BigInteger("11");
            String c=a.mod(b).toString();
            String d="0";
            if(c.equals(d)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
