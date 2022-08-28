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
public class SoDep1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder sr=new StringBuilder(s);
            String ss=sr.reverse().toString();
            int l=s.length();
            int cc=1;
            for(int i=0;i<l;i++){
                if(s.charAt(i)!='0'&&s.charAt(i)!='2'&&s.charAt(i)!='4'&&s.charAt(i)!='6'&&s.charAt(i)!='8'){
                    cc=0;
                    break;
                }
            }
            if(s.equals(ss)==false){
                cc=0;
            }
            System.out.println(cc==1?"YES":"NO");
        }
    }
}
