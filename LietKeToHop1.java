package JAVA;
import java.util.*;
public class LietKeToHop1 {
    public static int[] a=new int[1000];
    public static int n;
    public static int k;
    public static int cnt=0;
    public static void out(){
        for(int i=1;i<=k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        cnt++;
    }
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if (i==k){
                out();
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Try(1);
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
