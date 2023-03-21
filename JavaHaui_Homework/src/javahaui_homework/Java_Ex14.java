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
import java.util.StringTokenizer;

public class Java_Ex14 {
    public static void main(String[] args) {
        String arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        arr = sc.nextLine();
        
        StringTokenizer strTokenizer = new StringTokenizer(arr);
        int countWord = strTokenizer.countTokens();
        System.out.println("So tu trong chuoi " + arr + " la: " + countWord);
    }
}
