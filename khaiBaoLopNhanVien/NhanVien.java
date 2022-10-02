/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopNhanVien;
import java.text.*;
import java.util.*;
/**
 *
 * @author khanh
 */
public class NhanVien {
    private String ma, hoten, gt, diachi, mst;
    private Date dob, ngay;
    public NhanVien(String hoten, String gt, String dob, String diachi, String mst, String ngay) throws ParseException{
        this.ma="00001";
        this.hoten=hoten;
        this.gt=gt;
        this.dob=new SimpleDateFormat("dd/MM/yyy").parse(dob);
        this.diachi=diachi;
        this.mst=mst;
        this.ngay=new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
    }
    
    public String toString(){
        return ma+" "+hoten+" "+gt+" "+new SimpleDateFormat("dd/MM/yyyy").format(dob)+" "+diachi+" "+mst+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngay);
    }
}
