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
public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        int cc=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<3;j++){
                int x=sc.nextInt();
                if(x==1){
                    cnt++;
                }
            }
            if(cnt>1){
                cc++;
            }
        }
        System.out.println(cc);
    }
}
