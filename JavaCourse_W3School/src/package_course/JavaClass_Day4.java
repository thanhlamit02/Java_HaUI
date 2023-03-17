/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_course;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện nhập, thư viện toán
import java.util.Scanner;
//import static java.lang.Math.*;


public class JavaClass_Day4 {
    //Method checkAge
    static void checkAge(int age) {
        if(age < 18) {
            System.out.println("You are too young");
        }
        
        else if(age == 18) {
            System.out.println("Good luck!");
        }
        else {
            System.out.println("Successfull!");
        }
    }
    
    //Main
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Run method
        checkAge(n);
    }
}
