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
public class AANhap {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("C:\\Users\\khanh\\Documents\\TRYHARD\\java\\BaiTap\\src\\JAVA\\DATA.in"));
        ArrayList<String> a=new ArrayList<String>();
        while(sc.hasNext()){
            String tmp=sc.next();
            try{
                long kq=Integer.parseInt(tmp);
            }catch(NumberFormatException e){
                a.add(tmp);
            }
        }
        Collections.sort(a);
        for(String i:a){
            System.out.println(i);
        }
    }
}
