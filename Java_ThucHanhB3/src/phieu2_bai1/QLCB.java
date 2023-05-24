/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu2_bai1;

/**
 *
 * @author thanhlam02.haui
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private final ArrayList<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can bo: ");
        int soCanBo = sc.nextInt();
        for (int i = 0; i < soCanBo; i++) {
            System.out.print("Loai can bo (1 - Cong nhan, 2 - Ky su, 3 - Nhan vien phuc vu): ");
            int loaiCanBo = sc.nextInt();
            System.out.print("Ho ten: ");
            String hoTen = sc.next();
            System.out.print("Nam sinh: ");
            int namSinh = sc.nextInt();
            System.out.print("Gioi tinh: ");
            String gioiTinh = sc.next();
            System.out.print("Dia chi: ");
            String diaChi = sc.next();
            if (loaiCanBo == 1) {
                System.out.print("Bac: ");
                String bac = sc.next();
                CanBo cn = new CongNhan(hoTen, namSinh, gioiTinh, diaChi, bac);
                danhSachCanBo.add(cn);
            } else if (loaiCanBo == 2) {
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao = sc.next();
                CanBo ks = new KySu(hoTen, namSinh, gioiTinh, diaChi, nganhDaoTao);
                danhSachCanBo.add(ks);
            } else if (loaiCanBo == 3) {
                System.out.print("Cong viec: ");
                String congViec = sc.next();
                CanBo nv = new NhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec);
                danhSachCanBo.add(nv);
            } else {
                System.out.println("Khong hop le");
            }
        }
    }

    public void timKiemTheoHoTen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten can tim: ");
        String hoTenCanTim = sc.next();
        boolean timThay = false;
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equals(hoTenCanTim)) {
                System.out.println(cb.toString());
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay");
        }
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo cb : danhSachCanBo) {
            System.out.println(cb.toString());
        }
    }
    
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        qlcb.nhapThongTin();
        qlcb.hienThiDanhSachCanBo();
        qlcb.timKiemTheoHoTen();
    }
}

