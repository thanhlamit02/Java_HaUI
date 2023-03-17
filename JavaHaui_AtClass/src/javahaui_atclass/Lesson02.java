/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_atclass;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện
import java.util.Scanner;
import java.io.*;

public class Lesson02 {
    public static void main(String[] args) throws Exception{
        
        //Nhập chuỗi bằng class Scanner
        System.out.print("Nhap chuoi bat ki (Scanner): ");
        Scanner sc = new Scanner(System.in);
        String newLine1 = sc.nextLine();
        
        //Nhập chuỗi bằng BufferedReader
        System.out.print("Nhap chuoi bat ki (BufferedReader): ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String newLine2 = br.readLine();
        
        System.out.println("Chuoi ban vua nhap la: " + newLine1);
        System.out.println("Chuoi ban vua nhap la: " + newLine2);
    }
}
