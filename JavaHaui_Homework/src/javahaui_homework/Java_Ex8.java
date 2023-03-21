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

public class Java_Ex8 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void insertArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu %d : ", i);
            arr[i] = sc.nextInt();
        }
    }
    
    public static void showArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static int sumArr(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap gia tri bat ki: ");
        int randomValue = sc.nextInt();
        System.out.print("Nhap so luong mang: ");
        int countArr = sc.nextInt();
        int countTrue = 0;
        for(int i = 0; i < countArr; i++) {
            System.out.printf("Nhap mang thu %d: ", i + 1);
            
            System.out.print("Nhap so phan tu mang: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Nhap cac phan tu cua mang: ");
            insertArr(arr);
            System.out.println("Mang vua nhap la: ");
            showArr(arr);
            
            //Tinh tong mang
            System.out.println("Tong cua mang vua nhap: " + sumArr(arr));
            if(randomValue == sumArr(arr)) {
                System.out.println("Mang nay co tong bang gia tri da nhap");
                countTrue++;
            }
            else {
                System.out.println("Mang nay khong co tong bang gia tri da nhap");
            } 
        }
        
        System.out.printf("Co %d mang trung voi gia tri da nhap", countTrue);
    }
}
