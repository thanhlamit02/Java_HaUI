/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx2;

import java.util.Scanner;

public class SinhVien {
    public String maSV;
    public String hoTen;
    public String gioiTinh;
    public int namSinh;

    public SinhVien() {}
    
    public SinhVien(String maSV, String hoTen, String gioiTinh, int namSinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;   
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    @Override
    public String toString() {
        return "SinhVien: {" + "MaSV: " + maSV + ", Ho ten: " + hoTen + ", Gioi tinh: " + gioiTinh + ", Nam sinh: "+ namSinh + '}';
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        setMaSV(sc.nextLine());
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Gioi tinh: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nam sinh: ");
        setNamSinh(sc.nextInt());

    }
    
    public void Output() {
        System.out.printf("%-10s %-30s %-20s %-30d\n", maSV, hoTen, gioiTinh, namSinh);
    }
}
