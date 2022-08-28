package baitap;
import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long cc=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    cc=i;
                    n/=i;
                }
            }
            if(n!=1){
                cc=n;
            }
            System.out.println(cc);
        }
    }
}