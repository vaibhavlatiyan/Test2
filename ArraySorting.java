import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		//Decide size of the array
		System.out.print("Enter the size of array: ");
		int sizeOfArray = Integer.parseInt(scan.nextLine());
		
		int array[] = new int[sizeOfArray];
		for (int count = 0; count < array.length; count++) {
			System.out.print("Enter the number : ");
		        array[count] = Integer.parseInt(scan.nextLine());
		}
		
		int temp;
		
		 for (int count = 0; count < sizeOfArray; count++) {
	            for (int j = count + 1; j < sizeOfArray; j++) {
	                if (array[count] > array[j]) {
	                    temp = array[count];
	                    array[count] = array[j];
	                    array[j] = temp;
	                    }
	            }
	        }
		 
	System.out.print("Sorted Array is :");
    for (int count = 0; count < sizeOfArray; count++){
        System.out.print(array[count] + " ");
    }
  
}
}

		
	

