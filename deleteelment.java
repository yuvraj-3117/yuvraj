package ARRAYSINJAVA;
import java.util.Scanner;
public class deleteelment {

	public static void main(String[] args) {
		
		
		Scanner sc  = new  Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
			System.out.println("enter element in array ");
			for(int i =0; i<size; i++)
			{
				a[i]= sc.nextInt();
			}
			System.out.println("enter location in aaray");
			int loc = sc.nextInt();
			for(int i=loc;  i<size-1 ; i++)
			{
				a[i]=a[i+1];
				
			}
			size--;
				
			
	for(int i =0; i<size; i++)
	{
		System.out.print(a[i]+" ");
		
		
}}}
