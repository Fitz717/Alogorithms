import java.util.*;
public class isPrimer {


	
	public isPrimer(int nextInt) {
		
		if(nextInt<2) System.out.println(false);
		for(int i=2;i*i<=nextInt;i++) 
			if(nextInt%i==0) 
				System.out.println(false);
		System.out.println(true);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		isPrimer i1=new isPrimer(sc.nextInt());
		

	}

}
