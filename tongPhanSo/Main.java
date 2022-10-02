/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.tongPhanSo;
import java.util.*;
import java.text.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        PhanSo ps1=new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo ps2=new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo ps=ps1.solve(ps2);
        System.out.println(ps);
    }
}
