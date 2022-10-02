/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
import java.math.*;
/**
 *
 * @author khanh
 */
public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            String s=sc.nextLine();
            HashSet<Character> a=new HashSet<>();
            int n=s.length();
            for(int i=0;i<n;i++){
                a.add(s.charAt(i));
            }
            int nn=a.size();
            int cc=26-nn;
            int k=sc.nextInt();
            System.out.println(cc<=k ? "YES" : "NO");
        }
    }
}
