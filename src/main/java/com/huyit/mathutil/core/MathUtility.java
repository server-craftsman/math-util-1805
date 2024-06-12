/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huyit.mathutil.core;

/**
 *
 * @author WINDOWS-10
 */
public class MathUtility {
    // ta sẽ viết những hàm toán học cung cấp cho bên ngoài sử dụng
    // giống như thư viện Math. của java
    //Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    //thì sẽ dc thiết kế là static!!!
    //static sẽ dc gọi là trực tiếp qua tên CLass
    
    //Hàm tính n! = 1.2.3.4...n
    //n 0...20; do 21! tràn kiểu long, ko có âm giai thừa
    //0! = 1
    public static long getFactorial(int n) {
       
        //sửa lại từ 10 thành 1 để có màu xanh trở lại
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        
        if(n == 0 || n == 1)
            return 1;
        //code chạy đến đây, n = 1...2...20
//        for (int i = 1; i <= n; i++) {
//            product *= i;// product = product * i          
//        }
//        return product;
    return n * getFactorial(n - 1);
    //n! = n * (n - 1) //stack LIFO - last in first out
    }
    //HỌC VỀ REGRRESSION TEST - KIỂM THỬ HỒI QUY
    //KIỂM THỬ LẠI NHỮNG THỨ ĐÃ TỪNG KIỂM THỬ, THÌ TẠI SAO PHẢI LÀM ĐIỀU NÀY
    //LÝ DO: CODE ĐANG ỔN, MÀ KO ĐỤNG VÀO NÓ, THÌ NÓ VẪN ỔN
    //  NHƯNG NẾU CÓ FIX BUG, CÓ SỬA HÀM, CÓ TỐI ƯU THUẬT TOÁN TRONG HÀM, THÌ HÀM CẦN PHẢI DC
    //  TEST LẠI - TEST LẠI THỨ ĐÃ TỪNG TEST
    //  TEST LẠI HÀM ĐÃ TỪNG TEST, ĐỂ XÁC NHẬN RẰNG NÓ CÒN NGON - CÒN XANH
    //  HAY KO SAU KHI CODE SỬA
    
    //NẾU CÓ UNIT TEST CODE (JUNIT) VIỆC TEST LẠI CODE CỰC NHANH
    //CHỈ CẦN THẤY MÀU XANH CỦA CÁC JUNIT TEST CASE DC RUN LÀ ĐỦ
    //NHANH NỮA: ĐỨA UNIT TEST KÊN GITHUB, CÀI CI SCIPT ( FILE YAML YML) VÀO
    //MỌI THỨ TỰ ĐỘNG BÁO XANH ĐỎ LUÔN
    
    //KIỂM THỬ LẠI NHỮNG THỨ ĐÃ KIỂM THỬ GỌI LÀ TEST HỒI QUY - REGRESSION TEST
    //NÊN DÙNG TỰ ĐỘNG BẰNG CÁCH XÀI UNIT TEST FRAMEWORK
    //NHÌN = MẮT TỪ HÀM MAIN() CÁCH TRUYỀN THỐNG LÀ KO NÊN
    
    //5! = 1.2.3.4.5 = 1.2.3.4      .5
    //                      4!      .5
    //5! = 5 X 4!
    //RETURN DC HIỂU LÀ =
    //N! = N X (N - 1)!
    //CÔNG THỨC ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //CON BÚP BÊ NGƯỜI NGA
}

//using rrecursion to demonstrate regression test