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
public class SoDep3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder sr=new StringBuilder(s);
            String ss= sr.reverse().toString();
            int cc=1;
            int l=s.length();
            for(int i=0;i<l;i++){
                if(s.charAt(i)!='2'&&s.charAt(i)!='3'&&s.charAt(i)!='5'&&s.charAt(i)!='7'){
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
