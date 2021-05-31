/*Finding duplicates in an array in which all the values are less than length of the array, 
 * in O(N) RTC.
 * By using absolute values .*/
public class DuplicatesArrayAbosoluteValues {

	public static void main(String[] args) {
		int[]a= {2,3,1,2,4,3};
		
		for(int i=0;i<a.length;i++)
		{
		if(a[Math.abs(a[i])]>=0)
			a[Math.abs(a[i])]=-a[Math.abs(a[i])];
		else
			System.out.println("The repeated element is: "+Math.abs(a[i]));
		}
	}
}
