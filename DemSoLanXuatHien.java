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
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=1;q<=t;q++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] check=new int[1000000];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                check[a[i]]++;
            }
            System.out.println("Test "+q+":");
            for(int i=0;i<n;i++){
                if(check[a[i]]>0){
                    System.out.println(a[i]+" xuat hien "+check[a[i]]+" lan");
                    check[a[i]]=0;
                }
            }
        }
    }
}
