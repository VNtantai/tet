package EXERCISES3;

public class bt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int h =4 ;
	        for (int i = 1; i <= h; i++) {
	            for ( int  j = 1; j <= h + i - 1; j++){
	                if (j <= h -i) System.out.print("    ");
	                else System.out.print(" *  ");
	            }
	            System.out.println();
	        }

	        for (int i = h-1 ; i >0 ; i--) {
	            for ( int  j = 1 ; j <= h + i - 1 ; j++){
	                if (j <= h -i) System.out.print("    ");
	                else System.out.print(" *  ");
	            }
	            System.out.println();
	        }

	    }
	}