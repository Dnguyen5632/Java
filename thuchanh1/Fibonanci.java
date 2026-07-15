/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;

/**
 *
 * @author Nguyeen
 */
public class Fibonanci {
    public static void main(String[] args) {
        int a=0, b=1;
        int c;
        System.out.print("90 so Fibonanci dau tien la:");
        for(int i=1;i<=90;i++){
            System.out.print(" "+b);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
