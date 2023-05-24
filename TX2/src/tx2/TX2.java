/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tx2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TX2 {
     static Scanner sc = new Scanner(System.in);

    static List<SinhVien> svs = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, Exception {
        // TODO code application logic here
        int choice;

        do {
            System.out.println("CHUONG TRINH QUAN LY SINH VIEN");
            System.out.println("    ---------------------    ");
            System.out.println("1. Nhap");
            System.out.println("2. Hien thi");
            System.out.println("3. Sap xep");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Nhap ");
                        add(svs);
                        break;
                    case 2:
                        System.out.println("HIen thi danh sach sach");
                        show(svs);
                        break;
                    case 3:
                        System.out.println("Sap xep");
                        sort(svs);
                        break;
                    case 4:
                        System.out.println("Tim kiem");
                        search(svs);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid " + choice);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static void add(List<SinhVien> svs) throws Exception{
        SinhVien sv = new SinhVien();
        sv.Input();
        WriteFile("QLSV.txt", sv);
        svs.add(sv);
    }

    public static void show(List<SinhVien> svs) {
        System.out.printf("%-10s %-30s %-20s %-30s\n", "Ma sinh vien", "Ho ten", "Gioi tinh", "Nam sinh");
        for (SinhVien ele : svs) {
            ele.Output();
        }
    }

    public static void sort(List<SinhVien> svs) {
        Collections.sort(svs, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getNamSinh() - o2.getNamSinh();
            }
        });
        
        for (SinhVien ele : svs) {
                ele.Output();
        }
    }

    public static void search(List<SinhVien> svs) {
        sc.nextLine();
        System.out.print("Nhap ma sinh vien can tim: ");
        String maSV = sc.nextLine();
        boolean check = false;
        for (SinhVien sv : svs) {
            if (sv.getMaSV().equals(maSV)) {
                sv.Output();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong ton tai sinh vien co ma nay");
        }
    }
    
    public static void WriteFile(String fileName, SinhVien sv) throws Exception {
        FileOutputStream file = new FileOutputStream(fileName);
        
        ObjectOutputStream os = new ObjectOutputStream(file);
        
        os.writeObject(sv.toString());
        
        os.close();
    }

    public static void ReadFile(String fileName) throws Exception {        
        FileInputStream file = new FileInputStream(fileName);
        
        ObjectInputStream is = new ObjectInputStream(file);
        
        SinhVien sv = (SinhVien) is.readObject();
        
        System.out.println(sv.toString());
        
        is.close();
    }
}
