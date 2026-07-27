/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package quanlygiay;

import java.util.List;

/**
 *
 * @author Nguyeen
 */
public interface IGiay {
    default void HienThiDS(List<Giay> dsGiay){
        if(dsGiay.isEmpty()){
            System.out.println("Khong co san pham nao");
            return;
        }
        for(Giay g : dsGiay){
            System.out.println(g.toString());
        }
        
    }
    
    default void ThemGiay(List<Giay> dsGiay, Giay giay){
        try{
            dsGiay.add(giay);
            System.out.println("Them san pham thanh cong");
        }
        catch (Exception e) {
            System.out.println("Danh sach khong ton tai");
        }
    }
    
    default boolean XoaGiay(List<Giay> dsGiay, String TenGiay){
        for(int i=0;i<dsGiay.size();i++){
            if(dsGiay.get(i).getTenGiay().equalsIgnoreCase(TenGiay)){
                dsGiay.remove(i);
                return true;
            }
        }
        return false;
    }
}
