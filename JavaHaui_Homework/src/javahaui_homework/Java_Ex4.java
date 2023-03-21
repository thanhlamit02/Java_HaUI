/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_homework;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện
import java.util.Scanner;

public class Java_Ex4 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
            System.out.print("Nhap b: ");
            b = sc.nextInt();
        }
        while (a < 0 || b < 0);
        System.out.println("UCLN cua " + a + " va " + b + " la: " + UCLN(a, b));
    }
    
    public static int UCLN(int a, int b) {
        if(b == 0) return a;
        return UCLN(b, a % b);
    }
}
