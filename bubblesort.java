import java.util.*;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj=new Scanner(System.in);

      System.out.println("enter the array size");
       int s= obj.nextInt();
       int a[]=new int[s];
       System.out.println("enter the element in array");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=obj.nextInt();
       } 
      bubblesort1(a);
	}
	public static void bubblesort1(int b[])
	{
		for(int i=b.length-1;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(b[j]>b[j+1])
				{
				int temp;
				temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
				}
				
			}
			
		}
		System.out.println("sorted elements are");
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}

}
}