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
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int l=s.length();
            int cc=0;
            List<Integer> arr=new ArrayList<Integer>();
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='1'){
                    cc=1;
                    arr.add(1);
                }
                else if(s.charAt(i)=='0' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                    arr.add(0);
                }
                else{
                    cc=2;
                    break;
                }
            }
            if(cc==0 || cc==2){
                System.out.println("INVALID");
            }
            else{
                int zz=0;
                for(int i:arr){
                    if(i==1){
                        System.out.print(i);
                        zz=1;
                    }
                    else if(zz==1){
                        System.out.print(i);
                    }
                }
                System.out.println();
            }
        }
    }
}
