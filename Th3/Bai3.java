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
public class Bai3 {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int cc=1;
            Stack<Character> arr=new Stack<>();
            String s=sc.nextLine();
            int n=s.length();
            for(int i=0;i<n;i++){
                char ss=s.charAt(i);
                if(ss=='(' || ss=='['){
                    arr.push(ss);
                }
                else if(ss==')'){
                    if(arr.empty() || arr.peek() != '('){
                        cc=0;
                        break;
                    }
                    arr.pop();
                }
                else if(ss==']'){
                    if(arr.empty() || arr.peek() != '['){
                        cc=0;
                        break;
                    }
                    arr.pop();
                }
            }
            if (cc==0 || !arr.empty()){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
