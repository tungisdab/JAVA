/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.TinhThuNhapGiaoVien;
import java.text.*;
/**
 *
 * @author khanh
 */
public class GiaoVien {
    private String ma, ten;
    private long ms, lcb, luong, phucap;
    public GiaoVien(String ma, String ten, long lcb) throws ParseException{
        this.ma=ma;
        this.ten=ten;
        this.ms=(ma.charAt(2)-48)*10+ma.charAt(3)-48;
        if(ma.charAt(1)=='T'){
            this.phucap=2000000;
        }
        else if(ma.charAt(1)=='P'){
            this.phucap=900000;
        }
        else{
            this.phucap=500000;
        }
        this.lcb=lcb;
        luong=lcb*ms+phucap;
    }
    public String toString(){
        return ma+" "+ten+" "+ms+" "+phucap+" "+luong;
    }
}
