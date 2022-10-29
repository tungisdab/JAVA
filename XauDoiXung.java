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
public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int cc=0;
            int n=s.length();
            int k=0;
            for (int i=0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    k++;
                } 
            }
            if ((n%2==0 && k==1) || (n%2==1 && k<=1)){
                cc=1;
            }
            System.out.println(cc==1 ? "YES":"NO");
        }
    }
}
