package VongLapTrongJava;

public class VongLapDoWhile { // la vong lap thuc thi cau lenh truoc roi moi kiem tra dieu kien

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0 ;
		do {
			System.out.println(i);
			
			i= i+1; // gan i, sau moi vong lap tang them 1
			
		} while ( i< 5);
		
		System.out.println("End"); // ket qua in ra la 0 1 2 3 4 End
	//Vong lap mang
	int[] x = {1,2,3,4,5};
	
	int index = 0 ;
	
	do {
		
		System.out.println(x[index]); // ket qua in ra la 0 1 2 3 4 5
		
		index = index +1; // gan i, sau moi vong lap tang them 1
		
	} while (index<x.length); // phai nho hon chuoi
}	

}
