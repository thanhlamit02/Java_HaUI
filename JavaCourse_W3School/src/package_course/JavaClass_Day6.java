/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_course;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện nhập dữ liệu
import java.util.Scanner;
//import static java.lang.Math.*;

public class JavaClass_Day6 { 
    public static void personInfo_Name() {
        System.out.println("Please enter your name: ");
        Scanner scName = new Scanner(System.in);
        String newName = scName.nextLine();
        System.out.print(System.lineSeparator());
        System.out.println("Your name is " + newName);        
    }
    
    public static void personInfo_Age() {
        System.out.println("Please enter your age: ");
        Scanner scAge = new Scanner(System.in);
        String newAge = scAge.nextLine();
        System.out.print(System.lineSeparator());
        System.out.println("Your age is " + newAge);
    }
    
    public static void personInfo_Address() {
        System.out.println("Please enter your address: ");
        Scanner scAddress = new Scanner(System.in);
        String newAdd = scAddress.nextLine();
        System.out.print(System.lineSeparator());
        System.out.println("Your address is " + newAdd);
    }
    
    public static void main(String[] args) {
        System.out.println("Please choose one option that is suitable!");
        System.out.println("1. Show fullname");
        System.out.println("2. Show age");
        System.out.println("3. Show address");
        
        System.out.print("Enter your option: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(System.lineSeparator());
        
        switch(str) {
            case "1":
                personInfo_Name();
                break;
            case "2":
                personInfo_Age();
                break;
            case "3":
                personInfo_Address();
                break;
            default:
                System.out.println("Please choose again!");
                break;
        }

    }
}
