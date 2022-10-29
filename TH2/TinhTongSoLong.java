/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.TH2;
import java.util.*;
import java.io.*;
/**
 *
 * @author khanh
 */
public class TinhTongSoLong {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("DATA.in"));
        long sum=0;
        long t=0;
        while(sc.hasNext()){
            String d=sc.next();
            try{
                sum+=Long.parseLong(d);
                try{
                    t+=Integer.parseInt(d);
                }catch(Exception e){
                    
                }
            }catch(Exception e){
                
            }
        }
        System.out.println(sum-t);
    }
}
