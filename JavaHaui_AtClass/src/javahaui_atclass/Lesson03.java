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

public class Lesson03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        float firstNum = sc.nextFloat();
        
        System.out.print("Nhap so thu hai: ");
        float secondNum = sc.nextFloat();
        
        System.out.println("Tong hai so: " + (firstNum + secondNum));
        System.out.println("Hieu hai so: " + (firstNum - secondNum));
        System.out.println("Tich hai so: " + (firstNum * secondNum));
        System.out.println("Thuong hai so: " + (firstNum / secondNum));
        System.out.println("Phan du cua thuong hai so: " + (firstNum % secondNum));
    }
}
