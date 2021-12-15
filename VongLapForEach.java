package VongLapTrongJava;

public class VongLapForEach { // (For Enhanced) // lap cac phan tu trong mang va in ra gia tri du lieu/ dung cho code sap xep du lieu va giai thuat
	
	public static void main(String[] args) {
		
		int [] mang= {1,2,3,4,5}; // in ra mang so // sytax: int [] mang={number};
		
		for(int x : mang) {
			
			System.out.println(x);
		}
		
		String[] str = {"hello", "For", "Each"}; // in ra mang chu // sytax: String [] str={abc...};
		
		for(String x : str) {
			
			System.out.println(x);
		}
	}

}
