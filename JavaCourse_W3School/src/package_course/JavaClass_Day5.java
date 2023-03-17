/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_course;

/**
 *
 * @author thanhlam02.haui
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

enum Level {
    Low,
    Medium,
    High
}

public class JavaClass_Day5 {
    public static void main(String[] args) {
        Level myVar = Level.Medium;
        
        switch(myVar) {
            case Low:
                System.out.println("Low Level");
                break;
            case Medium:
                System.out.println("Medium Level");
                break;
            case High:
                System.out.println("High Level");
                break;
            default:
                System.out.println("None Level");
        }
        
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formatterDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formatterDate);
    }
}
