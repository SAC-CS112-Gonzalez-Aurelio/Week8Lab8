import java.util.Arrays;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] intArray = new int[]{123, 456, 479, 135, 246, 135} ;
		System.out.println(Arrays.toString(intArray));
		int sum = 0;
		for (int i = 0; i < intArray.length; i++){
		      sum = sum + intArray[i];
		}
		double average = sum/intArray.length;
		System.out.println("average: " + average);
		
	}

}

