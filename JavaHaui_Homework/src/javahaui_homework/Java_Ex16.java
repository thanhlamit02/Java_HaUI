/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_homework;

/**
 *
 * @author thanhlam02.haui
 */

import java.util.Scanner;

public class Java_Ex16 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi thu nhat: ");
        str1 = sc.nextLine();
        System.out.print("Moi ban nhap chuoi thu hai: ");
        str2 = sc.nextLine();
        
        System.out.print("So sanh " + str1 + " va " + str2 + " : ");

        Boolean res = str1.equals(str2);
        if(res) {
            System.out.println("Giong nhau");
        }
        else {
            System.out.println("Khac nhau");
        }
    }
}
