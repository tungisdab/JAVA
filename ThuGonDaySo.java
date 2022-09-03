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
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        List<Integer> aa=new ArrayList<Integer>();
        aa.add(a[0]);
        int j=0;
        for (int i=1;i<n;i++){
            if((a[i]+aa.get(j))%2==0){
                aa.remove(j);
                if(aa.size()==0){
                    aa.add(a[i+1]);
                    i+=1;
                    j=0;
                }
                else{
                    j-=1;
                }
            }
            else{
                aa.add(a[i]);
                j+=1;
            }
        }
        System.out.println(aa.size());
    }
}
