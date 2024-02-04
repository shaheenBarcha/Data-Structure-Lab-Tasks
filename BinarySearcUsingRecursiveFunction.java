package DSTheory;

public class BinarySearcUsingRecursiveFunction {

	public static int Search(int[] array,int target)
	{
		int start = 0;
		int end = array.length;
		int mid = start+end/2;
		/*
		if(target > array[mid])
		{
			return Search(array,target);
		}
		else*/if(target > array[mid])
		{
			return Search(array,target);
		}
		else
		{
		return mid;
	}
	}
	public static void main(String[] args) {
		
	int[] array = {10,20,30,35,55,70,555,999};
	
	System.out.println("Index : "+Search(array,10));

	}

}
