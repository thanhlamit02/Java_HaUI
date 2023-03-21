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

public class Java_Ex6 {
    public static void inputArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] = ", i);
            arr[i] = sc.nextInt();
        }
    }
    
    public static void outputArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        
        inputArr(arr);
        System.out.println("Mang vua nhap la:");
        outputArr(arr);
        
        BinarySearch ob = new BinarySearch();
        System.out.print("Nhap phan tu can tim: ");
        int inputSearch = sc.nextInt();
        
        int res = ob.binarySearch(arr, 0, arr.length - 1, inputSearch);
        if(res == -1) System.out.println("Phan tu khong ton tai");
        else System.out.println("Phan tu o vi tri thu " + res);
    }
} 

class BinarySearch {
    int binarySearch(int[] arr, int left, int right, int x) {
        if(right >= left) {
            int mid = left + (right - left) / 2;

            // Nếu phần tử có ở chính giữa
            if (arr[mid] == x)
                return mid;

            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(arr, mid + 1, right, x);
        }

        // Nếu phần tử không có trong mảng
        return -1;
    }
}

