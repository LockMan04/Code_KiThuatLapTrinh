package Cau02;

import java.util.Scanner;

public class BaiTapC {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập quãng đường AB: ");
		float q = hi.nextFloat();
		System.out.println("Nhập vận tốc: ");
		float v = hi.nextFloat();
		
		System.out.println("Thời gian cần phải đi là: "+ q/v);
	}
}
