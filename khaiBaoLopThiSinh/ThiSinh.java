/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khaiBaoLopThiSinh;

/**
 *
 * @author khanh
 */
public class ThiSinh {
    private String hoten, dob;
    private float d1,d2,d3,dd;
    public ThiSinh(String hoten, String dob, float d1, float d2, float d3){
        this.hoten=hoten;
        this.dob=dob;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        dd=d1+d2+d3;
    }
    public String toString(){
        return hoten+" "+dob+" "+ String.format("%.1f", dd);
    }
}
