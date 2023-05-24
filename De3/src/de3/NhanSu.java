
package de3;


public class NhanSu extends Nguoi {
    protected String Manv, NganhNghe;
    protected Luong luong;

    public NhanSu(String Manv, String NganhNghe, Luong luong, String Hoten, String NS, String GT, String CCCD) {
        super(Hoten, NS, GT, CCCD);
        this.Manv = Manv;
        this.NganhNghe = NganhNghe;
        this.luong = luong;
    }
    
}
