package DSTheory;

import java.util.Scanner;

public class SmallestAndGreatestNumber {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers for Array : ");
		for(int i = 0;i<array.length;i++)
		{
			array[i] = input.nextInt();
		}
		check(array);

	}
	
	public static void check(int[] array)
	{
		int largest = 0;
		int smallest = 0;
		int index = -1;
		int Scount = 0;
		int Lcount = 0;
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] > array[i+1])
			{
				largest = array[i];
				array[i] = array[i+1];
				array[i+1] = largest;
				
			}
			else if(array[i] < array[i+1])
			{
				smallest = array[i];
				array[i] = array[i+1];
				array[i+1] = smallest;
				
			}
		}
		for(int i = 0;i<array.length;i++)
		{
			if(largest == array[i])
			{
				Lcount++;
			}
			else if(smallest == array[i])
			{
				Scount++;
			}
		}
		
		
		System.out.println("Largest number : "+largest +"Repetition : "+Lcount);
		System.out.println("Smallest Nummber : "+smallest+"Repetition : "+Scount);
	}

}
