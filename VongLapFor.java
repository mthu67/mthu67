package VongLapTrongJava;

public class VongLapFor { 
	
	public static void main(String[] args) {
		// cach viet vong lap for 1
		for (int i =0; i <5; i +=2) { //vong lap for co 3 bien// 1.khai bao gan gia tri i // 2.dieu kien cua bien 1// 2.tang gia tri cua bien 
			
			System.out.println(i);
		}
		
		    System.out.println("End"); // ket qua in ra 0 2 la 4 End
	    // cach viet vong lap for 2
		    
			int x = 0; // gan i = 0
			
			for(;x <5 ;) { //";" la cau lenh trong, dieu kien x nho hon 5
				
				System.out.println(x); // ket qua in ra la 4
				
				x+=4; // moi vong lap tang + them 4
			}

			
			for (int i =0; i <5; i++) { // gan i =0, i tang dan, i nho hon 5
			
			System.out.println(i); // ket qua in ra la 0 1 2 3 4
					
			}
			
			for (int i =5; i>0; i-- ) { // gan i =0, i giam dan, i nho hon 5
				
				System.out.println(i); // ket qua in ra la  5 4 3 2 1
			}
			// vong lap for su dung trong mang
			int []x1= { 1,2,3,4,5}; // cho chuoi so x1
			
			for(int i =0; i <x1.length; i++) { // gan i=0, i < chuoi so, i tang dan
				
				System.out.println(x1[i]); // ket qua in ra la 1 2 3 4 5
			}
	}
}
				






