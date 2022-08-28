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
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Integer> a=new HashSet<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            int k=s.charAt(i);
            a.add(k);
        }
        System.out.println(a.size());
    }
}
