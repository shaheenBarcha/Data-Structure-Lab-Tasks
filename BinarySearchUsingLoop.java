package DSTheory;

import java.util.Scanner;

public class BinarySearchUsingLoop {

	public static void main(String[] args) {
		
		int[] array = new int[15];
		int start = 0;
		int end = array.length;
		int mid = start+end/2;
		int target;
		int check = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers for Array : ");
		
	for(int i = 0;i<array.length;i++)
	{
		array[i] = input.nextInt();
		
	}
	System.out.println("Enter Target : ");
	target = input.nextInt();
	
	for(int i = start;i<array.length;i++)
	{
	
		if(array[i] > array[i+1])
		{
			System.out.println("Invalid Array!!! Please Input sorted One : ");
			break;
		}
		if(array[mid] > target)
		{
			start = mid;
			
		}
		else if(array[mid] == target)
		{
		check = array[i];
		System.out.println("Index : "+i);
		break;
		}
	}
	System.out.println(check);
	}

}
