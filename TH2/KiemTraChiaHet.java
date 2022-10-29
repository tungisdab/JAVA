/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.TH2;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author khanh
 */
public class KiemTraChiaHet {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("SONGUYEN.IN"));
        int t=Integer.parseInt(sc.next());
//        System.out.println(t);
        while(sc.hasNext()){
            BigInteger x=new BigInteger("7");
            BigInteger y=new BigInteger("13");
            BigInteger a=sc.nextBigInteger();
            String aa="0";
            String m=a.mod(x).toString();
            String n=a.mod(y).toString();
            if(m.equals(aa) && n.equals(aa)){
                System.out.println("Both");
            }
            else if(m.equals(aa)){
                System.out.println("Div 7");
            }
            else if(n.equals(aa)){
                System.out.println("Div 13");
            }
            else{
                System.out.println("None");
            }
        }
    }
}
