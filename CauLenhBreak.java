package VongLapTrongJava;

public class CauLenhBreak {
	
	public static void main(String[] args) {
		
		for ( int i = 0; i <10; i++) { // su dung trong vong lap for // gan i=0, i nho hon 10, i tang dan
			
			System.out.println(i); // vong lap dau tien i=0
			
		break; // dung lai tai i =0, ket thuc vong lap
		
		} 
		
		for ( int k = 0; k<10; k++) {
			System.out.println(k);
			if(k==5) { // dung cau dieu kien
				
				break; // khi k =5 ket thuc vong lap
			}
			}
		int x =1; 
		switch (x) { //// su dung trong cau dieu kien switch
		case 1: System.out.println(x); // in ra gia tri x
		break; // cau lenh dung ket thuc vong lap suy ra gia tri cua x
		}
		// hai vong lap

		for ( int i =0;i<5; i++) { 	// cau lenh break chi co tac dung trong vong lap hien tai VD: co hai vong lap nhu sau
			
			System.out.println("gia tri cua i la " +i); // vong lap 1
			
		for ( int j = 0; j<5; j++) {
			
			System.out.println("gia tri cua j la "+ j); // vong lap 2
			break; // chi co tac dung voi vong lap j, con vong lap i van chay
}
		}

	}
	}

