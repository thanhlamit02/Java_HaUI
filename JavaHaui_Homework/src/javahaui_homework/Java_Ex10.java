/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_homework;

import java.util.Scanner;

/**
 *
 * @author thanhlam02.haui
 */

public class Java_Ex10 {
     public static Scanner sc = new Scanner(System.in);
    
    //Hàm kiểm tra số nguyên tố
    public static Boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //Hàm nhập mảng
    public static void insertArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.printf("Phan tu thu [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    //Hàm xuất mảng
    public static void showArr(int[][] arr) {
       for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int m, n;
        do {
            System.out.println("Nhap ma tran a co mxn phan tu");
            System.out.print("Nhap so dong m: ");
            m = sc.nextInt();
            
            System.out.print("Nhap so cot n: ");
            n = sc.nextInt();
        }
        while (m <= 0 || n <= 0);
        int[][] a = new int[m][n];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i , j);
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Mang vua nhap la: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }
        
        int  maxNum = a[0][0];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(isPrime(a[i][j])) {
                    if(maxNum < a[i][j]) {
                        maxNum = a[i][j];
                    }
                }
            }
        }
        System.out.println("So nguyen to lon nhat: " + maxNum);
    }
}
