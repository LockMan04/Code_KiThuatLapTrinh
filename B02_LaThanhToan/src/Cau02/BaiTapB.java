package Cau02;

import java.util.Scanner;

public class BaiTapB {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		float a = hi.nextFloat();
		System.out.println("Nhập b: ");
		float b = hi.nextFloat();
		System.out.println("Nhập c: ");
		float c = hi.nextFloat();
		
		if(a == 0) {
			if(b == 0) {
				if (c == 0) {
					System.out.println("PT vô số nghiệm");
				} else
				System.out.println("PT vô nghiệm");
			} else
			System.out.println("PT vô nghiệm");
		} else
		System.out.println("PT có nghiệm: "+ (float) ((c - b)/a));
	}
}
