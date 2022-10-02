/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopSinhVien;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        SinhVien sv=new SinhVien(sc.nextLine(), sc.next(), sc.next(), Float.parseFloat(sc.next()));
        System.out.println(sv);
    }
}
