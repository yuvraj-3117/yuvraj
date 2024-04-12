package ARRAYSINJAVA;

   import java.util.Scanner;

    public class accendingorder {

	 public static void main(String[] args) 
	 {
		 int a[] = {20,10,40,30,34};
		 int temp;
	//	 int l =a.length;
		 
		 for(int i=0;i<a.length;i++)
			 
		 {
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])                   //a[i]<a[j]; decending ke liye
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
		}}}	
		
		for(int i=0; i<a.length;i++)
			
		{
			System.out.print(a[i]+" ");
			                            //System.out.println("second largrst number is"+a[l-2]);
		}}}