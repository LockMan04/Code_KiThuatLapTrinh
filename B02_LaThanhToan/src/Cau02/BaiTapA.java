package Cau02;

import java.util.Scanner;

public class BaiTapA {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập họ tên: ");
		String hoten = hi.nextLine();
		System.out.println("Nhập giới tính: ");
		String gioitinh = hi.nextLine();
		
		if(gioitinh.toUpperCase().equals("NAM"))
		{
			System.out.println("*****************************");
			System.out.println("* Xin Chào Anh " + hoten + " *");
			System.out.println("*****************************");
		} 
		else
		{
			System.out.println("*****************************");
			System.out.println("* Xin Chào Chị " + hoten + " *");
			System.out.println("*****************************");
		}
	}
}
