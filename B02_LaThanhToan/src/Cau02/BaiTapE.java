package Cau02;

import java.util.Scanner;

public class BaiTapE {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập tổng số tiền đã tiêu: ");
		float tien = hi.nextFloat();
		System.out.println("Nhập số người trong nhóm: ");
		int nguoi = hi.nextInt();
		
		float chia = (float) tien / nguoi;
		
		System.out.printf("Mỗi thành viên phải đóng góp %f đ", chia);
	}
}
