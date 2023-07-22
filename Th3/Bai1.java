/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.Th3;
import java.util.*;
import java.text.*;


/**
 *
 * @author khanh
 */
public class Bai1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            int a=1;
            List<Integer> arr1=new ArrayList<>();
            List<Integer> arr2=new ArrayList<>();
            int n=s.length();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='('){
                    arr1.add(a);
                    arr2.add(a);
                    a++;
                }
                if(s.charAt(i)==')'){
                    arr1.add(arr2.get(arr2.size()-1));
                    arr2.remove(arr2.size()-1);
                }
            }
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
