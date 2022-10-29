
package JAVA;
import java.util.*;
import java.text.*;
public class TinhGiaBan1 {
    public static class Product{
        private String id, name, dv;
        private long phiVanChuyen, thanhTien, giaBan;
        private float sl, giaNhap;
        public Product(int id, String name, String dv, float giaNhap, float sl){
            this.id="MH";
            if (id<10){
                this.id+="0";
            }
            this.id+=String.valueOf(id);
            this.name=name;
            this.dv=dv;
            this.phiVanChuyen=Math.round(giaNhap*sl*5.0/100.0);
            this.thanhTien=Math.round(giaNhap*sl +this.phiVanChuyen);
            this.giaBan=Math.round(this.thanhTien +this.thanhTien*2.0/100.0);
        }
        @Override
        public String toString() {
            return id+" "+name+" "+dv+" "+phiVanChuyen+" "+thanhTien+" "+giaBan;
        }
    }
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
//        int n=Integer.parseInt(sc.nextLine());
        int n=sc.nextInt();
        List<Product> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            Product x=new Product(i, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
            a.add(x);
        }
        for(Product i:a){
            System.out.println(i);
        }
    }
}
