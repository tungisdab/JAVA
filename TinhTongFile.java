/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
import java.io.*;
/**
 *
 * @author khanh
 */
public class TinhTongFile {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            try{          
                sum+=Integer.parseInt(sc.next());
            }catch(Exception e){
                
            }
        }
        System.out.println(sum);
    }
}
