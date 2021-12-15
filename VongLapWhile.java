package VongLapTrongJava;

public class VongLapWhile { // kiem tra dieu kien truoc khi thuc hien
	
	public static void main(String[] args) {
		
		int i = 0; // gan i = 0
		
		while (i< 20) { // dieu kien x < 20, moi thuc hien cau lenh
		
		System.out.println(i);
		
		i = i + 1; // i +1 sau moi vong lap
	}
	
	     System.out.println("End");
	// vong lap while su dung trong mang     
	     int[]x= {1,2,3,4,5,6,7};  // chuoi so
	     
	     int index = 0; // gan index=0
	     
	     while (index<x.length) { // dieu kien index< chuoi so
	    	 
	    	 System.out.println(x[index]); // ket qua in ra la 1 2 3 4 5 6 7
	    	 
	    	 index = index +1 ; // + 1 sau moi vong lap
	    	 
	     }
	
}
}


