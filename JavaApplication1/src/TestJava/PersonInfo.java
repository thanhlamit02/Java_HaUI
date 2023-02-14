/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestJava;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện java.util.Scanner để sử dụng scanner
import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        String name;
        int age;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Nhap ho va ten: ");
        //nextLine() : Nhập chuỗi, dòng    
        name = scanner.nextLine(); 
        
        System.out.print("Nhap tuoi: ");
        //nextInt() : Nhập số nguyên  
        age = scanner.nextInt();
        
        System.out.printf("%s nam nay %d tuoi", name, age);
    }
}
