/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.Th3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author khanh
 */
class Pair<T1, T2>{
    T1 a;
    T2 b;
    
    public Pair(T1 a, T2 b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "("+a+","+b+")";
    }
    
}
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][j]==1){
                    System.out.println(new Pair<Integer, Integer>(i+1,j+1));
                }
            }
        }
    }
}
//6
//0 1 1 0 1 0
//1 0 1 0 1 0
//1 1 0 1 0 0
//0 0 1 0 1 1
//1 1 0 1 0 1
//0 0 0 1 1 0
