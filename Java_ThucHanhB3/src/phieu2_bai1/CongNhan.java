/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phieu2_bai1;

/**
 *
 * @author thanhlam02.haui
 */
public class CongNhan extends CanBo {
    protected String bac;

    public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    // Các getters và setters cho các thuộc tính

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    // Các phương thức khác
}
