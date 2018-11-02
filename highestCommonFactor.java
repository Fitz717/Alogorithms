import java.util.*;

public class highestCommonFactor {

	//Euclid's  algorithm
	
	int gcd(int p,int q ) {
		if(q==0) return p;
		int r=(p%q);
		return gcd(q,r);
	}
	
	public static void main(String[] args) {
		
		 highestCommonFactor h1=new highestCommonFactor();
		 Scanner sc=new Scanner(System.in);
		 
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int result=h1.gcd(num1,num2);
		 
		 System.out.println(result);
	}

}
