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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
public class MathUtilityDDTTest {

    //CHUẨN BỊ DATA, SAU NÀY ĐƯA VÀO HÀM ASSERT() CỦA FRAMEWORK
    //DATA NÀY SẼ TỪ TỪ DC TRÍCH VÀO TRONG HÀM ASSERT()
    //NÓ NẰM TRONG HÀM CÓ STYLE LÀ STATIC - NẰM CỐ ĐỊNH Ở 1 VÙNG RAM
    //Test Case
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720
    //ta thấy có các bộ data
    // {0,1}, {1, 1}, {2,2}, {3,6}, {4, 24}, {5, 120}, {6, 120}
    //  [7][2]
    //ta để riêng data này ra 1 mảng 2 chiều
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    //Test case so sánh hàm có trả về kì vọng ko
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
