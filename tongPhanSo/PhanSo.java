/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.tongPhanSo;

/**
 *
 * @author khanh
 */
public class PhanSo {
    private long a,b;
    public PhanSo(long a, long b){
        this.a=a;
        this.b=b;
    }
    public long gcd(long a, long b){
        return b==0 ? a:gcd(b,a%b);
    }
    public PhanSo solve(PhanSo pss){
        long y=this.b*pss.b;
        long x=this.a*pss.b +pss.a*this.b;
        long z=gcd(x,y);
        return new PhanSo(x/z, y/z);
    }
    public String toString(){
        return a+"/"+b;
    }
}
