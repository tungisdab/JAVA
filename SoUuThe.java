/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;
/**
 *
 * @author khanh
 */
public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int cc=0;
            int ll=0;
            int z=1;
            int l=s.length();
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='1'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7'||s.charAt(i)=='9'){
                    ll+=1;
                }
                else if(s.charAt(i)=='0'||s.charAt(i)=='2'||s.charAt(i)=='4'||s.charAt(i)=='6'||s.charAt(i)=='8'){
                    cc+=1;
                }
                else{
                    z=0;
                    break;
                }
            }
            if(z==0){
                System.out.println("INVALID");
            }
            else{
                if((l%2==1 && ll>cc) || (l%2==0 && cc>ll)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
