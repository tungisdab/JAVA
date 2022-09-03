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
public class HelloFile {
    public static void main(String[] args) {
        try{
            File aa= new File("Hello.txt");
            Scanner sc=new Scanner(aa);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
