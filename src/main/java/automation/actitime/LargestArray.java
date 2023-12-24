package automation.actitime;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= { 50,350,30,20,800};
int max=arr[0];
System.out.println(max);
for (int i=0;i<=arr.length-1;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
		
	}
}
System.out.println("Largest number is : "+max);
	}
}

