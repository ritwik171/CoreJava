import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int arr[]=new int[] {12,45,67,8,66,0,0,129,89};
		for(int z:arr)
			System.out.println(z);
		
		int sum=0;
		for(int z:arr)
		{
			sum=sum+z;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+(sum/arr.length));
		
		int max=arr[0];
		int min=arr[0];
		for(int z:arr)
		{
			if(z>max)
				max=z;
			if(z<min)
				min=z;
		}
		System.out.println("Maximum score is "+max);
		System.out.println("Minimum score is "+min);
		

		
		
		
		int century=0;
		for(int z:arr)
		{
			if(z>=100)
				century++;
		}
		System.out.println("No of Century "+century);
		
		Arrays.sort(arr);
	}

}
