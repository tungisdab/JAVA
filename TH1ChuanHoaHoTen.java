/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
/**
 *
 * @author khanh
 */
public class TH1ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int hh=sc.nextInt();
            sc.nextLine();
            if(hh==2){
                String ss1=sc.next();
                StringBuilder ss2=new StringBuilder();
                ss2.append(Character.toUpperCase(ss1.charAt(0)));
                for(int i=1;i<ss1.length();i++){
                    ss2.append(Character.toLowerCase(ss1.charAt(i)));
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

                System.out.println(" "+ss2);
            }
            else{
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
                int l=kq.length()-2;
                StringBuilder ss=new StringBuilder();
                while(l>0){
                    ss.append(kq.charAt(l));
                    if(kq.charAt(l)==' '){
                        break;
                    }
                    else{
                        l--;
                    }
                }
                l=ss.length();
                for(int i=l-1;i>=0;i--){
                    if(ss.charAt(i)!=' ')
                        System.out.print(ss.charAt(i));
                }
                System.out.print(" ");
                int ll=kq.length()-l-1;
                for(int i=0;i<ll;i++){
                    System.out.print(kq.charAt(i));
                }
                System.out.println();
            }
        }
    }
}
