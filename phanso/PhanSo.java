/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.phanso;

/**
 *
 * @author khanh
 */
public class PhanSo {
    private long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public String toString(){
        return tu+"/"+mau;
    }
    public void rutgon(){
        long x=gcd(tu, mau);
        tu=tu/x;
        mau=mau/x;
    }
    public long gcd(long a, long b){
        return (b==0? a : gcd(b, a%b));
    }
}
