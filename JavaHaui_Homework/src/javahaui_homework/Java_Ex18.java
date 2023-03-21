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

public class Java_Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        String[] a = chuoi.split("\s+");
        int n;
        do {
            n = scanner.nextInt();
        } while (n > a.length);
        String str = "";

        for (int i = 0; i < n; i++) {
            str = str.concat(a[i]+" ");
        }
        System.out.println(str);
    }
}
