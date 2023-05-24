
package de3;


public class Luong {
    protected double LuongCB, HSL, luong;

    public Luong(double LuongCB, double HSL) {
        this.LuongCB = LuongCB;
        this.HSL = HSL;
        this.luong = HSL * LuongCB;
    }

    public double getLuong() {
        return HSL * LuongCB;
    }
    
    public Luong() {
    }
    
}
