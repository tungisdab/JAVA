
import java.util.*;
import java.math.*;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            String x=a.mod(b).toString();
            String y=b.mod(a).toString();
            String z="0";     
            if(x.equals(z) || y.equals(z)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
