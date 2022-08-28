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
public class ChuanHoaHoTen2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1=sc.next();
            StringBuilder s2=new StringBuilder();
            for(int i=0;i<s1.length();i++){
                s2.append(Character.toUpperCase(s1.charAt(i)));
            }
            String s=sc.nextLine();
            StringBuilder kq = new StringBuilder();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String z=st.nextToken();
                kq.append(Character.toUpperCase(z.charAt(0)));
                for(int i=1;i<z.length();i++){
                    kq.append(Character.toLowerCase(z.charAt(i)));
                }
                kq.append(" ");
            }
            System.out.print(kq.toString().trim());

            System.out.println(", "+s2);
        }
    }
}
