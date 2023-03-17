/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_homework;

//Khai báo thư viện
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author thanhlam02.haui
 */
public class Java_Ex1 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } 
        for(int i = 2; i <= sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    } 
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        if(isPrime(n)) {
            System.out.println(n + " la so nguyen to");
        }
        
        else {
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
