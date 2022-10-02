
package JAVA;
import java.util.*;

public class TH1LocEmailTrungNhau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> a=new HashSet<String>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            a.add(s.toLowerCase());
        }
        List<String> aa=new ArrayList<String>();
        for(String i:a){
            aa.add(i);
        }
        Collections.sort(aa);
        for(String i:aa){
            System.out.println(i);
        }
    }
}
