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
public class SoDep2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder sr=new StringBuilder(s);
            String ss=sr.reverse().toString();
            int cc=1;
            int sum=0;
            int l=s.length();
            if(s.charAt(0)!='8' || s.charAt(l-1)!='8'){
                cc=0;
            }
            for(int i=0;i<l;i++){
                sum+=(s.charAt(i)-48);
            }
            if(sum%10!=0){
                cc=0;
            }
            if(s.equals(ss)==false){
                cc=0;
            }
            System.out.println(cc==1?"YES":"NO");
        }
    }
}
