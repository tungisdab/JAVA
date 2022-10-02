/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.phanso;
import java.util.*;
/**
 *
 * @author khanh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo ps=new PhanSo(sc.nextLong(), sc.nextLong());
        ps.rutgon();
        System.out.println(ps);
    }
}
