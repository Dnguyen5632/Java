/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiay;

/**
 *
 * @author Nguyeen
 */
public abstract class Giay {
    private String TenGiay;
    private String ThuongHieu;
    private String MauSac;
    private int KichCo;
    private int Gia;
    private int SoLuong;
    
    public Giay(){
    }
    
    public Giay(String TenGiay, String ThuongHieu ,String MauSac ,int KichCo ,int Gia ,int SoLuong){
        this.TenGiay = TenGiay;
        this.ThuongHieu = ThuongHieu;
        this.MauSac = MauSac;
        this.KichCo = KichCo;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        
    }

    public String getTenGiay() {
        return TenGiay;
    }

    public void setTenGiay(String TenGiay) {
        this.TenGiay = TenGiay;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String ThuongHieu) {
        this.ThuongHieu = ThuongHieu;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public int getKichCo() {
        return KichCo;
    }

    public void setKichCo(int KichCo) {
        this.KichCo = KichCo;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    abstract String GiamGia();
}
