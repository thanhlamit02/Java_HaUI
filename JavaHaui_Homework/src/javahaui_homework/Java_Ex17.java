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

public class Java_Ex17 {
    public static Scanner sc = new Scanner(System.in);
    
    //Hàm nhập mảng
    public static void insertArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu %d: ", i);
            arr[i] = sc.nextInt();
        }
    }
    
    //Hàm xuất mảng
    public static void showArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
 
       System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        insertArr(arr1);
        System.out.print("Mang vua nhap la: ");
        showArr(arr1);
        
        int[] arr2 = new int[arr1.length];
 
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
 
        System.out.println("Mang ban dau: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
 
        System.out.println("Mang sau khi copy: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
    }
}
