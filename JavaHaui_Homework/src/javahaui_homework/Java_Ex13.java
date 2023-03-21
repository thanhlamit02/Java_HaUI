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

public class Java_Ex13 {
   public static void main(String[] args) {
        String str = "everybody";
        int[] a = new int[str.length()];
        Count(str,a);
        int max = Max(a);
        Result(str,a,max);
    }

    private static int Max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length ; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    private static void Result(String str, int[] a, int max) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max){
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    private static void Count(String str, int[] a) {
        for (int i = 0; i < str.length(); i++) {
            int dem = 1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dem++;
                }
            }
            a[i] = dem;
        }
    }
}
