package DSTheory;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int target;
		int[] array = new int[9];
		int increment = 0;
		int index;
		
		System.out.println("Enter numbers for Array : ");
		
		for(int i = 0;i<array.length;i++)
		{
			
		array[i] = input.nextInt();
		
		}
		
		System.out.println("Enter Your Target : ");
		target = input.nextInt();

		for(int i = 0;i<array.length;i++)
		{
			if(target == array[i])
			{
				increment++;
				System.out.println("Number Exists at Index : "+i);

			}
			
		}
		System.out.println(increment+" Times Exists :");

	}

}
