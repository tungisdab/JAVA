/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopSinhVien;
import java.util.*;
import java.text.*;
/**
 *
 * @author khanh
 */
public class SinhVien {
   private String ma, hoten, lop;
   private Date dob;
   private float diem;
   public SinhVien(String hoten, String lop, String dob, float diem) throws ParseException{
       this.ma="B20DCCN001";
       this.hoten=hoten;
       this.lop=lop;
       this.dob=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
       this.diem=diem;
   }
   @Override
   public String toString(){
       return ma+" "+hoten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(dob)+" "+String.format("%.2f", diem);
   }
}
