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
public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            int cc=1;
            int sum=(s.charAt(0)-48);
            for(int i=1;i<l;i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1))!=2){
                    cc=0;
                    break;
                }
                else{
                    sum+=(s.charAt(i)-48);
                }
            }
            if(cc==1 && sum%10==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
