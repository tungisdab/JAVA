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
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextDouble();
            if (Math.sqrt(a)==(int)Math.sqrt(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
