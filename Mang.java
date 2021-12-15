package VongLapTrongJava;

public class Mang {
	//Mang la tap hop cac phan tu co cung kieu du lieu
	public static void main(String[] args) {
		
		int x1 = 10;
		int x2 = 20;
		int x3 = 30;
		
		int [] mangX = new int[3];
		
		mangX[0]= 5;
		mangX[1]=10;
		mangX[2]=15;
		
		System.out.println(mangX[0]);
		
		System.out.println(mangX[1]);
		
		System.out.println(mangX[2]);
		// co the cong tru nhan chia
		
		long[] mangLong = { 4,5,6,7,8};// vi tri  bat dau tu 0
		
		System.out.println(mangLong[3]);// so 6 o vi tri 3
		//.length de goi do dai chuoi
		// example: System.out.println(mangLong.length);
	}


}
