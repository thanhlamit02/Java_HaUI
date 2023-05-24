/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu2_bai2;

/**
 *
 * @author thanhlam02.haui
 */
import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        danhSachTaiLieu = new ArrayList<>();
    }

    // Phương thức nhập thông tin về tài liệu
    public void nhapThongTin(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    // Phương thức hiển thị thông tin về các tài liệu
    public void hienThiThongTin() {
        // Hiển thị thông tin cho từng tài liệu trong danhSachTaiLieu
    }

    // Phương thức tìm kiếm tài liệu theo loại
    public ArrayList<TaiLieu> timKiemTaiLieu(Class<?> loaiTaiLieu) {
        ArrayList<TaiLieu> ketQua = new ArrayList<>();
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (loaiTaiLieu.isInstance(taiLieu)) {
                ketQua.add(taiLieu);
            }
        }
        return ketQua;
    }
}

