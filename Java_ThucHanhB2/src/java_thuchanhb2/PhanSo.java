/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_thuchanhb2;

/**
 *
 * @author thanhlam02.haui
 */

import java.io.*;

public class PhanSo {
    protected int ts,ms;
    PhanSo(){}
    PhanSo(int tu , int mau){
      ts = tu;
      ms= mau;
      }
    static int nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return Integer.parseInt(str);
    }
    PhanSo nhapps(int x)throws IOException {
        int tu,mau;
        System.out.println("Nhap so phan so thu "+x);
        System.out.print("tu so: ");
        tu = nhapgt();
        System.out.print("Mau so: ");
        do {
            mau = nhapgt();
            if(mau==0)
                    System.out.print("nhap lai :");
        }
        while (mau == 0);
        PhanSo ps = new PhanSo(tu,mau);
        return ps;
    }
    static int UCLN(int a, int b) {
        while(a!=b)
            if(a>b)
                    a = a - b;
            else
                    b = b - a;
        return a;
    }
    static PhanSo toigian(PhanSo ps) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps.ts/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
        phanso.ms=ps.ms/UCLN(Math.abs(ps.ts),Math.abs(ps.ms));
        return phanso;

    }
    static PhanSo tong(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso= new PhanSo();
        phanso.ts=ps1.ts*ps2.ms+ps2.ts*ps1.ms;
        phanso.ms=ps1.ms*ps2.ms;
        if(phanso.ts!=0)
            phanso=toigian(phanso);
        return phanso;
    }
    static PhanSo hieu(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso=new PhanSo();
        phanso.ts=ps1.ts*ps2.ms-ps2.ts*ps1.ms;
        phanso.ms=ps1.ms*ps2.ms;
        if(phanso.ts!=0)
            phanso=toigian(phanso);
        return phanso;
    }
    static PhanSo tich(PhanSo ps1, PhanSo ps2) {

        PhanSo phanso=new PhanSo();
        phanso.ts=ps1.ts*ps2.ts;
        phanso.ms=ps1.ms*ps2.ms;
        if(phanso.ts!=0)
            phanso=toigian(phanso);
        return phanso;
    }
    static PhanSo thuong(PhanSo ps1,PhanSo ps2)
    {
        PhanSo phanso=new PhanSo();
        phanso.ts=ps1.ts*ps2.ms;
        phanso.ms=ps1.ms*ps2.ts;
        if(phanso.ts!=0)
            phanso=toigian(phanso);
        return phanso;
    }
    static void hthi(PhanSo ps)
    {
        if (ps.ms==1||ps.ts==0) System.out.println(ps.ts);
        else System.out.print(ps.ts+"/"+ps.ms);
    }
    public static void main(String args[])throws IOException{
        PhanSo ps1=new PhanSo();
        PhanSo ps2=new PhanSo();
        ps1=ps1.nhapps(1);
        ps2=ps2.nhapps(2);
        if(ps1.ts!=0)
            ps1=toigian(ps1);
        if(ps2.ts!=0)
            ps2=toigian(ps2);
        System.out.print("Phan so 1 o dang toi gian: ");
        hthi(ps1);
        System.out.println();
        System.out.print("Phan so 2 o dang toi gian: ");
        hthi(ps2);
    }
}

