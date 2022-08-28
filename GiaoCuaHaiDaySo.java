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
public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[100000];
        List<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(a[x]==0){
                a[x]=1;
            }
        }
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            if(a[x]==1){
                b.add(x);
                a[x]=0;
            }
        }
        b.sort(Comparator.naturalOrder());
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
