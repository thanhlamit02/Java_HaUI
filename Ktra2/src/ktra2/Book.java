/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktra2;

import java.util.Scanner;

/**
 *
 * @author dth27
 */
public class Book {

    private String id;
    private String tenSach;
    private String tacGia;
    private String nhaXB;
    private int namXB;

    public Book() {
    }

    public Book(String id, String tenSach, String tacGia, String nhaXB, int namXB) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", nhaXB=" + nhaXB + ", namXB=" + namXB + '}';
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sach: ");
        setId(sc.nextLine());
        System.out.print("Ten sach: ");
        setTenSach(sc.nextLine());
        System.out.print("Tac gia: ");
        setTacGia(sc.nextLine());
        System.out.print("Nha xuat ban: ");
        setNhaXB(sc.nextLine());
        System.out.print("Nam xuat ban: ");
        setNamXB(sc.nextInt());
    }
    
    public void Output() {
        System.out.printf("%-10s %-30s %-20s %-30s %-10d\n", id, tenSach, tacGia, nhaXB, namXB);
    }
}
