package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		int length = a.length;
		int[] z= new int[7];
		for (int i=0;i<length;i++) {
			z[i]=a[i];
			
		}
		Arrays.sort(a);
		for (int i=0;i<length;i++) {
			System.out.println(a[i]);
		}
	   System.out.println("/////////////////////////////////////////");
	   for (int i=0;i<length;i++) {
			System.out.println(z[i]);
		}
	   System.out.println("/////////////////////////////////////////");
	   for (int i=0;i<length;i++) {
			if(z[i]==i)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			
		}
	   
	   System.out.println("/////////////////////////////////////////");
	   for (int i=0;i<length;i++) {
		   if(z[i]==i)
			{
				System.out.println("True");
				break;
			}
			else
			{
				System.out.println("False");
			}
		   
	   }
	}
}


//System.out.println(length);
		/*System.out.println(length);
		System.out.println(arr[]);
		Arrays.sort(arr);*/
		