/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiay;

/**
 *
 * @author Nguyeen
 */
public class GiayTheThao extends Giay{
    private String LoaiMonTheThao;
    private String LoaiDe;
    
    public GiayTheThao(){
        
    }
    
    public GiayTheThao(String TenGiay, String LoaiGiay, String MauSac, int KichCo, int Gia, int SoLuong, String LoaiMonTheThao, Sting LoaiDe){
        super(TenGiay, LoaiGiay, MauSac, KichCo, Gia, SoLuong);
        this.LoaiMonTheThao = LoaiMonTheThao;
        this.LoaiDe = LoaiDe;
    }

    public String getLoaiMonTheThao() {
        return LoaiMonTheThao;
    }

    public void setLoaiMonTheThao(String LoaiMonTheThao) {
        this.LoaiMonTheThao = LoaiMonTheThao;
    }

    public String getLoaiDe() {
        return LoaiDe;
    }

    public void setLoaiDe(String LoaiDe) {
        this.LoaiDe = LoaiDe;
    }
    
    
    
    
}
