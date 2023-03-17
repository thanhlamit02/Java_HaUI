/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_atclass;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;
import java.util.ArrayList;


public class Lesson04 {
    //Kiểm tra số nguyên tố
    public static boolean isPrime(int numIn) {
        if(numIn < 2) {
            return false;
        }
        for(int i = 2; i <= sqrt(numIn); i++) {
            if(numIn % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        }
        while (n <= 0);
        
        //Nhập chuỗi số nguyên
        int[] arr = new int[n];
        System.out.println("\tNhap phan tu mang");
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        
        //Tính tổng
        for(int numInt : arr) {
            sum += numInt;
        }
        System.out.println("Tong day so la: " + sum);
        
        //Sắp xếp tăng dần
        Arrays.sort(arr);
        System.out.print("Mang sau khi sap xep tang dan: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        //Tách thành 2 dãy: nguyên tố và không nguyên tố
        //Dãy vào 1 2 3 4 5 -> 2 3 5 1 4
        /*
        int currentIndex = -1;
        for(int i = 0; i < n; i++) {
            if(isPrime(i)) {
                currentIndex++;
                int temp = arr[i];
                arr[i] = arr[currentIndex];
                arr[currentIndex] = temp;
            }
        }
        
        System.out.print("Mang sau khi tach: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        */
        
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> nonPrime = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                prime.add(arr[i]);
            } else {
                nonPrime.add(arr[i]);
            }
        }

        // In ra dãy kết quả
        System.out.print("Day so nguyen to sau khi tach: ");
        for (int i = 0; i < prime.size(); i++) {
            System.out.print(prime.get(i) + " ");
        }
        System.out.print(System.lineSeparator());
        
        System.out.print("Day so khong nguyen to sau khi tach: ");
        for (int i = 0; i < nonPrime.size(); i++) {
            System.out.print(nonPrime.get(i) + " ");
        }
        System.out.print(System.lineSeparator());

    }
}
