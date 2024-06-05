/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huyit.mathutil.core.test;

import com.huyit.mathutil.core.MathUtility;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//QUY ƯỚC ĐẶT TÊN PACKAGE CỦA JAVA
//TÊN MIỀN ĐẢO NGƯỢC LÀ, CHỮ THƯỜNG 100%
//com.company trên mạng
//com.têncty.tên-dự-án.tên-module.tên-class-sẽ-dùng
//com.microsoft.sqlserver.jdbc
//org.junit.jupiter.api.Test;
//com.giaolang.mathutil.core

//C# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sqlserver...

//NodeJS, ReactJS có cách riêng
//coding convention for ...

/**
 *
 * @author WINDOWS-10
 */
public class MathUltilTest {
    
    public MathUltilTest() {
    }
    
   //Ở ĐÂY CHỨA CÁC LỆNH CÁC HÀM DÙNG ĐỂ ĐI TEST HÀM CHÍNH Ở BÊN CODE CHÍNH
    //Ở BÊN THƯC MỤC SOURCE PHÍA TRÊN COI HÀM CHỴ ỔN KO!!
    //Ở ĐÂY TA LÀM CÁC HÀM ỨNG VỚI CÁC TEST CASE ĐỂ TEST CODE CHÍNH Ở BÊN
    //MathUtility. ví dụ: getFactorial()
    
    //TEST CASE LÀ 1 BỘ DATA ĐƯA VÀO HÀM, APP ĐỂ VERIFY VÀO HÀM, APP CÓ XỬ LÍ
    //ĐÚNG HAY KO, NÓ ĐI KÈM THEO CÁC XÀI HÀM, TRÌNH TỰ XÀI APP + EXPECTED VALUE
    //STATUS TEST CASE PASSED HAY FAILED
    
    //TEST CASE #1: CHECK GETFACTORIAL WITH N = 0, 0!
    //HOPES TO SEE 1 RETURNED
    @Test 
    public void testFactorialGivenRightArg0ReturnsWell(){
        int n = 0; //given right argument
        long expectedValue = 1; //hy vọng n! 0! ==> 1
        long actualValue;//đoán xem trả về mấy
        //nếu expected == actual, hàm ngon với case này
        
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        //cách cũ là phải sout() tùng cái 1 và dùng mắt dể nhìn đúng sai
    }
    
    //TEST CASE #2: CHECK GETFACTORIAL WITH N = 1, EXPECETED => 1! = 1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        int n = 1;
        long expectedValue = 1; //1 giai thừa hi vọng 1
        long actualValue; // =??? // chờ xem hàm
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);
    }
    
    //TEST CASE #3: CHECK GETFACTORIAL WITH N = 2, EXPECETED => 2! = 2
    //                                     N = 3                3! = 6
    //                                     N = 5                5! = 120
    @Test
    public void testFactorialGivenRightArg235ReturnsWell() {
        int n = 2;
        long expectedValue = 2; //1 giai thừa hi vọng 1
        long actualValue; // =??? // chờ xem hàm
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue); //2!
        assertEquals(6, MathUtility.getFactorial(3)); //2!
        assertEquals(120, MathUtility.getFactorial(5)); //2!
    }
    
    // TEST #4: CHECK IF GETFACTORIAL RETURNS EXCEPTION IF WE PASS N < 0
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
        //Input n < 0, cụ thể n = -1
        //Expected result: Illegal Argument Exception
        //nhớ quy ước: màu xanh là trả về như kì vọng, 
        //màu đỏ: actual != kì vọng
        //Ngoại lệ Exception ko là value, ta ko khai báo biến để = ngoại lệ
        //ko assertEquals(value value value)
        assertThrows(IllegalArgumentException.class, // hàm trả về như đúng thiết kế
                () -> {MathUtility.getFactorial(-1);}); // mày có thể hiện exception hay ko
    }
}

// PHẦN KIẾN THỨC BỔ SUNG VÀO CV - TRÊN YOUTUBE GIÁO LÀNG CÓ HƯỚNG DẪN CÁCH  VIẾT CV
//TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE
//ĐỂ KIỂM THỬ NGAY NHÓM CODE MÌNH VỪA VIẾT
//TỨC LÀ CODE CỦA MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
//KẾT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH - CODE NGON, PASS CÁC TEST CASE
//MÀU ĐỎ - CODE ĐÃ KO PASS TEST CASE
//VIỆC NÀY CỨ LÀM LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST
//CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD

//MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP 
//TEST CODE 2 MÀU XANH ĐỎ 
//GỌI LÀ UNIT TESTING FRAMEWORK
//MỌI NGÔN NGỮ ĐỀU HỘ TRỢ TDD. VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
//NHÓM LÀM OBS CÓ XÀI

//ĐỀ BÀI THUYẾT TRÌNH NHÓM
//NHÓM HÃY CHỌN 1 UNIT TEST FRAMEWORK ĐỂ DEMO
//VÀO GOOGLE GÕ UNIIT TESTING FRAMEWORK FOR <NNLT>, RA KQ
//C#: NUNIT, XUNIT, MS TEST
//JAVA: TESTNG
//JS: MOCHA,JASMINE


//DÒNG THỨ 2 TRONG CV
//DDT - DATA DRIVEN TESTING (ĐỪNG NHẦM VỚI TDD - TEST DRIVEN DEVELOPMENT Ở TRÊN)
//                          TỪ TƯƠNG ĐƯƠNG PARAMETERIZED TETSING
//          VIẾT TEST CASE THEO STYLE THAM SỐ HOÁ
//DDT LÀ PHẦN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỔ CHỨC
// CÁC TEST CASE KHI VIẾT CODE UNIT TEST, NÓ CÓ BÀ CON VỚI TDD

//DDT - PARAMETERIZED TESTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE
//MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH ASSERT()
//CHO DỄ QUẢN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//DỂ THEO DÕI CÁC PHẦN CODE LIÊN QUAN ĐẾ TEST HÀM
//VÌ CÂU LỆNH SO SÁNH EXPECTED VS. ACTUAL TRỞ NÊN GỌN NHẸ HƠN