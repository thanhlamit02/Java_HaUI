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

public class JavaClass_Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Cấu trúc switch case
        /**
         * switch(expression) {
                case x:
                    code block
                    break;
                case y:
                    code block
                    break;
                default:
                    code block
            }
         */
        
        System.out.print("Please enter one number from 2 to 8: ");
        String inputRes = sc.nextLine();
        
        switch(inputRes) {
            case "2":
                System.out.println("Monday");
                break;
            case "3":
                System.out.println("Tuesday");
                break;
            case "4":
                System.out.println("Wednesday");
                break;
            case "5":
                System.out.println("Thusday");
                break; 
            case "6":
                System.out.println("Friday");
                break; 
            case "7":
                System.out.println("Saturday");
                break;
            case "8":
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("You enter incorrect!");
        }
    }
}
