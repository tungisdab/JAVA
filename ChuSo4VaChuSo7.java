/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;

public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int cnt=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='4'||s.charAt(i)=='7'){
                cnt++;
            }
        }
        System.out.println(cnt==4||cnt==7?"YES":"NO");
    }
}
