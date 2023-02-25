package Cau01;

import java.io.*;

public class BaiTapA {
	public static void main(String[] args) {

		try {
			InputStreamReader hi = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(hi);

			System.out.println("Hãy nhập bán kính: ");
			String s = buff.readLine();
			int r = Integer.parseInt(s);
			final double PI = 3.14159;

			double C = PI * 2 * r;
			double S = PI * r * r;

			System.out.println("Chu Vi: " + C);
			System.out.println("DIện Tích: " + S);

		} catch (IOException e) {
			System.out.println("...");
		}
	}
}
