/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahaui_homework;

/**
 *
 * @author thanhlam02.haui
 */

//Khai báo thư viện
import java.util.Scanner;

public class Java_Ex11 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k;
        do {
            System.out.print("Nhap m: ");
            m = sc.nextInt();
            
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            
            System.out.print("Nhap k: ");
            k = sc.nextInt(); 
        }
        while(m <= 0 || n <= 0 || k <= 0);


        int a[][] = new int [m][n]; //so dong va so cot cua ma tran a
        int b[][] = new int [n][k]; // so dong va so cot cua ma tran b

        System.out.println("Nhap ma tran a(m*n):");
        inputArr(a);
        System.out.println("Nhap ma tran b(n*k):");
        inputArr(b);

        System.out.println("Ma tran a:");
        outputArr(a);
        
        System.out.println("Ma tran b:");
        outputArr(b);
        
        //Tich 2 ma tran a va b
        multiArr(a, b, m, n, k);
    }
    
    public static void inputArr(int array[][]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("[%d][%d] = ", i , j);
                array[i][j] = sc.nextInt();
            }
        }
    }
 
    public static void outputArr(int array[][]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j]+" ");
            }
        System.out.println();
        }
    }
    
    public static void multiArr(int[][] a, int[][] b, int m, int n, int k){
        int[][] c = new int[m][k];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < k; j++) {
                c[i][j] = 0;
                for(int p = 0; p < n; p++) {
                    c[i][j] += a[i][p] * b[p][j];
                }
            }
        }
        
        System.out.println("Tich 2 ma tran a va b la:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < k; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
