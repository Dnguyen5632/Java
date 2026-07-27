/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiay;

/**
 *
 * @author Nguyeen
 */
public class GiayDa extends Giay{
    private String ChatLieuDa;
    private int ChieuCaoGot;

    public GiayDa() {
        super();
    }
    
    public GiayDa(String TenGiay, String ThuongHieu, String MauSac, int Gia, int KichCo, int SoLuong, String ChatLieuDa, int ChieuCaoGot){
        super(TenGiay, ThuongHieu, MauSac, KichCo, Gia, SoLuong);
        this.ChatLieuDa = ChatLieuDa;
        this.ChieuCaoGot = ChieuCaoGot;
    }

    public String getChatLieuDa() {
        return ChatLieuDa;
    }

    public void setChatLieuDa(String ChatLieuDa) {
        this.ChatLieuDa = ChatLieuDa;
    }

    public int getChieuCaoGot() {
        return ChieuCaoGot;
    }

    public void setChieuCaoGot(int ChieuCaoGot) {
        this.ChieuCaoGot = ChieuCaoGot;
    }
    
    @Override
    String GiamGia(){
        if(getGia() >= 2000000){
            return "Giam gia 10%";
        }
        else{
            return "";
        }
    }
}
