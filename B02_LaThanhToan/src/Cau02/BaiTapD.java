package Cau02;

import java.util.Scanner;

public class BaiTapD {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập số lít xăng: ");
		float lit = hi.nextFloat();
		
		System.out.println("Số tiền phải trả là: "+ lit*19980 +"đ");
	}
}
