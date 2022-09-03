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
public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            int cc=-1;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int sum1=a[0];
            for (int i=1;i<n-1;i++){
                if (sum1==(sum-a[i]-sum1)){
                    cc=i+1;
                }
                else{
                    sum1+=a[i];
                }
            }
            System.out.println(cc);
        }
    }
}
