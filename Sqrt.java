
import java.util.*;
public class Sqrt {

	public Sqrt(double N) {
		
		if(N<0)
			System.out.println(false);
		
		double err=1e-15;
		double T=N;
		   
		while(Math.abs(N=T/N)>T*err) 
			T=(N/T+T)/2.0;
		System.out.println(T);
		
}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sqrt s1=new Sqrt(sc.nextDouble()); 
		
	}

}
