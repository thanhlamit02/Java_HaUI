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
        
        //Thực hành với mảng
        
        int[] myArr = {1, 2, 3};
        for(int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
        
        String[] myStr = {"Java", "PHP", "Ruby"};
        myStr[2] = "Javascript";
        System.out.println(myStr[2]);
        
        
        int[][] myNums = {{1, 2, 3}, {4, 5, 6, 7}};
        for (int i = 0; i < myNums.length; i++) {
            //for(int[] myNums : myNums)
            for (int j = 0; j < myNums[i].length; j++) {
                System.out.printf("%d ", myNums[i][j]);
            }
        }
        System.out.print(System.lineSeparator());
    }
}
