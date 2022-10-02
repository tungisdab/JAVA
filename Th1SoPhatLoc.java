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
public class Th1SoPhatLoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            int cc=0;
            if (s.endsWith("86")){
                cc=1;
            }
            System.out.println(cc==1? "YES":"NO");
        }
    }
}
