package quickSort;

public class QuickSort {
	
	public static void quikSort( int[] a, int f, int l ) {
		
		if( f < l) {
			
			int p = partitition(  a, f, l ) ;
			 quikSort(  a,  f,  p - 1 );
			 quikSort(  a,  p + 1,  l );
		}
		
	}
	
	public static int partitition( int[] a, int f, int l ) {
		
		int pivot ;
		int sPointer ;
		
		pivot = a[ l ] ;
		sPointer = f - 1 ;
		
		for( int j = f ; j < l ; j++ ){
			
			if( a[j] <= pivot ) {
				
				sPointer++ ;
				int temp = a[sPointer];
				
				a[sPointer] = a[j];
				a[j] = temp ;
			}
			
		}
		
		sPointer++ ;
		int temp = a[sPointer];
		a[sPointer] = a[l];
		a[l] = temp ;
		
		return sPointer ;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = { 7, 6, 5, 4, 3, 2, 1 } ;  
		quikSort(  a, 0, a.length - 1 );
		
		
	}
}
