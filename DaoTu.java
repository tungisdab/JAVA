import java.util.*;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder ss=new StringBuilder();
            StringTokenizer sr=new StringTokenizer(s);
            while(sr.hasMoreTokens()){
                String z=sr.nextToken();
                int l=z.length();
                for(int i=l-1;i>=0;i--){
                    ss.append(z.charAt(i));
                }
                ss.append(" ");
            }
            System.out.println(ss.toString().trim());
        }
    }
}
