package practiceproject;
import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Array size: ");	
	int n=sc.nextInt();
		int arr[]=new int[n];
	    int comp[]=new int[n];int max=0;
	    System.out.println("Enter "+n+" numbers: ");
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{  int  count=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					if(comp[j]>count)
					{
						count=comp[j];
					}
					
				}
			}
			comp[i]=count+1;
			
			if(comp[i]>count)
			{
				max=comp[i];
			}
			
		}
		System.out.println("Length of longest increasing subsequence is:  "+max);
		
	}

}
