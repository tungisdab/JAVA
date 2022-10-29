/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;
import java.util.*;
import java.io.*;
/**
 *
 * @author khanh
 */
class WordSet{
    Set<String> s;
    public WordSet(String ss) throws IOException{
        Scanner sc=new Scanner(new File("VANBAN.in"));
        s=new TreeSet<>();
        while(sc.hasNext()){
            s.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String a="";
        for(String i:s){
            a+=i+"\n";
        }
        return a;
    }
}
public class LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
