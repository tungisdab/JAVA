/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopHinhChuNhat;
import java.util.*;
import java.text.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        HinhChuNhat hcn=new HinhChuNhat(sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(hcn);
    }
}
