/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
/**
 *
 * @author khanh
 */
public class TH1TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            List<Character> ss=new ArrayList<>();
            int sum=0;
            int l=s.length();
            for(int i=0;i<l;i++){
                if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'&&s.charAt(i)!='3'&&s.charAt(i)!='4'&&s.charAt(i)!='5'&&s.charAt(i)!='6'&&s.charAt(i)!='7'&&s.charAt(i)!='8'&&s.charAt(i)!='9'){
                    ss.add(s.charAt(i));
                }
                else{
                    sum+=s.charAt(i)-48;
                }
            }
            Collections.sort(ss);
            for(char i:ss){
                System.out.print(i);
            }
            System.out.println(sum);
        }
    }
}
