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

public class Lesson05 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
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
    }
}
