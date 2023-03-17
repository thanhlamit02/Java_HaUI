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

public class Java_Ex2 {
    public static void PTB2() {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("\tGiai phuong trinh ax2 + bx + c = 0");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();
        
        float delta = b * b - 4 * a * c;
        
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                }
            }
            else {
                System.out.printf("Phuong trinh co nghiem x = %f", -c / b);
            }
        }
        
        else {
            if(delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + -b / (2 * a));
            }
            else {
                System.out.println("Phuong trinh co nghiem x1 = " + ((-b + sqrt(delta)) / (2 * a)));
                System.out.println("Phuong trinh co nghiem x2 = " + ((-b - sqrt(delta)) / (2 * a)));
            } 
        }
    }
    public static void main(String[] args) {
        PTB2();
    }
}
