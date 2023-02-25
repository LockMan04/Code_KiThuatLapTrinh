package Cau01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaiTapB {
	public static void main(String[] args) {

		try {
			InputStreamReader hi = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(hi);

			System.out.println("Nhập số lượng: ");
			int sl = Integer.parseInt(buff.readLine());
			System.out.println("Nhập đơn giá: ");
			float dg = Float.parseFloat(buff.readLine());
			System.out.println("Nhập thuế suất: ");
			float ts = Float.parseFloat(buff.readLine());

			System.out.println("Số tiền phải trả là: " + (sl * dg * ts));
		} catch (IOException e) {
			System.out.println("...");
		} catch (NumberFormatException e) {
			System.out.println("Lỗi Nhập");
		}
	}
}
