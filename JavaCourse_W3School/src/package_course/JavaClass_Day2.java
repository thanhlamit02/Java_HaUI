/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_course;

/**
 *
 * @author thanhlam02.haui
 */

import java.util.Scanner;

public class JavaClass_Day2 {
    public static void main(String[] args) {
        String firstName = "Do";
        String lastName = "Duc Toan";
        
        System.out.println("Full name: " + firstName.concat(" " + lastName));
        // concat() - dùng để nối chuỗi
        
        int x = 10;
        int y = 8;
        System.out.println("Result is " + (x > y));
        
        //Khai báo đầu vào
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a = ");
        int a = sc.nextInt();
        
        System.out.print("b = ");
        int b = sc.nextInt();
        
        
        //Kiểm tra điều kiện
        if(a >= b) {
            System.out.printf("%d is bigger than %d", a, b);
            System.out.print(System.lineSeparator());
        }
        else {
            System.out.printf("%d is smaller than %d", a, b);
            System.out.print(System.lineSeparator());
        }
        
        
        //Cấu trúc điều kiện: variable = (condition) ? expressionTrue :  expressionFalse;
        System.out.print("m = ");
        int m = sc.nextInt();
        
        System.out.print("n = ");
        int n = sc.nextInt();
        
        int p = m + n;
        int q = m - n;
        
        int result = (m <= n) ? p : q;
        System.out.print(result);
        System.out.print(System.lineSeparator()); //cú pháp xuống dòng System.lineSeparator()
    }
}

