/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.khaiBaoLopHinhChuNhat;

/**
 *
 * @author khanh
 */
public class HinhChuNhat {
    private int a,b;
    private String s;
    public HinhChuNhat(int a, int b, String s){
        this.a=a;
        this.b=b;
        this.s=s;
    }
    public String toString(){
        if (a<=0 || b<=0){
            return "INVALID";
        }
        else{
            StringBuilder ss=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i==0){
                    ss.append(s.toUpperCase().charAt(i));
                }
                else{
                    ss.append(s.toLowerCase().charAt((i)));
                }
            }
            
            return (a+b)*2+" "+a*b+" "+ss;
        }
    }
}
