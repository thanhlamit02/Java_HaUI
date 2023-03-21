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

public class Java_Ex15 {
    public static void main(String[] args) {
        String arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        arr = sc.nextLine();
        System.out.println("Chuoi ban dau: " + arr);
        
        char[] charArray = arr.toCharArray();
        boolean foundSpace = true;
        
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        arr = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: " + arr);
        
    }
}
