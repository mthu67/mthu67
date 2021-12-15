package VongLapTrongJava;

import java.util.Scanner;

public class DemoTraLoiCauHoi { // su dung vong lap + dieu kien
	
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		while (true) { // su dung vong lap while, lap di lap lai cho den khi  muon thoat cau hoi
			
			System.out.println("Java la ngon ngu bac cao ?");
			System.out.println("A. Dung");
			System.out.println("B. Sai");
			System.out.println("Nhap 'E' de thoat chuong trinh");
			
			String luaChon = scan.nextLine(); // nhan lenh nhap vao tu ban phim
			if (luaChon.equals("A")) { // equals lam ham so sanh hai chuoi trong java
				System.out.println("Ban tra loi dung");
				break;
			} else if (luaChon.equals("B")) {
				System.out.println("Ban tra loi sai");
				break;
			} else if (luaChon.equals("E")) {
				System.out.println("Chuong trinh ket thuc");
			   break;
		} else {
			System.out.println("Vui long lua chon dap an !");

				
			}	
			
		}
		
	}

}
