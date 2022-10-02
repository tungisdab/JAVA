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
public class Point {
    private double a1,a2,a3,a4, a;
    public Point(float a1, float a2, float a3, float a4){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        this.a4=a4;
        a=Math.sqrt((a1-a3)*(a1-a3)+(a2-a4)*(a2-a4));
    }
    public String toString(){
       return String.format("%.4f", a);
    }
}
