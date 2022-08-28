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
public class ChuanHoaHoTen1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder kq=new StringBuilder();
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String z=st.nextToken();
                kq.append(Character.toUpperCase(z.charAt(0)));
                for (int i=1;i<z.length();i++){
                    kq.append(Character.toLowerCase(z.charAt(i)));
                }
                kq.append(" ");
            }
            System.out.println(kq.toString().trim());
        }
    }
}
