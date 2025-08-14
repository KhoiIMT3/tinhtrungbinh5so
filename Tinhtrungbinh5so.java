package bai14_tong_ket;

/*
 * Mục đích: tính giá trị trung bình 5 số nhập từ bàn phím.
 * Ngày: 14/8/2025
 * */

import java.util.Scanner;

public class Tinhtrungbinh5so {

	public static void main(String[] args) {
		/* Đầu vào: 5 số		Đầu ra: giá trị trung bình của 5 số
		 * B1: khai báo 5 biến soThuNhat, soThuHai, soThuBa, soThuTu, soThuNam, tong, trungBinh.
		 * B2: Khoi tao tong = 0.
		 * B3: Nhập vào số thứ nhất.
		 * B4: tong+=soThuNhat.
		 * B5: Nhập vào số thứ hai.
		 * B6: tong+=soThuHai. 
		 * B7: Nhập vào số thứ ba.
		 * B8: tong += soThuBa.
		 * B9: Nhập vào số thứ tư.
		 * B10: tong += soThuTu.
		 * B11: Nhập vào số thứ năm.
		 * B12: tong += soThuNam.
		 * B13: trungBinh = tong / 5.
		 * */
		int soThuNhat;
		int soThuHai;
		int soThuBa;
		int soThuTu;
		int soThuNam;
		int tong = 0;
		float trungBinh;
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhập vào số thứ nhất: ");
		soThuNhat = Integer.parseInt(nhap.nextLine());
		tong += soThuNhat;
		
		System.out.println("Nhập vào số thứ hai: ");
		soThuHai = Integer.parseInt(nhap.nextLine());
		tong+=soThuHai;
		
		System.out.println("Nhập vào số thứ ba: ");
		soThuBa = Integer.parseInt(nhap.nextLine());
		tong += soThuBa;
		
		System.out.println("Nhập vào số thứ tư: ");
		soThuTu = Integer.parseInt(nhap.nextLine());
		tong += soThuTu;
		
		System.out.println("Nhập vào số thứ năm: ");
		soThuNam = Integer.parseInt(nhap.nextLine());
		tong += soThuNam;
		
		trungBinh = (1.0f)*tong / 5;
		System.out.println("Trung bình của 5 số là: " + trungBinh);
		//test: 1,2,3,4,5 -> 3
		//test: 1,2,3,6,7 -> 3.8
	}

}
