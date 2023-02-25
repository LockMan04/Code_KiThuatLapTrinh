package Cau01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaiTapD {
	public static void main(String[] args) throws IOException {
		InputStreamReader hi = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(hi);

		System.out.println("Nhập cạnh thứ nhất: ");
		float c1 = Float.parseFloat(buff.readLine());
		System.out.println("Nhập cạnh thứ hai: ");
		float c2 = Float.parseFloat(buff.readLine());
		System.out.println("Nhập cạnh thứ ba: ");
		float c3 = Float.parseFloat(buff.readLine());

		if (c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1) {
			float p = (c1 + c2 + c3) / 2;
			float C = p * 2;
			float S = (float) Math.sqrt(p * (p - c1) * (p - c2) * (p - c3));
			
			System.out.println("Diện tích là: "+ C);
			System.out.println("Chu vi là: "+ S);
		}
		else {
			System.out.println("Ba cạnh đó không phải là tam giác");
		}
	}
}
