/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_thuchanhb2;

/**
 *
 * @author thanhlam02.haui
 */

import java.io.*;

class TaiLieu {
    protected String matl,nxb,sbph;
    TaiLieu(){}
}

class Sach extends TaiLieu {
    protected String tg,st;
    Sach(){}
}

class TapChi extends TaiLieu {
    protected String sph,tph;
    TapChi(){}
}

class Bao extends TaiLieu {
    protected String nph;
    Bao(){}
}

class QuanLySach {
    static String nhapgt()throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str =stream.readLine();
        return str;
    }
    
    static void nhaptl(TaiLieu tl)throws IOException {
        System.out.print("Ma tai lieu: ");
        tl.matl=nhapgt();
        System.out.print("NXB: ");
        tl.nxb=nhapgt();
        System.out.print("So ban phat hanh: ");
        tl.sbph=nhapgt();
    }
    
    static void nhapsach(Sach sh)throws IOException {
        nhaptl(sh);
        System.out.print("Ten tac gia: ");
        sh.tg=nhapgt();
        System.out.print("So trang: ");
        sh.st=nhapgt(); 
    }
    
    static void nhaptapchi(TapChi tc)throws IOException {
        nhaptl(tc);
        System.out.print("So phat hanh: ");
        tc.sph=nhapgt();
        System.out.print("Thang phat hanh: ");
        tc.tph=nhapgt();
    }
    
    static void nhapbao(Bao bao)throws IOException {
        nhaptl(bao);
        System.out.print("Ngay phat hanh: ");
        bao.nph=nhapgt();
    }
    
    static void hienthitl(TaiLieu tl) {
        System.out.println("Ma tai lieu: "+tl.matl);
        System.out.println("NXB: "+tl.nxb);
        System.out.println("So ban phat hanh: "+tl.sbph);
    }
    
    static void hienthisach(Sach sa) {
        System.out.println("----------SACH---------");
        hienthitl(sa);
        System.out.println("Ten tac gia: "+sa.tg);
        System.out.println("So trang: "+sa.st);
    }
    
    static void hienthitc(TapChi tc) {
        System.out.println("----------TAP CHI---------");
        hienthitl(tc);
        System.out.println("So phat hanh: "+tc.sph);
        System.out.println("Thang phat hanh: "+tc.tph);
    }
    
    static void hienthibao(Bao bao) {
        System.out.println("---------BAO----------");
        hienthitl(bao);
        System.out.println("Ngay phat hanh: "+bao.nph);
    }
    
    static int nhaplc()throws IOException {
        String a;
        System.out.print("Ten tai lieu: ");
        do{
            a=nhapgt();
            if (a.equalsIgnoreCase("sach")==false&&a.equalsIgnoreCase("tapchi")==false&&a.equalsIgnoreCase("bao")==false)
                System.out.print("Ban chi co the nhap sach/tapchi/bao: ");
        } 
        while (a.equalsIgnoreCase("sach")==false&&a.equalsIgnoreCase("tapchi")==false&&a.equalsIgnoreCase("bao")==false);
        if (a.equalsIgnoreCase("sach")) return 1;
        else
            if (a.equalsIgnoreCase("tapchi")) return 2;
            else
                if (a.equalsIgnoreCase("bao")) return 3;
            else return 0;
    }
    static void timtl(Sach sa,TapChi tc,Bao bao,int lc)throws IOException {
        switch(lc) {
            case 1:
                if(sa!=null)
                    hienthisach(sa);
                break;
            case 2:
                if(tc!=null)
                    hienthitc(tc);
                break;
            case 3:
                if(bao!=null)
                    hienthibao(bao);
                break;
            default: 
                System.out.println();
        }
    }
    
    public static void main(String args[])throws IOException {
        int n,ss=0,stc=0,sb=0;
        System.out.print("So tai lieu: ");
        n=Integer.parseInt(nhapgt());
        Sach [] SA=new Sach[n];
        TapChi [] TC=new TapChi[n];
        Bao [] BA=new Bao[n];
        for (int i=0;i<n;i++) {
            int lc=nhaplc();
            switch(lc) {
                case 1:
                    SA[ss]=new Sach();
                    nhapsach(SA[ss]);
                    ss++;
                    break;
                case 2:
                    TC[stc]=new TapChi();
                    nhaptapchi(TC[stc]);
                    stc++;
                    break;
                case 3:
                    BA[sb]=new Bao();
                    nhapbao(BA[sb]) ;
                    sb++;
                    break;
                default: System.out.println();
            }
        }
        System.out.println("----------HIEN THI----------");
        for (int i=0;i<n;i++) {
            if (SA[i]!=null) hienthisach(SA[i]);
            if (TC[i]!=null) hienthitc(TC[i]);
            if (BA[i]!=null) hienthibao(BA[i]);
        }
        System.out.println("------------Tim kiem-----------");
        int lc=nhaplc();
        for (int i=0;i<n;i++)
            timtl(SA[i],TC[i],BA[i],lc);
    }
}