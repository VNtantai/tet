package EXERCISES3;

public class bt13 {

	public static void main(String[] args) {
		String space ="";
		String line = "";
		String ch = "";
		String result = "";
		
		for (int a=1; a<5 ; a++) {
			space = "";
			ch = "";
			for (int b=0; b<a-1;b++) space += "  ";   
            for (int c =1 ; c<11;c ++  ) if (c<=2*(6-a)) {ch+="* ";}
            
            line = space + ch +"\n";
            result += line ;
	}
		System.out.print(result);
		String dong ="";
		String kq="";
		String kitu ="";
		String kc = "";
		for (int a = 5; a<8; a++) {
			kc = "";
			kitu = "";
			for (int b=1; b<= 7-a; b++ ) kc+="  ";
			for (int c=1;c<11;c++) if (c<=2*(a-2)) {kitu+="* ";}
			dong = kc + kitu + "\n";
			kq += dong;
		} System.out.println(kq);
	}
}
