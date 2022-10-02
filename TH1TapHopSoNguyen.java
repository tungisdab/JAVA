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
public class TH1TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> a=new ArrayList<Integer>();
        List<Integer> b=new ArrayList<Integer>();
        int[] aa=new int[2000];
        int[] bb=new int[2000];
        for(int i=0;i<n;i++){
            int xx=sc.nextInt();
            if(aa[xx]==0){
                a.add(xx);                
                aa[xx]=1;
            }
        }
        for(int i=0;i<m;i++){
            int xx=sc.nextInt();
            if(bb[xx]==0){
                b.add(xx);
                bb[xx]=1;
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        List<Integer> abz=new ArrayList<Integer>();
        List<Integer> ab=new ArrayList<Integer>();
        List<Integer> ba=new ArrayList<Integer>();
        for(int i:a){
            int cc=0;
            for(int j:b){
                if(i==j){
                    abz.add(i);
                    cc=1;
                    break;
                }
            }
            if(cc==0){
                ab.add(i);
            }
        }
        for(int i:b){
            int cc=0;
            for(int j:a){
                if(i==j){
                    cc=1;
                    break;
                }
            }
            if(cc==0){
                ba.add(i);
            }
        }
        for(int i:abz){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:ab){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i:ba){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
