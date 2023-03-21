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
import java.util.ArrayList;
import java.util.Collections;

public class Java_Ex9 {
    //Hàm nhập dữ liệu từ bàn phím
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
        
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        insertArr(arr);
        System.out.print("Mang vua nhap la: ");
        showArr(arr);
        
        ArrayList<Integer> isPrimeArr = new ArrayList<>();       
        ArrayList<Integer> nonPrimeArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) {
                isPrimeArr.add(arr[i]);
                Collections.sort(isPrimeArr);
            }
            else {
                nonPrimeArr.add(arr[i]);
            }
        }
        
        System.out.println("Ket qua: " + isPrimeArr + " " + nonPrimeArr);
    }
}
