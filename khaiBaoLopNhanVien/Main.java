package JAVA.khaiBaoLopNhanVien;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        NhanVien nv=new NhanVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}
