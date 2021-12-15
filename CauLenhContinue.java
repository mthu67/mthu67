package VongLapTrongJava;

public class CauLenhContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i =0; i <10; i ++) { // vong lap for
			
			if ( i<5) {
				continue; // tiep tuc vong lap bo qua cac cau lenh ben duoi no
			}
			System.out.println(i);
		}
		// tuong tu cau lenh break
		for (int i=0; i<5; i++) {
			System.out.println("gia tri cua i la "+i);
			
		for(int j =0; j<5; j++) {
			if(j>0) {
				continue;
			}
			System.out.println("Gia tri cua j la "+j);
		}
		}
	}

}
