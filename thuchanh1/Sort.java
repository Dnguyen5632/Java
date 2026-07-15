/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;

import java.awt.SystemColor;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Nguyeen
 */
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ds = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("So thu "+i+1+": ");
            ds[i] = sc.nextInt();
        }
        Arrays.sort(ds);
        System.out.print("Danh sach theo thu tu tang dan:");
        for(int x : ds){
            System.out.print(" "+x);
        }
        sc.close();
    }
}
