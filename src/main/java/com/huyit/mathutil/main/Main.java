/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huyit.mathutil.main;

import com.huyit.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS-10
 */
public class Main {
    //psvm 
//    public static void main(String[] args) {
//        //ĐÂY LÀ NƠI TEST HÀM
//        //VIẾT RA CÁC TEST CASE: BỘ DATA ĐẦU VÀO VÀ GIÁ TRỊ KÌ VỌNG
//        //LÁT HỒI SO SÁNH VỚI GIÁ TRỊ THỰC TẾ MÀ HÀM TRẢ VỀ!!!
//        //TEST CASE#1: n = 1 | 0! = hy vọng == 1 | thực tế chờ hàm trả về 
//        int n = 0;
//        long expectedValue = 1; // hy vọng 0! trả về 1
//        long actualValue; // chờ hàm trả về mấy khi tính
//        actualValue = MathUtility.getFactorial(n);
//        
//        //so sánh giữa expected vs actual coi có == nhau hay ko
//        System.out.println("0! | Expected: " + expectedValue + 
//                " Actual: " + actualValue);
//        
//        
//        //TEST CASE #2: 1! TA HY VỌNG HÀM TRẢ 1 LUÔN!!!
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue +
//                " Actual: " + actualValue);
//        
//        //TEST CASE #3: 5! TA HY VỌNG HÀM TRẢ 120!!!
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue +
//                " Actual: " + actualValue);
//        
//        //TEST CASE #4: -1! TA HY VỌNG HÀM NÉM RA NGOẠI LỆ!!!
//        //DO -1 KO TÍNH DC GIAI THỪA, ĐƯA DATA CÀ CHỚN, HÀM SẼ
//        //NÉM RA NGOẠI LỆ
//        n = -1;
//        //expectedValue = HÀM TUNG RA NGOẠI LỆ;
//        System.out.println("Check getF(-1) to see exception!");
//        actualValue = MathUtility.getFactorial(n);
//        //VÌ NGOẠI LỆ KO PHẢI BIẾN ĐỂ NÉM VÀO
//        //HY VỌNG SẼ THẤY NGOẠI LỆ XUẤT HIỆN
//        
//    }

    //this method is written derectly in server to simulate
    //the work of another team memeber, he uploads code before me
    public static void SayHiFromLocal() {
    }
    public static void main(String[] args) {
        //CÁCH KIỂM THỬ 2 - GIỐNG CÁCH 1
        //Test case #1: Check if 0! returns 1
        int n = 0;
        long expectedResult = 1; //0! ==1
        long actualResult =  MathUtility.getFactorial(n);
        String msg = "0! = | Expected: " + expectedResult + 
                " Actual: " + actualResult;     
        JOptionPane.showMessageDialog(null, msg);
    }

}
