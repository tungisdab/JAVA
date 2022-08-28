/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author khanh
 */
public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            int cc=1;
            for(int i=1;i<l;i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1))!=1){
                    cc=0;
                    break;
                }
            }
            System.out.println(cc==1?"YES":"NO");
        }
    }
}
