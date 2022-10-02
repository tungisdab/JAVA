/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopPoint;
import java.util.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            Point point =new Point(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            System.out.println(point);
        }
    }
}
