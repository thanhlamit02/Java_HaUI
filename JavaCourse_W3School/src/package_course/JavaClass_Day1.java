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
import static java.lang.Math.*;

public class JavaClass_Day1 {
    public static boolean isPrime(int n) {
        if(n <= 1) {
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
        String firstName = "Nguyen";
        String lastName = "Lam";
        String fullName = firstName + " " + lastName;
        
        System.out.println("Ho ten: " + fullName);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int  n = sc.nextInt();
        
        if(isPrime(n)) {
            System.out.println("n is a prime");
        }
        else {
            System.out.println("n is not a prime");
        }
        

    }
}
