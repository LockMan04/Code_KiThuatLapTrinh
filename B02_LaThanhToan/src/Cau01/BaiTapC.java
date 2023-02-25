package Cau01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaiTapC {
	public static void main(String[] args) throws IOException{
		InputStreamReader hi = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(hi);
		float cd, cr;
		
		do {
		System.out.println("Nhập chiều dài HCN: ");
		cd = Float.parseFloat(buff.readLine());
		System.out.println("Nhập chiều rộng HCN: ");
		cr = Float.parseFloat(buff.readLine());
		if (cd < cr)
			System.out.println("Có vẻ nhầm lẫn, nhập lại đi chời");
		} while (cd < cr);
		
		System.out.println("Chu vi HCN: "+ ((cd + cr)* 2));
		System.out.println("Diện tích HCN: "+ (cd * cr));
	}
}
