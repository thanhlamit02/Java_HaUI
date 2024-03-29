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
import static java.lang.Math.*;

public class Java_Ex3 {
    public static int giaiThua(int n){
        if(n < 0) {
            return 0;
        }
        else if(n == 0 || n == 1) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.printf("Giai thua cua %d la: %d", n, giaiThua(n));
        System.out.println("");
    }  
}


