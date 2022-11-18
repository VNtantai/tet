package EXERCISES3;

public class bt14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dong ="";
		String kq="";
		String kitu ="";
		String kc = "";
		for (int a = 0; a<7; a++) {
			kc = "";
			kitu = "";
			for (int b=1; b<= 7-a; b++ ) kc+="    ";
			for (int c=2; c<9; c++) if (c<=2*(a-2)) kitu+=" *  ";
			dong = kc + kitu + "\n";
			kq += dong;
		} System.out.println(kq);
		
	}

}
