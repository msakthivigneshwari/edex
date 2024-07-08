import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}	

	}

}
