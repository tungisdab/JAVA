/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khaiBaoLopThiSinh;
import java.util.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ThiSinh t=new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(t);
    }
}
