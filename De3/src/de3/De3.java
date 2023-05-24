package de3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class De3 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<NhanSu> NSs = new ArrayList<>();

    public static void main(String[] args) {
        
        do {
            System.out.println("CHUONG TRINH QUAN LY NHAN SU");
            System.out.println("------------------------------");
            
            System.out.println("1. Nhap");
            System.out.println("2. Hien thi");
            System.out.println("3. Sap xep");
            System.out.println("4. Thoat");
            System.out.print("Lua chon: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: 
                    nhap();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    Collections.sort(NSs, new sapXep());
                    hienThi();
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
            }
        }while(true);
    }

    public static void nhap() {
        System.out.print("So ns: ");
        int sns = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < sns; i++) {
            System.out.print("Ho ten: ");
            String hoten = scanner.nextLine();
            System.out.print("Nam sinh: ");
            String ns = scanner.nextLine();
            System.out.print("Gioi tinh: ");
            String gt = scanner.nextLine();
            System.out.print("CCCD: ");
            String cccd = scanner.nextLine();
            System.out.print("Ma NS: ");
            String mns = scanner.nextLine();
            System.out.print("Nganh nghe: ");
            String nn = scanner.nextLine();
            System.out.print("Luong CB: ");
            double lcb = scanner.nextDouble();
            System.out.print("He SL: ");
            double hsl = scanner.nextDouble();
            Luong luong = new Luong(lcb, hsl);
            NhanSu nhansu = new NhanSu(mns, nn, luong, hoten, ns, gt, cccd);
            NSs.add(nhansu);

        }
    }
    public static void hienThi() {
        for(NhanSu ns : NSs) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20.2f\n",ns.Hoten, ns.NS, ns.GT, ns.CCCD, ns.Manv, ns.NganhNghe, ns.luong.getLuong() );
        }
    }
    public static class sapXep implements Comparator<NhanSu> {
        @Override
        public int compare(NhanSu ns1, NhanSu ns2) {
            return  Double.compare(ns1.luong.getLuong(), ns2.luong.getLuong());
        }
    }
}
