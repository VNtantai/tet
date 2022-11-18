package EXERCISES3;

public class bt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n =100;
	        int a = 1;
	        for (int i = 1 ; i <= n ; i++) { 
	            if ( i % 7 == 0){
	                if ( i > a ) a = i;
	            }
	        }
	        System.out.println(a);
	}

}
