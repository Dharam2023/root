
public class ArrayPr {

	public static void main(String[] args)
	{
		int arr[];
		arr=new int[3];
		arr[0]=30;
		arr[1]=60;
		arr[2]=50;
		String ar[]= {"balli","lucky","titni"};
	int i,j;
	for(j=0;j<ar.length;j++)
	{
		System.out.println(ar[j]);
	}
	int sum=arr[0]+arr[1]+arr[2];
	System.out.println( "the array value sum="+sum);
	for(i=0;i<arr.length;i++)
	{
	System.out.println( "the array values are"+arr[i]);

	}
	System.out.println(arr.length);

	}

}
