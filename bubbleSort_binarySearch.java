//Sort
public class BubbleSort {

	void bubbleSort(int a[]){
		
		int temp;
		
	for(int j=0;j<a.length-1;j++) {

			for(int i=0;i<a.length-1-j;i++) {
				boolean flag=true;
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=false;
			}
				if(flag) {
					break;
				}
		}	
	}
}

//Search
	
	int binarySearch(int a[],int value) {
		int low=0;
		int high=a.length-1;
		   
		   while(low<=high) {
			   int mid =(low+high)/2;
			   		if(value==a[mid]) {
			   			return mid;
			   		}
			   		if(value>a[mid]) {
			   			low= mid+1;
			   		}
			   		if(value<a[mid]) {
			   			high= mid-1;
			   		}
			   	}
		   return -1;
		}
		
	
	
	
	
	
	public static void main(String[] args) {
		int [] a= {2,1,4,3,5,6,7,99,9};
		BubbleSort b1=new BubbleSort();
		b1.bubbleSort( a);
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		
		System.out.println("     "+b1.binarySearch(a,99));;
	}
	
}








