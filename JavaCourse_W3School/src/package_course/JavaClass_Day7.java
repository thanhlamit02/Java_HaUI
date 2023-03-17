/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_course;

/**
 *
 * @author thanhlam02.haui
 */

//import java.util.ArrayList;
//import java.util.List;

public class JavaClass_Day7 {
    public static void main(String[] args) {
//        Student[] students = new Student[100];
//        List<Student> stdList = new ArrayList<>();
//        Student std = new Student("James", 17, "james@gmail.com", "Male", "NewYork");
//        stdList.add(std);


//        String builder && String buffer
          StringBuilder builder = new StringBuilder();
          builder.append("Hello");
          builder.append("World");
          builder.append("!!!");
          System.out.println(builder.toString());
          
          StringBuffer buffer = new StringBuffer();
          buffer.append("Hello");
          buffer.append("World");
          buffer.append("!!!");
          System.out.println(buffer.toString());
          
          
    }
}
