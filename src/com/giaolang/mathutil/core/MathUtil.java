/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtil {
    
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học 
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4... n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
//    
//        long product = 1; //tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
//        for (int i = 2; i <= n; i++)
//            product *= i; //product = product * i;
//        
//        return product;
//        
//    }
    
    //Học đệ quy trong vòng 30s - RECURSION
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa... đến điểm dừng
    
    //tính giùm tui 6!
    //n! = 1.2.3.4.5.6. ... .n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!  //điểm dừng
    //1! = 1;
    
    //quy ước 1! = 0! = 1;
    
    //chốt hạ: n! = n * (n - 1)!
    
     public static long getFactorial(int n) {
         
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20. Plz!");
         
        if (n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
    
        return n * getFactorial(n - 1); //công thức đệ quy
        
    }
    
}
