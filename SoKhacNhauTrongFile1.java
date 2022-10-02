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
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new File("DATA.in"));
        Map<Integer, Integer> a=new HashMap<>();
        while(sc.hasNext()){
            int b=sc.nextInt();
            if(a.containsKey(b)==true){
                a.put(b, a.get(b)+1);
            }
            else{
                a.put(b, 1);
            }
        }
        Set<Integer> bb=a.keySet();
        for (Integer x:bb){
            System.out.println(x+" "+a.get(x));
        }
        sc.close();
    }
}
