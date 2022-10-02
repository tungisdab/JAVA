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
public class TH1LietKeCacTuKhacNhau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashSet<String> a=new HashSet<String>();
        HashSet<String> b=new HashSet<String>();
        for(int kk=0;kk<n;kk++){
            String s=sc.nextLine();
            StringTokenizer ss=new StringTokenizer(s);
            while(ss.hasMoreTokens()){
                String tt=ss.nextToken();
                a.add(tt.toLowerCase());
            }
        }
        int m=sc.nextInt();
        sc.nextLine();
        for(int kk=0;kk<m;kk++){
            String s=sc.nextLine();
            StringTokenizer ss=new StringTokenizer(s);
            while(ss.hasMoreTokens()){
                String tt=ss.nextToken();
                b.add(tt.toLowerCase());
            }
        }
        List<String> aa=new ArrayList<String>();
        List<String> bb=new ArrayList<String>();
        for(String i:a){
            int zz=0;
            for(String j:b){
                if(i.equals(j))
                    zz=1;
            }
            if(zz==0)
                aa.add(i);
        }
        for(String i:b){
            int zz=0;
            for(String j:a){
                if(i.equals(j))
                    zz=1;
            }
            if(zz==0)
                bb.add(i);
        }
        Collections.sort(aa);
        Collections.sort(bb);
        for(String i:aa){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(String i:bb){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
